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
public class Booking {
    private int id;
    private String start;
    private String desVehi;
    private String distance;
    private String price;

    public Booking(int id, String start, String desVehi, String distance, String price) {
        this.id = id;
        this.start = start;
        this.desVehi = desVehi;
        this.distance = distance;
        this.price = price;
    }

    public Booking(String start, String desVehi, String distance, String price) {
        this.start = start;
        this.desVehi = desVehi;
        this.distance = distance;
        this.price = price;
    }

    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDesVehi() {
        return desVehi;
    }

    public void setDesVehi(String desVehi) {
        this.desVehi = desVehi;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
    
    
}
