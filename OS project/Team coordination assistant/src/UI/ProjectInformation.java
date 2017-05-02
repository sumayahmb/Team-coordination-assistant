/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author sumayahbawazeer
 */
public class ProjectInformation {
    private String username;
    private String projectName;
    private String taskName;
    private String taskStatus;
    private String enrolledUser;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
       this.username = username;
   }

   public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getEnrolledUser() {
        return enrolledUser;
    }

    public void setEnrolledUser(String enrolledUser) {
        this.enrolledUser = enrolledUser;
    }
}
