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
public class Customer {
    private String CustomerID;
    private String FirstName;
    private String LastName;
    private String CNumber;
    private String Email;
    private String Username;
    private String Password;
    private String ConPassword;
    private boolean validUser;

    public Customer(String CustomerID, String FirstName, String LastName, String CNumber, String Email, String Username, String Password, String ConPassword) {
        this.CustomerID = CustomerID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CNumber = CNumber;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
        this.ConPassword = ConPassword;
    }

    

    public Customer() {
    }

    public boolean isValidUser() {
        return validUser;
    }

    public void setValidUser(boolean validUser) {
        this.validUser = validUser;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCNumber() {
        return CNumber;
    }

    public void setCNumber(String CNumber) {
        this.CNumber = CNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConPassword() {
        return ConPassword;
    }

    public void setConPassword(String ConPassword) {
        this.ConPassword = ConPassword;
    }
    
    
}
