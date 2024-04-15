/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author Mehedi
 */
public class Address {
String city;
String block;
int road;
int plot;
int postalCode;

    public Address() {
    }

    public Address(String city, String block, int road, int plot, int postalCode) {
        this.city = city;
        this.block = block;
        this.road = road;
        this.plot = plot;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getPlot() {
        return plot;
    }

    public void setPlot(int plot) {
        this.plot = plot;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", block=" + block + ", road=" + road + ", plot=" + plot + ", postalCode=" + postalCode + '}';
    }


}
