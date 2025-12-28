package org.grp8.duan.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentStatusHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointments appointment;

    private String oldStatus;
    private String newStatus;

    @ManyToOne
    @JoinColumn(name = "changed_by")
    private Users changedBy;

    private LocalDateTime changedAt = LocalDateTime.now();
}
