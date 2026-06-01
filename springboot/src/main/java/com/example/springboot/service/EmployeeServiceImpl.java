package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee get(int id) {
        return employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Employee not found of id "+id) );
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee, int id) {
        Employee existingEmp =  employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found of id "+id));
        if(employee.getName()!=null) existingEmp.setName(employee.getName());
        if(employee.getDept()!=null) existingEmp.setDept(employee.getDept());
        if(employee.getAge()!=null) existingEmp.setAge(employee.getAge());

        return employeeRepository.save(existingEmp);
    }

    @Override
    public Employee delete(int id) {
        Employee emp =  employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found of id " + id));
        employeeRepository.deleteById(id);
        return emp;
    }

}
