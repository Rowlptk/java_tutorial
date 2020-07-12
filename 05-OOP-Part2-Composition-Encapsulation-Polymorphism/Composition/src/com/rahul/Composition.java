/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rahul;

public class Composition {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
    
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        
        Motherboard theMotherboard = new Motherboard("83-200", "Asus", 4, 6, "v2.44");
        
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton(); 
        thePC.powerUp();
        
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as previously
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        
        
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        
        Ceiling ceiling = new Ceiling(12, 55);
        
        Bed bed = new Bed("Modern", 4 , 3, 2, 1);
        
        Lamp lamp = new Lamp("Classic", false, 75);
        
        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
