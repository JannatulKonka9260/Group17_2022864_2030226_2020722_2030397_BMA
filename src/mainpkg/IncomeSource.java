/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Mehedi
 */
public class IncomeSource {
    float basic;
    float incentivePay;
    float houseRentAllowance;
    float mealAllowance;
    float totalEarnings;

    public IncomeSource() {
    }

    public IncomeSource(float basic, float incentivePay, float houseRentAllowance, float mealAllowance, float totalEarnings) {
        this.basic = basic;
        this.incentivePay = incentivePay;
        this.houseRentAllowance = houseRentAllowance;
        this.mealAllowance = mealAllowance;
        this.totalEarnings = totalEarnings;
    }

    public float getBasic() {
        return basic;
    }

    public void setBasic(float basic) {
        this.basic = basic;
    }

    public float getIncentivePay() {
        return incentivePay;
    }

    public void setIncentivePay(float incentivePay) {
        this.incentivePay = incentivePay;
    }

    public float getHouseRentAllowance() {
        return houseRentAllowance;
    }

    public void setHouseRentAllowance(float houseRentAllowance) {
        this.houseRentAllowance = houseRentAllowance;
    }

    public float getMealAllowance() {
        return mealAllowance;
    }

    public void setMealAllowance(float mealAllowance) {
        this.mealAllowance = mealAllowance;
    }

    public float getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(float totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    @Override
    public String toString() {
        return "IncomeSource{" + "basic=" + basic + ", incentivePay=" + incentivePay + ", houseRentAllowance=" + houseRentAllowance + ", mealAllowance=" + mealAllowance + ", totalEarnings=" + totalEarnings + '}';
    }
    
    
}
