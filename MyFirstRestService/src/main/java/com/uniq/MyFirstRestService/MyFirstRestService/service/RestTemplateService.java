package com.uniq.MyFirstRestService.MyFirstRestService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.Employee;

@Service
public class RestTemplateService {

    private List<Employee> employeeList = new ArrayList<>();

    public RestTemplateService() {
        // Initialize with dummy data
        employeeList.add(new Employee("John Doe", 50000, 30));
        employeeList.add(new Employee("Jane Smith", 60000, 28));
        employeeList.add(new Employee("Michael Johnson", 55000, 35));
        employeeList.add(new Employee("Emily Davis", 70000, 32));
    }

    public String getHelloWorld() {
        return "Hello, World!";
    }

    public List<Employee> getLocalEmployeeDetails() {
        return new ArrayList<>(employeeList);
    }

    public Employee addEmployeeToLocalList(Employee employee) {
        employeeList.add(employee);
        return employee;
    }

    public Employee updateEmployeeInLocalList(int index, Employee updatedEmployee) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.set(index, updatedEmployee);
            return updatedEmployee;
        }
        return null; // Employee not found
    }

    public void deleteEmployeeFromLocalList(int index) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove(index);
        }
    }
}
