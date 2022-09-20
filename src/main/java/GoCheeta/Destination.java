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
public class Destination {
    private String id;
    private String StCity;
    private String destype;
    private String Distance;
    private String price;

    public Destination(String id, String StCity, String destype, String Distance, String price) {
        this.id = id;
        this.StCity = StCity;
        this.destype = destype;
        this.Distance = Distance;
        this.price = price;
    }

    public Destination() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStCity() {
        return StCity;
    }

    public void setStCity(String StCity) {
        this.StCity = StCity;
    }

    public String getDestype() {
        return destype;
    }

    public void setDestype(String destype) {
        this.destype = destype;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
