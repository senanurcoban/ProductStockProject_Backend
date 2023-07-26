package com.example.demo.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
