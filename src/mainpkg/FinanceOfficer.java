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
public class FinanceOfficer extends Personnel{
    Date dateOfBirth;
    Date dateOfJoining;
    String mail;

    public FinanceOfficer() {
    }

    public FinanceOfficer(Date dateOfBirth, Date dateOfJoining, String mail, String name, Float salary, String gender, String id, String password, String designation) {
        super(name, salary, gender, id, password, designation);
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.mail = mail;
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

    @Override
    public String toString() {
        return "FinanceOfficer{" + "dateOfBirth=" + dateOfBirth + ", dateOfJoining=" + dateOfJoining + ", mail=" + mail + '}';
    }
    
    
}
