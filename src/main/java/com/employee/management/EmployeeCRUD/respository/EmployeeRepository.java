package com.employee.management.EmployeeCRUD.respository;

import org.springframework.stereotype.Repository;
import com.employee.management.EmployeeCRUD.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
