package com.employee.management.EmployeeCRUD.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "database_sequences")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseSequence {

    @Id
    private String id;

    private long seq;
}