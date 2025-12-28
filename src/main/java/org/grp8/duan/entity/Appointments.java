package org.grp8.duan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Users patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctors doctor;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private doctorSchedule schedule;

    private LocalDate appointmentDate;
    private LocalTime startTime;
    private LocalTime endTime;

    private String status;
}
