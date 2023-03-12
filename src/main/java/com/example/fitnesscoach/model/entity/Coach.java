package com.example.fitnesscoach.model.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Setter
@Getter
@Data
@Entity
@Table(name = "coaches")
public class Coach {
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

    @Email(message = "Invalid email address")
    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false, columnDefinition = "ENUM('Male', 'Female', 'Other')")
    private String gender;

    @Column
    private int age;

    @Column
    private int yearsOfExperience;

    @Column(nullable = false, unique = true)
    @Pattern(regexp = "^05[0-9][1-9](\\s)?(\\d{3})(\\s)?(\\d{2})(\\s)?(\\d{2})$", message = "Invalid phone number format")
    private String phoneNumber;

    @Column(nullable = false, columnDefinition = "ENUM('1 month', '2 month', '3 month', '4 month', '5 month', " +
            "'6 month', '7 month', '8 month', '9 month', '10 month', '11 month', '1 year', '2 year')")
    private String coachingPackages;


}
