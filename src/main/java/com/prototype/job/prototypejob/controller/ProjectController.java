package com.prototype.job.prototypejob.controller;

import com.prototype.job.prototypejob.model.ProjectModel;
import com.prototype.job.prototypejob.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping(value = "/project-list", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object projectList() {
        return projectService.readAll();
    }

    @PostMapping(value = "/project-list-pagable", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object projectListPaging(@RequestParam(value = "offset", defaultValue = "0") int offset,
                                    @RequestParam(value = "size", defaultValue = "5") int size) {
        return projectService.readWithPaging(offset, size);
    }

    @PostMapping(value = "/new-project")
    public Object newProject(@RequestBody ProjectModel projectModel) {
        projectService.saveProject(projectModel);
        return "Successful";
    }

    @PutMapping(value = "/current-project")
    public Object currentProject(@RequestBody ProjectModel projectModel) {
        projectService.updateProject(projectModel);
        return "Successful";
    }
}
