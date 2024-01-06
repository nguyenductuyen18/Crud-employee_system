package com.example.crudemployee.controller;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.model.Employee;
import com.example.crudemployee.model.Project;
import com.example.crudemployee.sevice.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final IDepartmentSevice departmentService=new DepartmentSevice();
    private final IProjectSevice project=new ProjectSevice();
    private final IEmployeeSevice employeeSevice=new EmployeeSevice();
    @GetMapping("/employee")
    public String show(Model model) {
        List<Employee> employees = employeeSevice.finAll();
        model.addAttribute("employee",employees);



        return "/index";
    }
    @GetMapping("/add")
    public String add(Model model){
        List<Project> projects = project.finAll();
        model.addAttribute("project",projects);
        List<Department> departments = departmentService.finAll();
        model.addAttribute("department",departments);
        model.addAttribute("employee",new Employee());
        return "/employee/add";
    }
    @PostMapping("/save")
    public String saveEmployee(Employee employee){
        employee.setId((int) (Math.random() * 100));
        employeeSevice.add(employee);
        return "redirect:/employee/employee";
    }
    @GetMapping("/{id}/edit")
    public String editEmployee(@PathVariable int id, Model model){
        model.addAttribute("employee",employeeSevice.fileById(id)) ;
        return "/employee/update";
    }
    @PostMapping("/update")
    public String updateEmployee(Employee employee){
        employeeSevice.update(employee.getId(),employee);
        return "redirect:/employee/employee";
    }
    @GetMapping("/{id}/remote")
    public String remoteEmployee(@PathVariable int id, Model model){
        model.addAttribute("employee",employeeSevice.fileById(id)) ;
        return "/employee/remote";
    }
    @PostMapping("/delete")
    public String deleteEmployee(Employee employee){
        employeeSevice.delete(employee.getId());
        return "redirect:/employee/employee";
    }
    @GetMapping("/{id}/show")
    public String showEmployee(@PathVariable int id, Model model){
        model.addAttribute("employee",employeeSevice.fileById(id)) ;
        return "/employee/show";
    }
}
