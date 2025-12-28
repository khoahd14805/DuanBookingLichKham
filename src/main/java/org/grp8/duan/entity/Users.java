package org.grp8.duan.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String fullName;
    private String email;
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles role;
    private String address;
    private String phone;
}
