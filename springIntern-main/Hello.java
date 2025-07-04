package com.example.springInternDays.Controller;
import com.example.springInternDays.Models.Employee;
import com.example.springInternDays.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Hello {

    @Autowired
    HelloService hel;

    @GetMapping("/api")
    public String getGreetings() {
        return hel.getmethod();
    }

    @PutMapping("/put")
    public String Putmethod() {
        return hel.Putmethod();
    }

    @DeleteMapping("/del")
    public String deletegreet() {
        return hel.Deletemethod();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return hel.getAllEmployees();
    }

    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee emp) {
        hel.addEmployee(emp);
        return "Employee added successfully";
    }

}