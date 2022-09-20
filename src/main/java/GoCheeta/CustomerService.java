/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheeta;

import java.sql.Connection;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author acer
 */
@WebService(serviceName = "CustomerService")
public class CustomerService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
      @WebMethod(operationName = "getCustomer")
     public Customer getCustomer(@WebParam(name = "CustomerID") String CustomerID) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getCustomer(CustomerID);
    }
      @WebMethod(operationName = "getCustomers")
      public List<Customer> getCustomers() {
        DBUtils utils = new DBUtils();
        return utils.getCustomers();
    }
      @WebMethod(operationName = "addCustomer")
      public boolean addCustomer(@WebParam(name = "customer") Customer customer) {
        DBUtils utils = new DBUtils();
        return utils.addCustomer(customer);
    }
     
      @WebMethod(operationName = "updateCustomer")
      public boolean updateCustomer(@WebParam(name = "customer") Customer customer) {
        DBUtils utils = new DBUtils();
        return utils.updateCustomer(customer);
    }
      @WebMethod(operationName = "deleteCustomer")
     public boolean deleteCustomer(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.deleteCustomer(id);
    }
     @WebMethod(operationName = "loginCustomer")
    public Customer loginCustomer(@WebParam(name = "Username") String Username,@WebParam(name = "Password")String Password)  {
     
	 DBUtils utils=new DBUtils();
         return utils.loginCustomer(Username, Password);
}
}
