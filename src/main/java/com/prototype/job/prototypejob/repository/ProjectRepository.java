package com.prototype.job.prototypejob.repository;

import com.prototype.job.prototypejob.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
