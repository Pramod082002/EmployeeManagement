package com.employee.management.EmployeeCRUD.controller;

import com.employee.management.EmployeeCRUD.model.Department;
import com.employee.management.EmployeeCRUD.respository.DepartmentRepository;
import com.employee.management.EmployeeCRUD.service.SequenceGeneratorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/dept")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    // Create
    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        department.setCreatedAt(LocalDateTime.now());
        department.setUpdatedAt(LocalDateTime.now());
        department.setDepartmentId(sequenceGeneratorService.generateSequence(Department.SEQUENCE_NAME)+"");
        Department createdDepartment = departmentRepository.save(department);
        return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
    }

    // Read
    @GetMapping("/department")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentRepository.findAll();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable String id) {
        Department department = departmentRepository.findByDepartmentId(id);
        if (department != null) {
            return new ResponseEntity<>(department, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update
    @PutMapping("/department/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable String id, @RequestBody Department updatedDepartment) {
        Department existingDepartment = departmentRepository.findByDepartmentId(id);
        if (existingDepartment != null) {
            System.out.println(existingDepartment.getDepartmentName());
            //existingDepartment.setDepartmentId(updatedDepartment.getDepartmentId());
            existingDepartment.setDepartmentName(updatedDepartment.getDepartmentName());
            existingDepartment.setUpdatedAt(LocalDateTime.now());
            departmentRepository.deleteByDepartmentId(id);
            Department updated = departmentRepository.save(existingDepartment);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete
    @DeleteMapping("/department/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable String id) {
        if (departmentRepository.existsByDepartmentId(id)) {
            departmentRepository.deleteByDepartmentId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
