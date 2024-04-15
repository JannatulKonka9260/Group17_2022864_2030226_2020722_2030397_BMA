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
public class FinancialPolicy {
    String description;
    LocalDate lastUpdated;

    public FinancialPolicy() {
    }

    public FinancialPolicy(String description,  LocalDate lastUpdated) {
        this.description = description;
        this.lastUpdated = lastUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated( LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return  "description=" + description + "\nlastUpdated=" + lastUpdated;
    }
    
    
}
