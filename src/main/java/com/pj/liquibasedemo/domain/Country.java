package com.pj.liquibasedemo.domain;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Entity class that maps to country table in the database.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@Entity
@Table(name = "country")
@Data
public class Country
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "iso_code")
    private String isoCode;

    @Column(name = "iso_code_test")
    private String isoCodeTest;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
