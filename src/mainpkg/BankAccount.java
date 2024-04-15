/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Mehedi
 */
public class BankAccount {
 int bankAccNum;
 String accType;
String accHolderName;
int phoneNumber;
String email;

    public BankAccount() {
    }

    public BankAccount(int bankAccNum, String accType, String accHolderName, int phoneNumber, String email) {
        this.bankAccNum = bankAccNum;
        this.accType = accType;
        this.accHolderName = accHolderName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(int bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "bankAccNum=" + bankAccNum + ", accType=" + accType + ", accHolderName=" + accHolderName + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }


}
