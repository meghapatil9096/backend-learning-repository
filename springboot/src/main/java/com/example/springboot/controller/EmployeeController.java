package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

   @GetMapping("/get/{id}")
   public ResponseEntity<Employee> get(@PathVariable int id){
       return ResponseEntity.ok(employeeService.get(id));
   }

   @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
       return ResponseEntity.ok(employeeService.save(employee));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> update(@RequestBody Employee employee, @PathVariable int id){
       return ResponseEntity.ok(employeeService.update(employee, id));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> delete(@PathVariable int id){
       return ResponseEntity.ok(employeeService.delete(id));
    }

}
