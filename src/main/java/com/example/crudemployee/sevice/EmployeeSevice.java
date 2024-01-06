package com.example.crudemployee.sevice;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeSevice implements IEmployeeSevice {
    public static Map<Integer, Employee> employees;
    static {
        employees = new HashMap<>();
        employees.put(1, new Employee(1,"Tuyên","nguyenductuyen@gmail.com","18-03-2004","nam",392812901,"Crud-Car","Back end"));
        employees.put(2, new Employee(2,"Tuấn anh","nguyenductuyen@gmail.com","18-03-2004","nam",392812901,"Crud-User","Trưởng nhóm"));
        employees.put(3, new Employee(3,"Nguyên","nguyenductuyen@gmail.com","18-03-2004","nam",392812901,"Crud-User","Back end"));

    }
    @Override
    public List<Employee> finAll(){
        return new ArrayList<>(employees.values());
    }
    @Override
    public void add(Employee employee){
        employees.put(employee.getId(), employee);
    }
    @Override
    public Employee fileById(int id){
        return employees.get(id);
    }
    @Override
    public void update(int id,Employee employee){
        employees.put(id, employee);
    }
    @Override
    public void delete(int id){
        employees.remove(id);
    }
}
