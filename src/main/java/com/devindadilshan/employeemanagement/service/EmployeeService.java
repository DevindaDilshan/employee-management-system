package com.devindadilshan.employeemanagement.service;

import com.devindadilshan.employeemanagement.collection.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(String id, Employee employee);

    Employee deleteEmployee(String id);
}
