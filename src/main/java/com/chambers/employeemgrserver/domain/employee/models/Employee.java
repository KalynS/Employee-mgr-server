package com.chambers.employeemgrserver.domain.employee.models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//wants you to list object that will be id of this class

@Entity//JPA to save to the database
@NoArgsConstructor//Non Argument Constructor
@RequiredArgsConstructor//parameterized constructor
@Data// Getters and Setters
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;

    public String toString(){
        return String.format("%d %s %s %s", id, firstName,lastName,email );
    }

}
