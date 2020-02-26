package com.pj.liquibasedemo.repository;

import com.pj.liquibasedemo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>
{
}
