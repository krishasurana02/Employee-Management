package com.getarrays.employee_manager.repo;

import com.getarrays.employee_manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Employee_repo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
