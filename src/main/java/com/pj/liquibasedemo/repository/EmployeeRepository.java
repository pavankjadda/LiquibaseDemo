package com.pj.liquibasedemo.repository;

import com.pj.liquibasedemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
