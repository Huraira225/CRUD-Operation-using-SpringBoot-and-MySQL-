package com.testProject.SpringBoot.repository;
import com.testProject.SpringBoot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}


