package com.prototype.job.prototypejob.entity;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId", nullable = false)
    private Long projectId;

    @Column(name = "projectName")
    private String projectName;

    @Column(name = "projectDescription")
    private String projectDescription;

    @Column(name = "projectPercentage")
    private int projectPercentage;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public int getProjectPercentage() {
        return projectPercentage;
    }

    public void setProjectPercentage(int projectPercentage) {
        this.projectPercentage = projectPercentage;
    }
}
