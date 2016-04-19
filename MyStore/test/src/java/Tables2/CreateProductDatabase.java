
package Tables2;


import Tables2.ConnectionClass;
import java.net.URL;
import java.sql.*;
     
public class CreateProductDatabase
{

   public static void main(String args[]) {

       Connection con=ConnectionClass.getConnection(args);
       String createString;
       createString = "create table Soap" + 
                "(Productid INT AUTO_INCREMENT, " +
                       "Code varchar(10), " +
                       "Name varchar(40), " +
                       "Description varchar(400), " +
                       "Ingredients varchar(400), " +
                       "Bpimage varchar(100), " +
                       "Image varchar(100), " +
                       "Price DECIMAL(5,2), " +
                       "Skintype varchar(100), " +
                       "PRIMARY KEY (Productid));";
   
       Statement stmt;

       if (con == null)
       {
           System.out.println("Unable to create connection");
           return;
       }

       try {
           stmt = con.createStatement();                           
           stmt.executeUpdate(createString);
   
           stmt.close();
           con.close();
   
       } catch(SQLException ex) {
           System.err.println("SQLException: " + ex.getMessage());
       }
   }
}




