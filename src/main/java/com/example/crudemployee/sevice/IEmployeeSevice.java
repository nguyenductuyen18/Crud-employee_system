package com.example.crudemployee.sevice;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.model.Employee;

import java.util.List;

public interface IEmployeeSevice {
    List<Employee> finAll();
    void add(Employee employee);
    Employee fileById(int id);
    void update(int id,Employee employee);
    void delete(int id);
}
