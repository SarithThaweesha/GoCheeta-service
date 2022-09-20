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
public class Driver {
    private String id;
    private String name;
    private String branch;
    private String email;
    private String contact;
    private String username;
    private String password;
    private boolean validDriver;

    public Driver(String id, String name, String branch, String email, String contact, String username, String password) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.contact = contact;
        this.username = username;
        this.password = password;
    }

    public Driver() {
    }

    public boolean isValidDriver() {
        return validDriver;
    }

    public void setValidDriver(boolean validDriver) {
        this.validDriver = validDriver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    
    
}
