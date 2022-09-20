/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheeta;

/**
 *
 * @author acer
 */
public class Vehicle {
    private String id;
    private String type;
    private String branch;
    private String number;
    private String color;
    private String passengers;

    public Vehicle(String id, String type, String branch, String number, String color, String passengers) {
        this.id = id;
        this.type = type;
        this.branch = branch;
        this.number = number;
        this.color = color;
        this.passengers = passengers;
    }
    public Vehicle() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }
    
    
}
