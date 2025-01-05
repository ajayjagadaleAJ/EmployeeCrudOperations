package com.mongo.crud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.crud.Model.Employee;
import com.mongo.crud.Repository.EmployeeRepository;

@Service
public class EmployeeService  {

    @Autowired
    private EmployeeRepository employeeRepository ;

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }


    public Optional<Employee> findById(int empid){
        return employeeRepository.findById(empid);
    }

    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    public Employee update(Employee employee)
    {
        return employeeRepository.save(employee);

    }

    public void deleteById(int empId)
    {
        employeeRepository.deleteById(empId);
    }




}
