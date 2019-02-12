package com.liquibasetest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "state")
@Data
public class State
{
    @javax.persistence.Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    @Length(max = 200, min = 2)
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;


    public State()
    {
    }

    public State(@Length(max = 100, min = 2) String name, String code, Country country)
    {
        this.name = name;
        this.code = code;
        this.country = country;
    }
}
