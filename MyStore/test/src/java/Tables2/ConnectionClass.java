/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables2;


import java.net.URL;  
import java.sql.*;  
       
public class ConnectionClass {  
  
   public static Connection getConnection(String args[]) {  
         
       Connection con=null; 
       String urlStr=null;
   
       if (args.length < 2 )   
       {   
            
           
           args = new String[2];
           args[0] = "asummerford";
           args[1] = "G9eV8FueXjhq";
       }  
   
       try {     
             Class.forName("com.mysql.jdbc.Driver").newInstance();   
              
            urlStr =   "jdbc:mysql://russet.wccnet.edu/" + args[0] +
                  "?user="+args[0]+ "&password="+args[1];
            System.out.println("Connecting to : " + urlStr);
            con = DriverManager.getConnection (urlStr);    
      
       } 
       catch(SQLException ex) {   
           System.err.println("SQLException("+urlStr+"): " + ex);   
       }  
       catch (Exception ex)
        {
            System.err.println("Exception("+urlStr+"): " + ex);    
        } 
 
       return con;  
   }  
}  
  


