package com.liquibasedemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "country")
@Data
public class Country
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "iso_code")
    private String isoCode;


    @ManyToOne
    @JoinColumn(name = "region_id")
    @JsonIgnore
    private Region region;

}
