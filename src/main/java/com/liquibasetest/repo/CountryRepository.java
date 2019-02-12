package com.liquibasetest.repo;

import com.liquibasetest.model.Country;
import com.liquibasetest.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long>
{
    Optional<Country> findByNameAndRegion(String name, Region region);

    Optional<Country> findByName(String name);
}
