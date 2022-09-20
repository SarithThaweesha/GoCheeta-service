/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheeta;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCustomer method, of class DBUtils.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String CustomerID = "1";
        DBUtils instance = new DBUtils();
        Customer expResult = new Customer("1","Sarith","Fonseka","071-2344321","@gmail.com","icbt","1234","1234");
        Customer result = instance.getCustomer(CustomerID);
        assertEquals(expResult.getCustomerID(), result.getCustomerID());
        assertEquals(expResult.getFirstName(), result.getFirstName());
        assertEquals(expResult.getLastName(), result.getLastName());
        assertEquals(expResult.getCNumber(), result.getCNumber());
        assertEquals(expResult.getEmail(), result.getEmail());
        assertEquals(expResult.getUsername(), result.getUsername());
        assertEquals(expResult.getPassword(), result.getPassword());
        assertEquals(expResult.getConPassword(), result.getConPassword());
        
    }
    @Test
    public void testAddVehicle() {
        System.out.println("addVehicle");
        DBUtils instance = new DBUtils();
        Vehicle vehicle = new Vehicle("1","Car","Kandy","BA-1234","Red","4");
        boolean expectedResult=true;
        boolean result=instance.addVehicle(vehicle);
        assertEquals(expectedResult,result);
        Vehicle resultVehicle = instance.getVehicle(vehicle.getId());
        assertEquals(vehicle.getId(), resultVehicle.getId());
        assertEquals(vehicle.getType(), resultVehicle.getType());
        assertEquals(vehicle.getBranch(), resultVehicle.getBranch());
        assertEquals(vehicle.getNumber(), resultVehicle.getNumber());
        assertEquals(vehicle.getColor(), resultVehicle.getColor());
        assertEquals(vehicle.getPassengers(), resultVehicle.getPassengers());       
    
        System.out.println("updateVehicle");
        vehicle = new Vehicle("1","Van","Kandy","BA-1234","Red","4");
        result=instance.updateVehicle(vehicle);
        assertEquals(expectedResult,result);
        resultVehicle = instance.getVehicle(vehicle.getId());
        assertEquals(vehicle.getId(), resultVehicle.getId());
        assertEquals(vehicle.getType(), resultVehicle.getType());
        assertEquals(vehicle.getBranch(), resultVehicle.getBranch());
        assertEquals(vehicle.getNumber(), resultVehicle.getNumber());
        assertEquals(vehicle.getColor(), resultVehicle.getColor());
        assertEquals(vehicle.getPassengers(), resultVehicle.getPassengers());       
  
        System.out.println("deleteVehicle");
        result = instance.deleteVehicle(vehicle.getId());
        assertEquals(expectedResult, result);
        
    }

    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        DBUtils instance = new DBUtils();
        Driver driver = new Driver("2","test1","test","test@gmail.com","test111","test1","test");
        boolean expectedResult=true;
        boolean result=instance.addDriver(driver);
        assertEquals(expectedResult,result);
        Driver resultDriver = instance.getDriver(driver.getId());
        assertEquals(driver.getId(), resultDriver.getId());
        assertEquals(driver.getName(), resultDriver.getName());
        assertEquals(driver.getBranch(), resultDriver.getBranch());
        assertEquals(driver.getEmail(), resultDriver.getEmail());
        assertEquals(driver.getContact(), resultDriver.getContact());
        assertEquals(driver.getUsername(), resultDriver.getUsername());       
        assertEquals(driver.getPassword(), resultDriver.getPassword());
    
        System.out.println("updateDriver");
        driver = new Driver("2","test1","testUpdate","test@gmail.com","test111","test1","test");
        result=instance.updateDriver(driver);
        assertEquals(expectedResult,result);
        resultDriver = instance.getDriver(driver.getId());
        assertEquals(driver.getId(), resultDriver.getId());
        assertEquals(driver.getName(), resultDriver.getName());
        assertEquals(driver.getBranch(), resultDriver.getBranch());
        assertEquals(driver.getEmail(), resultDriver.getEmail());
        assertEquals(driver.getContact(), resultDriver.getContact());
        assertEquals(driver.getUsername(), resultDriver.getUsername());       
        assertEquals(driver.getPassword(), resultDriver.getPassword());
    
        System.out.println("deleteDriver");
        result = instance.deleteDriver(driver.getId());
        assertEquals(expectedResult, result);
    }
}
