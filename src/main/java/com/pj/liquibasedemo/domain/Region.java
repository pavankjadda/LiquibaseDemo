package com.pj.liquibasedemo.domain;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity class that maps to region table in the database.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Entity
@Table(name = "region")
@Data
public class Region
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
