package com.employee.management.EmployeeCRUD.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "Department")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    
  @Id
  @Indexed(unique = true)
  private String departmentId;

  private String departmentName;

  @CreationTimestamp
  private LocalDateTime createdAt;

  @UpdateTimestamp
  private LocalDateTime updatedAt;

}
