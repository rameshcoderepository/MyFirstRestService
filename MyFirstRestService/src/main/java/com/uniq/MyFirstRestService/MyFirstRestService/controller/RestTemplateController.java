package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.Employee;
import com.uniq.MyFirstRestService.MyFirstRestService.service.RestTemplateService;

@RestController
@RequestMapping("/apiRest")
public class RestTemplateController {

    @Autowired
    private RestTemplateService restTemplateService;

    @GetMapping("/response")
    public String getResponse() {
        return restTemplateService.getHelloWorld();
    }

    @GetMapping("/employees")
    public List<Employee> getEmployeeDetails() {
        return restTemplateService.getLocalEmployeeDetails();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return restTemplateService.addEmployeeToLocalList(employee);
    }

    @PutMapping("/employees/{index}")
    public Employee updateEmployee(@PathVariable int index, @RequestBody Employee employee) {
        return restTemplateService.updateEmployeeInLocalList(index, employee);
    }

    @DeleteMapping("/employees/{index}")
    public void deleteEmployee(@PathVariable int index) {
        restTemplateService.deleteEmployeeFromLocalList(index);
    }
}
