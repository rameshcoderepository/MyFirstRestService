package com.uniq.MyFirstRestService.MyFirstRestService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.uniq.MyFirstRestService.MyFirstRestService.bean.Employee;

@Service
public class RestSampleService {

    private List<Employee> employeeList = new ArrayList<>();
    private long currentId = 1; // For generating unique IDs (if needed)

    public RestSampleService() {
        // Initialize with dummy data
        employeeList.add(new Employee("John Doe", 50000, 30));
        employeeList.add(new Employee("Jane Smith", 60000, 28));
        employeeList.add(new Employee("Michael Johnson", 55000, 35));
        employeeList.add(new Employee("Emily Davis", 70000, 32));
    }

    public String getHelloWorldForObject() {
        return "Hello, World!";
    }

    public ResponseEntity<String> getHelloWorldForEntity() {
        return ResponseEntity.ok("Hello, World!");
    }

    public List<Employee> getEmployeeDetailsForObject() {
        return new ArrayList<>(employeeList);
    }

    public ResponseEntity<List<Employee>> getEmployeeDetailsForEntity() {
        return ResponseEntity.ok(new ArrayList<>(employeeList));
    }

    public Employee createEmployeeForObject(Employee employee) {
        // No ID handling as Employee doesn't have an ID field
        employeeList.add(employee);
        return employee;
    }

    public ResponseEntity<Employee> createEmployeeForEntity(Employee employee) {
        // No ID handling as Employee doesn't have an ID field
        employeeList.add(employee);
        return ResponseEntity.ok(employee);
    }

    public void updateEmployee(long index, Employee updatedEmployee) {
        if (index >= 0 && index < employeeList.size()) {
            Employee existingEmployee = employeeList.get((int) index);
            existingEmployee.setEmpName(updatedEmployee.getEmpName());
            existingEmployee.setEmpSalary(updatedEmployee.getEmpSalary());
            existingEmployee.setEmpAge(updatedEmployee.getEmpAge());
        }
    }

    public void deleteEmployee(long index) {
        if (index >= 0 && index < employeeList.size()) {
            employeeList.remove((int) index);
        }
    }
}
