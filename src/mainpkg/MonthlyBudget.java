/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Mehedi
 */
public class MonthlyBudget {
String budgetMonth;
float weaponAndProtectiveGear;
float medical;
float education;
float food;
float transportation;
LocalDate budgetCreatingDate;

    public MonthlyBudget() {
    }

    public MonthlyBudget(String budgetMonth, float weaponAndProtectiveGear, float medical, float education, float food, float transportation, LocalDate budgetCreatingDate) {
        this.budgetMonth = budgetMonth;
        this.weaponAndProtectiveGear = weaponAndProtectiveGear;
        this.medical = medical;
        this.education = education;
        this.food = food;
        this.transportation = transportation;
        this.budgetCreatingDate = budgetCreatingDate;
    }

    public String getBudgetMonth() {
        return budgetMonth;
    }

    public void setBudgetMonth(String budgetMonth) {
        this.budgetMonth = budgetMonth;
    }

    public float getWeaponAndProtectiveGear() {
        return weaponAndProtectiveGear;
    }

    public void setWeaponAndProtectiveGear(float weaponAndProtectiveGear) {
        this.weaponAndProtectiveGear = weaponAndProtectiveGear;
    }

    public float getMedical() {
        return medical;
    }

    public void setMedical(float medical) {
        this.medical = medical;
    }

    public float getEducation() {
        return education;
    }

    public void setEducation(float education) {
        this.education = education;
    }

    public float getFood() {
        return food;
    }

    public void setFood(float food) {
        this.food = food;
    }

    public float getTransportation() {
        return transportation;
    }

    public void setTransportation(float transportation) {
        this.transportation = transportation;
    }

    public LocalDate getBudgetCreatingDate() {
        return budgetCreatingDate;
    }

    public void setBudgetCreatingDate(LocalDate budgetCreatingDate) {
        this.budgetCreatingDate = budgetCreatingDate;
    }

    @Override
    public String toString() {
        return "BudgetMonth=" + budgetMonth + ", WeaponAndProtectiveGear=" + weaponAndProtectiveGear + ", medical=" + medical + ", education=" + education + ", food=" + food + ", transportation=" + transportation + ", budgetCreatingDate=" + budgetCreatingDate;
    }

    

    
    

}
