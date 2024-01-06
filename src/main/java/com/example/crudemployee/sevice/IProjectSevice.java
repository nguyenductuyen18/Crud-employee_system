package com.example.crudemployee.sevice;

import com.example.crudemployee.model.Department;
import com.example.crudemployee.model.Project;

import java.util.List;

public interface IProjectSevice {
    List<Project> finAll();
    void add(Project project);
    Project fileById(int id);
    void update(int id,Project project);
    void delete(int id);
}
