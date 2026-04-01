package com.lakshan.portfolio_backend.repository;

import com.lakshan.portfolio_backend.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}