package com.employee.service;

import com.employee.dao.IEmployeeDao;
import com.employee.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public List<Employee> findAll() {
        return (List<Employee>) employeeDao.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(Long id) {
        return employeeDao.findById(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setStatus("active");
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.save(employee);
    }


    @Override
    public void removeEmployee(Long id) {
        Optional<Employee> employee = employeeDao.findById(id);
        employeeDao.deleteById(id);
        System.out.println(employee.toString());
    }
}
