package com.prototype.job.prototypejob.repository;

import com.prototype.job.prototypejob.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProjectPagingRepository extends PagingAndSortingRepository<Project, Long> {

}
