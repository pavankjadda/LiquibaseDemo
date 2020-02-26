package com.liquibasedemo.repository;

import com.liquibasedemo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>
{
}
