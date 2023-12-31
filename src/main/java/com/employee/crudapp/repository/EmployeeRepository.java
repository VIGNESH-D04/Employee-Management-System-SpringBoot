package com.employee.crudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.crudapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
