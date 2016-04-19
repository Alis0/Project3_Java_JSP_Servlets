
package Tables2;


import Tables2.ConnectionClass;
import java.net.URL;
import java.sql.*;
     
public class CreateOptions
{

   public static void main(String args[]) {

       Connection con=ConnectionClass.getConnection(args);
       String createString;
       createString = "create table Options" + 
                "(Code varchar(10) references Soap(Code), " +
                 "Scent varchar(400), " +
                 "Scentimage varchar(400), " +
                 "Category varchar(400), " +
                 "Female varchar(400), " +
                 "Male varchar(400));";
   
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




