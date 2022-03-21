package com.pj.liquibasedemo.repository;

import com.pj.liquibasedemo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Country Repository interface that gets, saves, updates and deletes Country objects.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public interface CountryRepository extends JpaRepository<Country, Long>
{
}
