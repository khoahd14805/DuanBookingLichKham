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
public class Notifications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users receiver;

    private String title;
    private String type;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Long relatedId;

    private LocalDateTime createdAt = LocalDateTime.now();
}

