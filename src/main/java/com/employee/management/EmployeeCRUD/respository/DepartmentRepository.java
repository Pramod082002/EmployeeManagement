package com.employee.management.EmployeeCRUD.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.employee.management.EmployeeCRUD.model.Department;

public interface DepartmentRepository extends MongoRepository<Department, String>  {
    Department findByDepartmentId(String id);
    boolean existsByDepartmentId(String id);
    void deleteByDepartmentId(String id);
}
