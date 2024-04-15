/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;

/**
 *
 * @author Mehedi
 */
public class SalaryPay {
    int employeeIdforPaySlip;
    LocalDate dateofJoining;
    String designation;
    LocalDate payPeriod;
    int Workdays;
    String earningType;
    float earningAmount;
    String deductionType;
    float deductionAmount;
    

    public SalaryPay() {
    }

    public SalaryPay(int employeeIdforPaySlip, LocalDate dateofJoining, String designation, LocalDate payPeriod, int Workdays, String earningType, float earningAmount, String deductionType, float deductionAmount) {
        this.employeeIdforPaySlip = employeeIdforPaySlip;
        this.dateofJoining = dateofJoining;
        this.designation = designation;
        this.payPeriod = payPeriod;
        this.Workdays = Workdays;
        this.earningType = earningType;
        this.earningAmount = earningAmount;
        this.deductionType = deductionType;
        this.deductionAmount = deductionAmount;
       
    }

    public int getEmployeeIdforPaySlip() {
        return employeeIdforPaySlip;
    }

    public void setEmployeeIdforPaySlip(int employeeIdforPaySlip) {
        this.employeeIdforPaySlip = employeeIdforPaySlip;
    }

    public LocalDate getDateofJoining() {
        return dateofJoining;
    }

    public void setDateofJoining(LocalDate dateofJoining) {
        this.dateofJoining = dateofJoining;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public LocalDate getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(LocalDate payPeriod) {
        this.payPeriod = payPeriod;
    }

    public int getWorkdays() {
        return Workdays;
    }

    public void setWorkdays(int Workdays) {
        this.Workdays = Workdays;
    }

    public String getEarningType() {
        return earningType;
    }

    public void setEarningType(String earningType) {
        this.earningType = earningType;
    }

    public float getEarningAmount() {
        return earningAmount;
    }

    public void setEarningAmount(float earningAmount) {
        this.earningAmount = earningAmount;
    }

    public String getDeductionType() {
        return deductionType;
    }

    public void setDeductionType(String deductionType) {
        this.deductionType = deductionType;
    }

    public float getDeductionAmount() {
        return deductionAmount;
    }

    public void setDeductionAmount(float deductionAmount) {
        this.deductionAmount = deductionAmount;
    }

    

    @Override
    public String toString() {
        return "SalaryPay{" + "employeeIdforPaySlip=" + employeeIdforPaySlip + ", dateofJoining=" + dateofJoining + ", designation=" + designation + ", payPeriod=" + payPeriod + ", Workdays=" + Workdays + ", earningType=" + earningType + ", earningAmount=" + earningAmount + ", deductionType=" + deductionType + ", deductionAmount=" + deductionAmount;
    }
    
   
    
    
}
