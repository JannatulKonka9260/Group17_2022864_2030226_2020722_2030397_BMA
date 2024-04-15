/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Mehedi
 */
public class SalaryExpenditure {
float providentFund;
float professionalTax;
float loan;
float totalDeductions;
float netPay;

    public SalaryExpenditure() {
    }

    public SalaryExpenditure(float providentFund, float professionalTax, float loan, float totalDeductions, float netPay) {
        this.providentFund = providentFund;
        this.professionalTax = professionalTax;
        this.loan = loan;
        this.totalDeductions = totalDeductions;
        this.netPay = netPay;
    }

    public float getProvidentFund() {
        return providentFund;
    }

    public void setProvidentFund(float providentFund) {
        this.providentFund = providentFund;
    }

    public float getProfessionalTax() {
        return professionalTax;
    }

    public void setProfessionalTax(float professionalTax) {
        this.professionalTax = professionalTax;
    }

    public float getLoan() {
        return loan;
    }

    public void setLoan(float loan) {
        this.loan = loan;
    }

    public float getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(float totalDeductions) {
        this.totalDeductions = totalDeductions;
    }

    public float getNetPay() {
        return netPay;
    }

    public void setNetPay(float netPay) {
        this.netPay = netPay;
    }

    @Override
    public String toString() {
        return "SalaryExpenditure{" + "providentFund=" + providentFund + ", professionalTax=" + professionalTax + ", loan=" + loan + ", totalDeductions=" + totalDeductions + ", netPay=" + netPay + '}';
    }


}
