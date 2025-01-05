package com.mongo.crud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.Exception.RecordNotFoundException;
import com.mongo.crud.Model.Employee;
import com.mongo.crud.Service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save") 
    public ResponseEntity<Employee> save (@RequestBody Employee employee)
    { 
         return ResponseEntity.ok(employeeService.save(employee));
    }

    @GetMapping("/findbyid/{empId}")
    public ResponseEntity<Optional<Employee>> getAll(@PathVariable int empId){
        return ResponseEntity.ok(employeeService.findById(empId));

    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeService.findAll());
    }

    @PutMapping("update/{empId}")
    public ResponseEntity<Employee> update(@PathVariable int empId, @RequestBody Employee employee) {
        
        Employee employee1 = employeeService.findById(empId).orElseThrow(() ->  new RecordNotFoundException("Employee #Id not exist"));

        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpEmail(employee.getEmpEmail());
        employee1.setEmpSalary(employee.getEmpSalary());

        return ResponseEntity.ok(employeeService.update(employee1));
        
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<List<Employee>> deleteById(@PathVariable int empId) {
    employeeService.deleteById(empId);
    // return ResponseEntity.ok("Employee Deleted succesfully");
    return ResponseEntity.ok(employeeService.findAll());
    
    }

   


}
