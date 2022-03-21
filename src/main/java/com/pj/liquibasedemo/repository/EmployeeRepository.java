package com.pj.liquibasedemo.repository;

import com.pj.liquibasedemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Employee Repository interface that gets, saves, updates and deletes Employee objects.
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
