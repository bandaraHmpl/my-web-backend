package com.lakshan.portfolio_backend.controller;

import com.lakshan.portfolio_backend.model.Project;
import com.lakshan.portfolio_backend.repository.ProjectRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "*")
public class ProjectController {

    private final ProjectRepository repo;

    public ProjectController(ProjectRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Project> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Project add(@Valid @RequestBody Project p) {
        return repo.save(p);
    }
}

