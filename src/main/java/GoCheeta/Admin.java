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
public class Admin {
    private int id;
    private String name;
    private String contact;
    private String username;
    private String password;
    private boolean validAdmin;

    public Admin(int id, String name, String contact, String username, String password) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValidAdmin() {
        return validAdmin;
    }

    public void setValidAdmin(boolean validAdmin) {
        this.validAdmin = validAdmin;
    }
    
    
    
}
