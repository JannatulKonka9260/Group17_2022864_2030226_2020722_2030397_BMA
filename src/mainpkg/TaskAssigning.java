/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.util.Date;

/**
 *
 * @author Mehedi
 */
public class TaskAssigning {
String taskTitle;
String taskDetails;
Date taskStartDate;
Date taskEndDate;
int employeeeId;

    public TaskAssigning() {
    }

    public TaskAssigning(String taskTitle, String taskDetails, Date taskStartDate, Date taskEndDate, int employeeeId) {
        this.taskTitle = taskTitle;
        this.taskDetails = taskDetails;
        this.taskStartDate = taskStartDate;
        this.taskEndDate = taskEndDate;
        this.employeeeId = employeeeId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public Date getTaskStartDate() {
        return taskStartDate;
    }

    public void setTaskStartDate(Date taskStartDate) {
        this.taskStartDate = taskStartDate;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public int getEmployeeeId() {
        return employeeeId;
    }

    public void setEmployeeeId(int employeeeId) {
        this.employeeeId = employeeeId;
    }

    @Override
    public String toString() {
        return "TaskAssigning{" + "taskTitle=" + taskTitle + ", taskDetails=" + taskDetails + ", taskStartDate=" + taskStartDate + ", taskEndDate=" + taskEndDate + ", employeeeId=" + employeeeId + '}';
    }


}
