package com.pj.liquibasedemo.domain;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class that maps to employee table in the database.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Entity
@Table(name = "employee")
@Data
public class Employee
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "employment_type")
    @Convert(converter = EmploymentTypeConverter.class)
    private EmploymentType employmentType;

}
