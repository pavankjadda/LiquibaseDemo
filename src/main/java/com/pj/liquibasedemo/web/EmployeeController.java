package com.pj.liquibasedemo.web;

import com.pj.liquibasedemo.domain.Employee;
import com.pj.liquibasedemo.domain.EmploymentType;
import com.pj.liquibasedemo.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Provides API endpoints for Employee and related operations
 *
 * @author Pavan Kumar Jadda
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController
{
  private final EmployeeRepository employeeRepository;

  public EmployeeController(EmployeeRepository employeeRepository)
  {
    this.employeeRepository = employeeRepository;
  }


  /**
   * Finds all employees in the database
   *
   * @return List of employees
   *
   * @author Pavan Kumar Jadda
   * @since 1.0.0
   */
  @GetMapping(path = "/list")
  public List<Employee> findAll()
  {
    return employeeRepository.findAll();
  }

  /**
   * Creates a new employee in the database
   *
   * @return Newly created employee
   *
   * @author Pavan Kumar Jadda
   * @since 1.0.0
   */
  @GetMapping(path = "/create")
  public Employee createEmployee()
  {
    Employee employee = new Employee();
    employee.setFirstName("John");
    employee.setLastName("Reese");
    employee.setEmail("john.reese@example.com");
    employee.setPhone("903-888-9999");
    employee.setEmploymentType(EmploymentType.CONTRACTOR);
    return employeeRepository.saveAndFlush(employee);
  }
}
