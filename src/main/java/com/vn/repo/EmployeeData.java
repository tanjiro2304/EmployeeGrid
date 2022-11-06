package com.vn.repo;

import com.vn.models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeData(){
        employeeList.add(new Employee(12312L, "Bruce", "Wayne", 345000D));
        employeeList.add(new Employee(12313L, "Clark", "Kent", 65500D));
        employeeList.add(new Employee(12314L, "John", "Stewart", 45000D));
        employeeList.add(new Employee(12315L, "Barry", "Allen", 25000D));
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
