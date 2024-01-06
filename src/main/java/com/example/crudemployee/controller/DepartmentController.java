package com.example.crudemployee.controller;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.sevice.DepartmentSevice;
import com.example.crudemployee.sevice.IDepartmentSevice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;
import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    private final IDepartmentSevice departmentService=new DepartmentSevice();
    @GetMapping("")
    public String show(Model model) {
        List<Department> departments = departmentService.finAll();
model.addAttribute("department",departments);
return "/index";
    }
    @GetMapping("/add")
    public String add(Model model){
       model.addAttribute("department",new Department());
       return "/department/add";
    }
    @PostMapping("/save")
    public String saveDepartment(Department department){
        department.setId((int) (Math.random() * 100));
        departmentService.add(department);
        return "redirect:/department";
    }
    @GetMapping("/{id}/edit")
    public String editDepartment(@PathVariable int id, Model model){
     model.addAttribute("department",departmentService.fileById(id)) ;
return "/department/update";
    }
    @PostMapping("/update")
    public String updateDepartment(Department department){
        departmentService.update(department.getId(),department);
        return "redirect:/department";
    }

    @GetMapping("/{id}/remote")
    public String remoteDepartment(@PathVariable int id, Model model){
        model.addAttribute("department",departmentService.fileById(id)) ;
        return "/department/remote";
    }
    @PostMapping("/delete")
    public String deleteDepartment(Department department){
        departmentService.delete(department.getId());
        return "redirect:/department";
    }
    @GetMapping("/{id}/show")
    public String showDepartment(@PathVariable int id, Model model){
        model.addAttribute("department",departmentService.fileById(id)) ;
        return "/department/show";
    }
    }

