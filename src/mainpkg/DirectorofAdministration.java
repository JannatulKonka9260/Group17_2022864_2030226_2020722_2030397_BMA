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
public class DirectorofAdministration extends Personnel{
    Date dateOfBirth;
    Date dateOfJoining;
    String mail;
    int phoneNumber;

    public DirectorofAdministration() {
    }


    public DirectorofAdministration(Date dateOfBirth, Date dateOfJoining, String mail, int phoneNumber, String name, Float salary, String gender, String id, String password, String designation) {
        super(name, salary, gender, id, password, designation);
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "DirectorofAdministration{" + "dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining + ", mail=" + mail + ", phoneNumber=" + phoneNumber + '}';
    }
    
    

    
    
}
