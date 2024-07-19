/*
 * Shajeed Islam
* COP2800
* Parking Ticket - Chapter 8 Assign 9
* Oct 27 2023
 */
package parkingticket;

import java.lang.*;
/**
 *
 * @author islam
 */
public class ParkingTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // program doesn't ask for user input
        
        ParkedCar myCar = new ParkedCar("Toyota", "Corolla", "grey", "ABC123");
        
        ParkingMeter collegeParking = new ParkingMeter(300);
        
        myCar.setMinutesElapsed(450);
        
        //if user does not manually set a time elapsed, function says no ticket
        
        PoliceOfficer officer = new PoliceOfficer("Thompson", 12345);
        
        officer.inspectParking(myCar, collegeParking);
        
    }
    
}
