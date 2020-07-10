package com.rahul;

public class Classes {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
//      porsche.model = "Carrera";
//      System.out.println("Model is " + porsche.getModel());
//      porsche.setModel("Carrera");
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
    
}
