package com.liquibasetest.repo;

import com.liquibasetest.model.Country;
import com.liquibasetest.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StateRepository extends JpaRepository<State, Long>
{
    Optional<State> findByNameAndCountry(String name, Country country);

    Optional<State> findByName(String name);
}
