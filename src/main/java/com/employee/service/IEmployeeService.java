package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    public List<Employee> findAll();
    public Optional<Employee> getEmployee(Long id);
    public Employee addEmployee(Employee employee);
    public void removeEmployee(Long id);
    public Employee updateEmployee(Employee employee);
}
