package com.getarrays.employee_manager;

import com.getarrays.employee_manager.model.Employee;
import com.getarrays.employee_manager.service.Employee_service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class Employee_resource {
    private final Employee_service employee_service;

    public Employee_resource(Employee_service employee_service) {
        this.employee_service = employee_service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees=employee_service.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        Employee employee=employee_service.findEmployee(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newemployee=employee_service.addEmployee(employee);
        return new ResponseEntity<>(newemployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        Employee updateemployee=employee_service.updateEmployee(employee);
        return new ResponseEntity<>(updateemployee, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employee_service.deleteEmployee(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
