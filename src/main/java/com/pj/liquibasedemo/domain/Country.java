package com.pj.liquibasedemo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
