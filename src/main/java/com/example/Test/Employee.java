package com.example.Test;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String description) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
