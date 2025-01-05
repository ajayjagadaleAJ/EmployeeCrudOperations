package com.mongo.crud.Model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class Employee {

    @Id
    private int empId;
    private String empName;
    private String empEmail;
    private String empSalary;
    

}
