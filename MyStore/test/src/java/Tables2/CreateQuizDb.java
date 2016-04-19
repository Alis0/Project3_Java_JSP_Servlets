
package Tables2;


import Tables2.ConnectionClass;
import java.net.URL;
import java.sql.*;
     
public class CreateQuizDb
{

   public static void main(String args[]) {

       Connection con=ConnectionClass.getConnection(args);
       String createString;
       createString = "create table Quiz" + 
                "(Skintype varchar(50) references Soap(Skintype), " +
                 "Category varchar(400)references Options(Category)," +
                 "Female varchar(400)references Options(Female)," +
                 "Male varchar(400) references Options(Male));";
   
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




