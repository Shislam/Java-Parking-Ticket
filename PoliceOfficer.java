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
public class PoliceOfficer {
    // policeofficer
        // name, badge number
        // examine parkedcar and parkingmeter
        // generate ticket
    
    private String name;
    private int badgeNumber;
    
    public PoliceOfficer(String name, int badgeNumber){
        this.name = name;
        this.badgeNumber = badgeNumber;
        
    }
    
    public void inspectParking(ParkedCar myCar, ParkingMeter myMeter){
        int paid = myMeter.getTimePurchased();
        int elapsed = myCar.getMinutesElapsed();
        
        int difference = paid - elapsed;
        
        if (difference >= 0){
            System.out.println("No ticket is issued.");
        }
        else{
            
            Ticket currentTicket = new Ticket(name, badgeNumber, myCar, myMeter);
            currentTicket.setFineAmount();
            currentTicket.print();
        }
        
    }
    
}
