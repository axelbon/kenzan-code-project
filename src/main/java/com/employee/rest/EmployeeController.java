package com.employee.rest;

import com.employee.service.IEmployeeService;
import com.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="api/v1")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(value="employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }

    @GetMapping(value = "employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable(value="id") Long id) {
        System.out.println(id);
        return employeeService.getEmployee(id);
    }

    @PostMapping(value="employees")
    public Employee addEmployee(@RequestBody Employee employee)  {
        System.out.println(employee);
        return employeeService.addEmployee(employee);
    }

    @PutMapping(value="employees")
    public Employee updateEmployee(@RequestBody Employee employee)  {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping(value="employees/{id}" )
    public boolean deleteEmployee(@PathVariable(value="id") Long id) {
        employeeService.removeEmployee(id);
        return true;
    }
}
