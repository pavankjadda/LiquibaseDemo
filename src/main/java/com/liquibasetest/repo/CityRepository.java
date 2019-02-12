package com.liquibasetest.repo;

import com.liquibasetest.model.City;
import com.liquibasetest.model.State;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long>
{
    Optional<City> findByNameAndState(String name, State state);

    Optional<City> findByName(String name);

    @Override
    Page<City> findAll(Pageable pageable);

}
