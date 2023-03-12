package com.example.fitnesscoach.model.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false,unique = true)
    private String username;

    @Column(nullable = false)
    private String userFirstName;

    @Column(nullable = false)
    private String userLastName;

    @Column(nullable = false)
    private String password;

    @Email
    @Column(nullable = false,unique = true)
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$\n", message = "Invalid mail address")
    private String email;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "/^(05)([0-9]{2})\\s?([0-9]{3})\\s?([0-9]{2})\\s?([0-9]{2})$/\n", message = "Invalid phone number format")
    private String phoneNumber;

    @Column(nullable = false, columnDefinition = "ENUM('Male', 'Female', 'Other')")
    private String gender;

    @Column
    private int age;

    @Column
    private float height;

    @Column
    private float weight;

    @Column
    private float neck_circumference;

    @Column
    private float waist_circumference;

    @Column
    private float hip_circumference;

    @Column
    private float bmiIndex;
    public void updateBmiIndex(){
        float heightMeters = height / 100.0f;
        float waistMeters = waist_circumference / 100.0f;
        float hipMeters = hip_circumference / 100.0f;
        float waistHipRatio = waistMeters / hipMeters;

        bmiIndex = weight / (heightMeters * heightMeters) * (1.0f - 0.0018f * (neck_circumference - waist_circumference) - 0.0125f * (waistHipRatio) + 0.0262f * (heightMeters)) - 0.005f * age;
    }

    @Column(nullable = false, columnDefinition = "ENUM('Sedentary', 'Lightly active', 'Moderately active', Very active, 'Extra active')")
    private String activity_level;

    @Column(nullable = false, columnDefinition = "ENUM('Lose weight', 'Gain muscle', 'Improve fitness', 'Other')")
    private String goal;

    @Column(nullable = false, columnDefinition = "ENUM('1 month', '2 month', '3 month', '4 month', '5 month', " +
            "'6 month', '7 month', '8 month', '9 month', '10 month', '11 month', '1 year', '2 year')")
    private String coachingPlan;

    @Column
    private java.time.LocalDate dateJoined;


    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Meal> meals;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Workout> workouts;

    @OneToMany(mappedBy = "sender", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "receiver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> receivedMessages;

    @OneToMany(mappedBy = "user")
    private List<UserForm> forms = new ArrayList<>();

}
