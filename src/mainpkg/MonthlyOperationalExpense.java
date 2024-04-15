/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Mehedi
 */
public class MonthlyOperationalExpense {
    float telephoneBill;
    float electricityBill;
    float printingandStationaryBill;
    float furnitureBill;
    float waterAndsanitationBill;
    float transportationfuelExpense;

    public MonthlyOperationalExpense() {
    }

    public MonthlyOperationalExpense(float telephoneBill, float electricityBill, float printingandStationaryBill, float furnitureBill, float waterAndsanitationBill, float transportationfuelExpense) {
        this.telephoneBill = telephoneBill;
        this.electricityBill = electricityBill;
        this.printingandStationaryBill = printingandStationaryBill;
        this.furnitureBill = furnitureBill;
        this.waterAndsanitationBill = waterAndsanitationBill;
        this.transportationfuelExpense = transportationfuelExpense;
    }

    public float getTelephoneBill() {
        return telephoneBill;
    }

    public void setTelephoneBill(float telephoneBill) {
        this.telephoneBill = telephoneBill;
    }

    public float getElectricityBill() {
        return electricityBill;
    }

    public void setElectricityBill(float electricityBill) {
        this.electricityBill = electricityBill;
    }

    public float getPrintingandStationaryBill() {
        return printingandStationaryBill;
    }

    public void setPrintingandStationaryBill(float printingandStationaryBill) {
        this.printingandStationaryBill = printingandStationaryBill;
    }

    public float getFurnitureBill() {
        return furnitureBill;
    }

    public void setFurnitureBill(float furnitureBill) {
        this.furnitureBill = furnitureBill;
    }

    public float getWaterAndsanitationBill() {
        return waterAndsanitationBill;
    }

    public void setWaterAndsanitationBill(float waterAndsanitationBill) {
        this.waterAndsanitationBill = waterAndsanitationBill;
    }

    public float getTransportationfuelExpense() {
        return transportationfuelExpense;
    }

    public void setTransportationfuelExpense(float transportationfuelExpense) {
        this.transportationfuelExpense = transportationfuelExpense;
    }

    @Override
    public String toString() {
        return "MonthlyOperationalExpense{" + "telephoneBill=" + telephoneBill + ", electricityBill=" + electricityBill + ", printingandStationaryBill=" + printingandStationaryBill + ", furnitureBill=" + furnitureBill + ", waterAndsanitationBill=" + waterAndsanitationBill + ", transportationfuelExpense=" + transportationfuelExpense + '}';
    }
    
    
    
}
