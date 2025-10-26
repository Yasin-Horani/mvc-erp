package com.yasin.mvc_erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
//@RequestMapping(path = "employee")
public class EmployeeController {
    private final List<String> employees = Arrays.asList("Ik", "houw", "van", "Mohamad");

    @GetMapping(path = "employees")
    public List<String> getEmployees() {
        return employees;
    }

    @GetMapping(path = "")
    public String index() {
        return "employee";
    }

}
