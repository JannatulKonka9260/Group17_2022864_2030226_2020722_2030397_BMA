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
public class MeetingSchedule {
    int employeeId;
    String time;
    Date date;
    String reason;

    public MeetingSchedule() {
    }
    
    

    public MeetingSchedule(int employeeId, String time, Date date, String reason) {
        this.employeeId = employeeId;
        this.time = time;
        this.date = date;
        this.reason = reason;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "MeetingSchedule{" + "employeeId=" + employeeId + ", time=" + time + ", date=" + date + ", reason=" + reason + '}';
    }
    
    
    
    
}
