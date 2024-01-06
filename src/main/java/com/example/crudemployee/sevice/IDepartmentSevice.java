package com.example.crudemployee.sevice;

import com.example.crudemployee.model.Department;

import java.util.List;

public interface IDepartmentSevice {
    List<Department> finAll();
    void add(Department department);
    Department fileById(int id);
    void update(int id,Department department);
    void delete(int id);
}
