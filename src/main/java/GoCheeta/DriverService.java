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
@WebService(serviceName = "DriverService")
public class DriverService {

    @WebMethod(operationName = "getDriver")
     public Driver getDriver(@WebParam(name = "id") String id) {
        //return new Student(id,"George","1990");
        DBUtils utils = new DBUtils();
        return utils.getDriver(id);
    }
       @WebMethod(operationName = "addDriver")
      public boolean addDriver(@WebParam(name = "driver") Driver driver) {
        DBUtils utils = new DBUtils();
        return utils.addDriver(driver);
    }
        @WebMethod(operationName = "updateDriver")
      public boolean updateDriver(@WebParam(name = "driver") Driver driver) {
        DBUtils utils = new DBUtils();
        return utils.updateDriver(driver);
    }
        @WebMethod(operationName = "deleteDriver")
     public boolean deleteDriver(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.deleteDriver(id);
    }
      @WebMethod(operationName = "loginDriver")
    public Driver loginDriver(@WebParam(name = "Username") String Username,@WebParam(name = "Password")String Password)  {
	 DBUtils utils=new DBUtils();
         return utils.loginDriver(Username, Password);
}
}
