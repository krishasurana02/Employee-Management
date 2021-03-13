package com.getarrays.employee_manager.service;

import com.getarrays.employee_manager.exception.UserNotFoundException;
import com.getarrays.employee_manager.model.Employee;
import com.getarrays.employee_manager.repo.Employee_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class Employee_service {
    private final Employee_repo employee_repo;

    @Autowired
    public Employee_service(Employee_repo employee_repo) {
        this.employee_repo = employee_repo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employee_repo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employee_repo.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employee_repo.save(employee);
    }

    public Employee findEmployee(Long id){
        return employee_repo.findEmployeeById(id).orElseThrow(() -> new  UserNotFoundException("User by id="+ id +"was not found"));
    }

    public void deleteEmployee(Long id){
        employee_repo.deleteEmployeeById(id);
    }
}
