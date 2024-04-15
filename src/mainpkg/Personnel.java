/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Mehedi
 */
public class Personnel extends User {
   
   String name;
   Float salary;
   String gender;

    public Personnel() {
    }

    public Personnel(String name, Float salary, String gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public Personnel(String name, Float salary, String gender, String id, String password, String designation) {
        super(id, password, designation);
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    @Override
    public String toString() {
        return "Personnel{" + "name=" + name + ", salary=" + salary + ", gender=" + gender + '}';
    }
   
   
}
