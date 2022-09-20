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
@WebService(serviceName = "VehicleService")
public class VehicleService {

    @WebMethod(operationName = "getVehicle")
     public Vehicle getVehicle(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.getVehicle(id);
    }
       @WebMethod(operationName = "addVehicle")
      public boolean addVehicle(@WebParam(name = "vehicle") Vehicle vehicle) {
        DBUtils utils = new DBUtils();
        return utils.addVehicle(vehicle);
    }
        @WebMethod(operationName = "updateVehicle")
      public boolean updateVehicle(@WebParam(name = "vehicle") Vehicle vehicle) {
        DBUtils utils = new DBUtils();
        return utils.updateVehicle(vehicle);
    }
        @WebMethod(operationName = "deleteVehicle")
     public boolean deleteVehicle(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.deleteVehicle(id);
    }
}
