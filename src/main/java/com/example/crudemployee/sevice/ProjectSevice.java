package com.example.crudemployee.sevice;

import com.example.crudemployee.model.Project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectSevice implements IProjectSevice{
    public static Map<Integer, Project> projects;
static{
    projects = new HashMap<>();
    projects.put(1,new Project(1,"Crud-Car","tạo 1 xe ô tô","18-03-2023","22-10-2025"));
    projects.put(2,new Project(2,"Crud-User","tạo thông tin 1 người","02-08-2023","12-11-2028"));
    projects.put(3,new Project(3,"Crud-Car","tạo 1 xe ô tô","28-07-2023","11-7-2026"));
}
    @Override
    public List<Project> finAll() {
        return new ArrayList<>( projects.values());
    }

    @Override
    public void add(Project project) {
 projects.put(project.getId(), project);
    }

    @Override
    public Project fileById(int id) {
        return projects.get(id);
    }

    @Override
    public void update(int id, Project project) {
projects.put(id, project);
    }

    @Override
    public void delete(int id) {
projects.remove(id);
    }
}
