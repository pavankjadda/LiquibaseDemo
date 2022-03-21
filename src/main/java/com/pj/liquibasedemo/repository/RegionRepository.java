package com.pj.liquibasedemo.repository;

import com.pj.liquibasedemo.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Region Repository interface that gets, saves, updates and deletes Region objects.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public interface RegionRepository extends JpaRepository<Region, Long>
{
  Optional<Region> findByName(String name);
}
