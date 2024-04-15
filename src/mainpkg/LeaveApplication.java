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
public class LeaveApplication {
    int personnelId;
    String leaveType;
    Date startDate;
    Date endDate;
    String leaveCategory;
    String reason;

    public LeaveApplication() {
    }

    public LeaveApplication(int personnelId, String leaveType, Date startDate, Date endDate, String leaveCategory, String reason) {
        this.personnelId = personnelId;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leaveCategory = leaveCategory;
        this.reason = reason;
    }

    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLeaveCategory() {
        return leaveCategory;
    }

    public void setLeaveCategory(String leaveCategory) {
        this.leaveCategory = leaveCategory;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LeaveApplication{" + "personnelId=" + personnelId + ", leaveType=" + leaveType + ", startDate=" + startDate + ", endDate=" + endDate + ", leaveCategory=" + leaveCategory + ", reason=" + reason + '}';
    }
    
    
}
