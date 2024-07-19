/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingticket;

/**
 *
 * @author islam
 */
public class ParkedCar {
    // parkedcar
    // make, model, color, license, time elpased
    
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesElapsed;
    
    public ParkedCar(String make, String model, String color, String licenseNumber){
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        
        //constructor initializes all values EXCEPT time elapsed.
        
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public int getMinutesElapsed() {
        return minutesElapsed;
    }

    public void setMinutesElapsed(int minutesElapsed) {
        this.minutesElapsed = minutesElapsed;
    }
    
    
    
    
    
    
}
