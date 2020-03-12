package com.employeeManagement.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employeeManagement.example.beans.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
