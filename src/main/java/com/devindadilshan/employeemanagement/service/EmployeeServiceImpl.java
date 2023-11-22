package com.devindadilshan.employeemanagement.service;

import com.devindadilshan.employeemanagement.collection.Employee;
import com.devindadilshan.employeemanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(String id, Employee employee) {
        Employee employeeVar = employeeRepository.findById(id).get();
        employeeVar.setFirstName(employee.getFirstName());
        employeeVar.setLastName(employee.getLastName());
        employeeVar.setAge(employee.getAge());
        employeeVar.setSalary(employee.getSalary());
        employeeVar.setDepartment(employee.getDepartment());
        return employeeVar;
    }

    @Override
    public Employee deleteEmployee(String id) {
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return employee;
    }
}
