/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author Mehedi
 */
public class User implements Serializable {
    String id;
    String password;
    String designation;

    public User() {
    }

    
    
    public User(String id, String password, String designation) {
        this.id = id;
        this.password = password;
        this.designation = designation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", password=" + password + ", designation=" + designation + '}';
    }
    
    
    public boolean checkPassword(String pass)
     {
         return pass.equals(this.password);
    }
    
    
    
    
    
}
