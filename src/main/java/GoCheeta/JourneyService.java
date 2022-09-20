/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheeta;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author acer
 */
@WebService(serviceName = "JourneyService")
public class JourneyService {

    /**
     * This is a sample web service operation
     */
     @WebMethod(operationName = "getDestinationK")
     public Destination getDestination(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationK(name);
    }
     @WebMethod(operationName = "getDestinationGa")
     public Destination getDestinationGa(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationGa(name);
    }
      @WebMethod(operationName = "getDestinationGampaha")
     public Destination getDestinationGampaha(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationGampaha(name);
    }
      @WebMethod(operationName = "getDestinationNugegoda")
     public Destination getDestinationNugegoda(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationNugegoda(name);
    }
      @WebMethod(operationName = "getDestinationJaffna")
     public Destination getDestinationJaffna(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationJaffna(name);
    }
      @WebMethod(operationName = "getDestinationKandy")
     public Destination getDestinationKandy(@WebParam(name = "name") String name) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDestinationKandy(name);
    }
     
       @WebMethod(operationName = "addBooking")
      public boolean addBooking(@WebParam(name = "booking") Booking booking) {
        DBUtils utils = new DBUtils();
        return utils.addBooking(booking);
    }
       @WebMethod(operationName = "getBooking")
      public Booking getBooking(@WebParam(name = "start") String start) {
        DBUtils utils = new DBUtils();
        return utils.getBooking(start);
    }
}
