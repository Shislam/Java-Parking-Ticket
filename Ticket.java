/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parkingticket;

import java.lang.*;
/**
 *
 * @author islam
 */
public class Ticket {
    
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesElapsed;
    private int timePurchased;
    
    private String officerName;
    private int officerBadge;
    private double fineAmount;
    
    public Ticket(String officerName, int officerBadge, ParkedCar myCar, ParkingMeter myMeter){
        this.officerName = officerName;
        this.officerBadge = officerBadge;
        this.make = myCar.getMake();
        this.model = myCar.getModel();
        this.color = myCar.getColor();
        this.licenseNumber = myCar.getLicenseNumber();
        this.minutesElapsed = myCar.getMinutesElapsed();
        this.timePurchased = myMeter.getTimePurchased();
        
        //constructor takes objects and extracts relevant info. 
        
    }
    
    public void setFineAmount(){
        double difference = (double)minutesElapsed - (double)timePurchased;
        // assumption is that the cop won't issue ticket if the 
        // minutes elapse isnt higher than time bought
        
        difference = difference/60;
        
        fineAmount = 25.0;
        
        // since number is non zero and isn't negative, initialize with first hour
        // if u are even a minute over, cops gonna bust ur wallet for that full hr
        
        if (difference > 1){
            difference = Math.ceil(difference);
            
            //round up. aint no partials with uncle sam
            
            difference = (difference -1)*10;
            
            fineAmount = fineAmount + difference;
        }
        
    }
    
    public void print(){
        System.out.print("A ticket has been issued by " + officerName + ", badge number " + officerBadge + ".\n"
                + "The ticket has been issued to a " + color + " " + make + " " + model + ".\n"
                + "The license number is " + licenseNumber + ".\n");
        System.out.printf("The fine amount is $%.2f.\n", fineAmount);
        
        //print function prints all data.
    }
    
    
    
}
