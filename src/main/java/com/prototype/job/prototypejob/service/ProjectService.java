package com.prototype.job.prototypejob.service;

import com.prototype.job.prototypejob.entity.Project;
import com.prototype.job.prototypejob.model.ProjectModel;
import com.prototype.job.prototypejob.repository.ProjectPagingRepository;
import com.prototype.job.prototypejob.repository.ProjectRepository;
import jdk.nashorn.internal.runtime.options.Option;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProjectService {

    private static final Logger logger = LoggerFactory.getLogger(ProjectService.class);

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectPagingRepository projectPagingRepository;

    public void saveProject(ProjectModel projectModel) {
        logger.info("{}", projectModel);

        Project project = new Project();
        project.setProjectName(projectModel.getProjectName());
        project.setProjectDescription(projectModel.getProjectDescription());
        project.setProjectPercentage(projectModel.getProjectPercentage());

        projectRepository.save(project);
    }

    public void updateProject(ProjectModel projectModel) {
        Optional<Project> optProject = projectRepository.findById(projectModel.getProjectId());
        if (optProject.isPresent()) {
            Project project = optProject.get();
            project.setProjectId(projectModel.getProjectId());
            project.setProjectName(projectModel.getProjectName());
            project.setProjectDescription(projectModel.getProjectDescription());
            project.setProjectPercentage(projectModel.getProjectPercentage());

            projectRepository.save(project);
        }
    }

    public void deleteProject() {

    }

    public Object readAll() {
        List<Project> projectList = projectRepository.findAll();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", projectList);
        return jsonObject.toString();
    }

    public Object readWithPaging(int offset, int size) {
        logger.info("offset {}", offset);
        Pageable pageable = PageRequest.of(offset, size);
        Page<Project> projects = projectPagingRepository.findAll(pageable);
        return projects;
    }
}
