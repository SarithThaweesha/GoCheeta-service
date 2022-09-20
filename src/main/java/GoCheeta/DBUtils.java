/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoCheeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class DBUtils {
      static final String URL = "jdbc:mysql://localhost:3306/gocheeta?autoReconnect=true&useSSL=false";
     static final String USERNAME ="st_user";
     static final String PASSWORD = "123user@";
     
    public Customer getCustomer(String CustomerID){
        Customer customer = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from customer WHERE CustomerID='"+ CustomerID +"'");
            
            while(resultSet.next()){
                customer = new Customer(resultSet.getString("CustomerID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("CNumber"),
                        resultSet.getString("Email"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("ConPassword"));   
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return customer;
    }
     public Destination getDestinationK(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from kurunagalab WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));
                
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
      public Destination getDestinationGa(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from galleb WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));
                
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
      public Destination getDestinationGampaha(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from gampahab WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));  
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
      public Destination getDestinationKandy(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from kandyb WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));  
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
      public Destination getDestinationNugegoda(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from nugegodab WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));               
            }          
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
      public Destination getDestinationJaffna(String destype){
        Destination destination = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from jaffnab WHERE destype='"+ destype +"'");
            
            while(resultSet.next()){
                destination = new Destination(resultSet.getString("id"),
                        resultSet.getString("StCity"),
                        resultSet.getString("destype"),
                        resultSet.getString("Distance"),
                        resultSet.getString("Price"));
                
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return destination;
     }
       public Booking getBooking(String start){
        Booking booking = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from booking WHERE start='"+ start +"'");
            
            while(resultSet.next()){
                booking = new Booking(resultSet.getString("start"),
                        resultSet.getString("desVehi"),
                        resultSet.getString("distance"),
                        resultSet.getString("price"));               
            }           
        }catch(SQLException e){
            System.out.println(e);
        }
        return booking;
     }
    public List<Customer> getCustomers(){
        List<Customer> customers =new ArrayList<>();
        try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from customer");
            
            while(resultSet.next()){
                Customer customer = new Customer(resultSet.getString("CustomerID"),
                        resultSet.getString("FirstName"),
                        resultSet.getString("LastName"),
                        resultSet.getString("CNumber"),
                        resultSet.getString("Email"),
                        resultSet.getString("Username"),
                        resultSet.getString("Password"),
                        resultSet.getString("ConPassword"));
                customers.add(customer);
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return customers;
        
    }
    public boolean addCustomer(Customer customer){
        try{
         Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("INSERT INTO customer (`CustomerID`, `FirstName`, `LastName`,`CNumber`,`Email`,`Username`,`Password`,`ConPassword`) "
                 + "VALUES ('"+ customer.getCustomerID()+"'"
                 + ",'"+customer.getFirstName()+"', '"+customer.getLastName()+"', '"+customer.getCNumber()+"', '"+customer.getEmail()+"', '"+customer.getUsername()+"'"
                         + ", '"+customer.getPassword()+"', '"+customer.getConPassword()+"')");
         return rows > 0;
    }catch(SQLException e){
        System.out.println(e);
    }
       return false;
}
     public boolean addBooking(Booking booking){
        try{
         Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("INSERT INTO booking (`id`, `start`, `desVehi`,`distance`,`price`) "
                 + "VALUES ('"+ booking.getId()+"'"
                 + ",'"+booking.getStart()+"', '"+booking.getDesVehi()+"', '"+booking.getDistance()+"', '"+booking.getPrice()+"')");
         return rows > 0;
    }catch(SQLException e){
        System.out.println(e);
    }
       return false;
}
         
     public boolean addDriver(Driver driver){
        try{
         Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("INSERT INTO driver (`id`, `name`, `branch`,`email`,`contact`, `username`,`password`)"
                 + " VALUES ('"+ driver.getId()+"'"
                 + ",'"+driver.getName()+"', '"+driver.getBranch()+"', '"+driver.getEmail()+"', '"+driver.getContact()+"', '"+driver.getUsername()
                 +"', '"+driver.getPassword()+"')");
         return rows > 0;
    }catch(SQLException e){
        System.out.println(e);
    }
       return false;
}
 
      public boolean updateDriver(Driver driver){
       try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("UPDATE `driver` SET `name` = '"+driver.getName()+"',"
                 + "`branch`='"+driver.getBranch()+"',`email` = '"+driver.getEmail()+"',`contact` = '"+driver.getContact()+"',"
                         + "`username` = '"+driver.getUsername()+"',`password` = '"+driver.getPassword()+"' WHERE (`id` = '"+driver.getId()+"')");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
   public boolean addVehicle(Vehicle vehicle){
        try{
         Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("INSERT INTO vehicles (`id`, `type`, `branch`,`number`,`color`,`passengers`) "
                 + "VALUES ('"+ vehicle.getId()+"'"
                 + ",'"+vehicle.getType()+"', '"+vehicle.getBranch()+"', '"+vehicle.getNumber()+"', '"+vehicle.getColor()+"',"
                         + " '"+vehicle.getPassengers()+"')");
         return rows > 0;
    }catch(SQLException e){
        System.out.println(e);
    }
       return false;
}
    public Driver getDriver(String id){
        Driver driver = null;
        
         try{
            Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from driver WHERE id='"+ id +"'");
            
            while(resultSet.next()){
                driver = new Driver(resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getString("branch"),
                        resultSet.getString("email"),
                        resultSet.getString("contact"),
                        resultSet.getString("username"),
                        resultSet.getString("password"));
                
            }
           
        }catch(SQLException e){
            System.out.println(e);
        }
        return driver;
    }
      public Vehicle getVehicle(String id){
        Vehicle vehicle = null;
         try{
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement();
            
            ResultSet resultSet = statement.executeQuery("select * from vehicles WHERE id='"+ id +"'");
            
            while(resultSet.next()){
                vehicle = new Vehicle(resultSet.getString("id"),
                        resultSet.getString("type"),
                        resultSet.getString("branch"),
                        resultSet.getString("number"),
                        resultSet.getString("color"),
                        resultSet.getString("passengers"));   
            }  
        }catch(SQLException e){
            System.out.println(e);
        }
        return vehicle;
    }
        public boolean updateVehicle(Vehicle vehicle){
        try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
             Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("UPDATE `vehicles` SET `type` = '"+vehicle.getType()+"',"
                 + "`branch`='"+vehicle.getBranch()+"',`number` = '"+vehicle.getNumber()+"',`color` = '"+vehicle.getColor()+"',"
                         + " `passengers` = '"+vehicle.getPassengers()+"' WHERE (`id` = '"+vehicle.getId()+"')");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
    public boolean updateCustomer(Customer customer){
        try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
         Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("UPDATE `customer` SET `FirstName` = '"+customer.getFirstName()+"',"
                 + "`LastName`='"+customer.getFirstName()+"',`CNumber` = '"+customer.getCNumber()+"',`Email` = '"+customer.getEmail()+"'"
                         + "`Username` = '"+customer.getUsername()+"',`Password` = '"+customer.getPassword()+"',`ConPassword` = '"+customer.getConPassword()+"' WHERE (`id` = '"+customer.getCustomerID()+"')");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
     public boolean deleteVehicle(String id){
        try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
             Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("DELETE FROM `vehicles` WHERE (`id` = '" +id+ "');");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
     public boolean deleteDriver(String id){
        try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
             Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("DELETE FROM `driver` WHERE (`id` = '" +id+ "');");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
     public boolean deleteCustomer(String id){
        try{
             Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
             Statement statement = connection.createStatement();
         
         int rows = statement.executeUpdate("DELETE FROM `customer` WHERE (`CustomerID` = '" +id+ "');");
         return rows > 0;
        }catch(SQLException e){
            System.out.println(e);
        }
        return false;
    }
     public Customer loginCustomer(String Username,String Password){
      
		
		Customer customer = null;
		 
		try {
                       Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
             Statement statement = connection.createStatement();
             String sql_query = "SELECT *FROM customer where Username=? and Password=?";
			PreparedStatement stmt = connection.prepareStatement(sql_query);
			
			stmt.setString(1, Username);
			stmt.setString(2, Password);
			
			// executing the query
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				// defining the UserDetails object
				customer = new Customer();
				
				// setting the all attributes to object from database
				customer.setUsername(Username);
				customer.setPassword(Password);
				customer.setValidUser(true);
				
			}
			
		} catch(SQLException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		return customer;
	}
     
 public Admin loginAdmin(String Username,String Password){
      
		
		Admin admin = null;
		 
		try {
                       Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
                        Statement statement = connection.createStatement();
                        String sql_query = "SELECT *FROM admin where Username=? and Password=?";
			PreparedStatement stmt = connection.prepareStatement(sql_query);
			
			stmt.setString(1, Username);
			stmt.setString(2, Password);
			
			// executing the query
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				// defining the AdminDetails object
				admin = new Admin();
				
				// setting the all attributes to object from database
				admin.setUsername(Username);
				admin.setPassword(Password);
				admin.setValidAdmin(true);
				
			}
			
		} catch(SQLException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		return admin;
	}
 public Driver loginDriver(String Username,String Password){
      
		
		Driver driver = null;
		 
		try {
                       Connection connection = DriverManager.getConnection(URL, USERNAME,PASSWORD);
                        Statement statement = connection.createStatement();
                        String sql_query = "SELECT *FROM driver where Username=? and Password=?";
			PreparedStatement stmt = connection.prepareStatement(sql_query);
			
			stmt.setString(1, Username);
			stmt.setString(2, Password);
			
			// executing the query
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				
				// defining the AdminDetails object
				driver = new Driver();
				
				// setting the all attributes to object from database
				driver.setUsername(Username);
				driver.setPassword(Password);
				driver.setValidDriver(true);
				
			}
			
		} catch(SQLException ex) {
			
			System.out.println(ex.getMessage());
		}
		
		return driver;
	}
     }

