package com.assignment.UniversityEventManagement.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer StudentId;
    @Pattern(regexp = "^[A-Z][a-z]*$")
    private String firstName;
    private String lastName;

    @Min(value = 18)
    @Max(value = 25)
    private Integer age;
    private Department department;

    @OneToOne
    @JoinColumn(name = "fk_eventId")
    Event event;
}
