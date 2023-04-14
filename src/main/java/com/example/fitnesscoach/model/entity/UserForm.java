package com.example.fitnesscoach.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "user_forms")
public class UserForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    @Column
    private java.time.LocalDate dateSubmitted;

}
