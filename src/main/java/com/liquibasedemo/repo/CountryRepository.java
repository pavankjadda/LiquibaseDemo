package com.liquibasedemo.repo;

import com.liquibasedemo.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long>
{
}
