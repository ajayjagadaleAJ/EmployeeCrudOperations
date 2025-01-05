package com.mongo.crud.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.crud.Model.Employee;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

}
