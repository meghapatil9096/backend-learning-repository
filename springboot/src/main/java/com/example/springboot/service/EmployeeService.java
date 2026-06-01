package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee get(int id);

    List<Employee> getAll();

    Employee save(Employee employee);

    Employee update(Employee employee, int id);

    Employee delete(int id);
}
