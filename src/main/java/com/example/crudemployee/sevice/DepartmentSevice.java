package com.example.crudemployee.sevice;

import com.example.crudemployee.controller.DepartmentController;
import com.example.crudemployee.model.Department;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DepartmentSevice implements IDepartmentSevice {
    public static Map<Integer, Department> departments;
    static {
        departments = new HashMap<>();
        departments.put(1, new Department(1,"Trưởng nhóm ","người quản lý và giao nhiệm vụ cho các thành viên"));
        departments.put(2, new Department(2,"Back end ","người code chức năng"));
        departments.put(3, new Department(3,"Form end ","người code giao diện"));
    }
    @Override
    public List<Department> finAll(){
        return new ArrayList<>(departments.values());
    }
    @Override
    public void add(Department department){
        departments.put(department.getId(), department);
    }
    @Override
    public Department fileById(int id){
        return departments.get(id);
    }
    @Override
    public void update(int id,Department department){
        departments.put(id, department);
    }
    @Override
    public void delete(int id){
        departments.remove(id);
    }
}
