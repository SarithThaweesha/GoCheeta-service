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
@WebService(serviceName = "AdminService")
public class AdminService {

    /**
     * This is a sample web service operation
     */
   @WebMethod(operationName = "loginAdmin")
    public Admin loginAdmin(@WebParam(name = "Username") String Username,@WebParam(name = "Password")String Password)  {
     
	 DBUtils utils=new DBUtils();
         return utils.loginAdmin(Username, Password);
}
}
