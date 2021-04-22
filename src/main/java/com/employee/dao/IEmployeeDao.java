package com.employee.dao;

import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDao extends JpaRepository<Employee, Long> {}
