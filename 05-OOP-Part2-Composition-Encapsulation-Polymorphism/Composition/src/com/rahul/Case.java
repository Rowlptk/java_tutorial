
package com.rahul;

public class Case {
    private String model;
    private String manufacturer;
    private String ppowerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String ppowerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ppowerSupply = ppowerSupply;
        this.dimensions = dimensions;
    }
    
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPpowerSupply() {
        return ppowerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
    
}
