package com.devindadilshan.employeemanagement.controller;

import com.devindadilshan.employeemanagement.collection.Employee;
import com.devindadilshan.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/create")
    public Employee insert(@RequestBody Employee employee) {

        return employeeService.addEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee update(@PathVariable String id, @RequestBody Employee employee) {
       return employeeService.updateEmployee(id,employee);
    }

    @DeleteMapping("/delete/{id}")
    public Employee delete(@PathVariable String id) {
        return employeeService.deleteEmployee(id);
    }


}
