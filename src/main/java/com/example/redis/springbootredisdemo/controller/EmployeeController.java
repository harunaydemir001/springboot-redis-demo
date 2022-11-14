package com.example.redis.springbootredisdemo.controller;

import com.example.redis.springbootredisdemo.model.Employee;
import com.example.redis.springbootredisdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public void saveEmployee(@RequestBody Employee employee){employeeRepository.saveEmployee(employee);}
    @GetMapping("/employees")
    public List<Employee> findAll(){return  employeeRepository.findAll();}
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable("id") Integer id){return employeeRepository.findById(id);}
    @PutMapping("/employees")
    public void update(@RequestBody Employee employee){employeeRepository.update(employee);}
    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Integer id){employeeRepository.delete(id);}

}
