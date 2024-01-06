package com.example.crudemployee.controller;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.model.Employee;
import com.example.crudemployee.model.Project;
import com.example.crudemployee.sevice.EmployeeSevice;
import com.example.crudemployee.sevice.IEmployeeSevice;
import com.example.crudemployee.sevice.IProjectSevice;
import com.example.crudemployee.sevice.ProjectSevice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/project")
public class ProjectController {
    private final IProjectSevice projectSevice=new ProjectSevice();
    @GetMapping("/project")
    public String show(Model model) {
        List<Project> projects = projectSevice.finAll();
        model.addAttribute("project",projects);
        return "/index";
    }
    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("project",new Project());
        return "/project/add";
    }
    @PostMapping("/save")
    public String saveProject(Project project){
        project.setId((int) (Math.random() * 100));
        projectSevice.add(project);
        return "redirect:/project/project";
    }
    @GetMapping("/{id}/edit")
    public String editProject(@PathVariable int id, Model model){
        model.addAttribute("project",projectSevice.fileById(id)) ;
        return "/project/update";
    }
    @PostMapping("/update")
    public String updateProject(Project project){
        projectSevice.update(project.getId(),project);
        return "redirect:/project/project";
    }
    @GetMapping("/{id}/remote")
    public String remoteProject(@PathVariable int id, Model model){
        model.addAttribute("project",projectSevice.fileById(id)) ;
        return "/project/remote";
    }
    @PostMapping("/delete")
    public String deleteProject(Project project){
        projectSevice.delete(project.getId());
        return "redirect:/project/project";
    }
    @GetMapping("/{id}/show")
    public String showProject(@PathVariable int id, Model model){
        model.addAttribute("project",projectSevice.fileById(id)) ;
        return "/project/show";
    }
}
