package com.prototype.job.prototypejob.model;

import java.io.Serializable;

public class ProjectModel implements Serializable {

    private Long projectId;
    private String projectName;
    private String projectDescription;
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

    @Override
    public String toString() {
        return "ProjectModel{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectPercentage=" + projectPercentage +
                '}';
    }
}
