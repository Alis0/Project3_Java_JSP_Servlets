/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables2;


import java.sql.*;
     
public class InsertOptions {

   public static void main(String args[]) {
       Connection con=ConnectionClass.getConnection(args);
       Statement stmt;
       String query = "select Code, Scent, Scentimage, Category, Female, Male from Options";
       
       if (con == null)
       {
           System.out.println("Unable to create connection");
           return;
       }

   
       try {
           stmt = con.createStatement();                           
   
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Lavender', '/productImages/scentImages/Lavender.jpg', 'Floral', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'LemonGrass', '/productImages/scentImages/LemonGrass.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'TeaTree', '/productImages/scentImages/TeaTree.jpg', 'Warm', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Peppermint', '/productImages/scentImages/Peppermint.jpg', 'Fresh', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Orange', '/productImages/scentImages/Orange.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Eucalyptus', '/productImages/scentImages/Eucalyptus.jpg', 'Fresh', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Clove', '/productImages/scentImages/Clove.jpg', 'Fresh', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Patchouli', '/productImages/scentImages/Patchouli.jpg', 'Warm', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1000', 'Ginger', '/productImages/scentImages/Ginger.jpg', 'Warm', 'Female', 'Male')");
          
          //----------------------------------------------------------------
           stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Lavender', '/productImages/scentImages/Lavender.jpg', 'Floral', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'LemonGrass', '/productImages/scentImages/LemonGrass.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'TeaTree', '/productImages/scentImages/TeaTree.jpg', 'Warm', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Peppermint', '/productImages/scentImages/Peppermint.jpg', 'Fresh', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Orange', '/productImages/scentImages/Orange.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Eucalyptus', '/productImages/scentImages/Eucalyptus.jpg', 'Fresh', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Clove', '/productImages/scentImages/Clove.jpg', 'Fresh', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Patchouli', '/productImages/scentImages/Patchouli.jpg', 'Warm', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1001', 'Ginger', '/productImages/scentImages/Ginger.jpg', 'Warm', 'Female', 'Male')");
          //--------------------------------------------------------------
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Lavender', '/productImages/scentImages/Lavender.jpg', 'Floral', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'LemonGrass', '/productImages/scentImages/LemonGrass.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'TeaTree', '/productImages/scentImages/TeaTree.jpg', 'Warm', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Peppermint', '/productImages/scentImages/Peppermint.jpg', 'Fresh', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Orange', '/productImages/scentImages/Orange.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Eucalyptus', '/productImages/scentImages/Eucalyptus.jpg', 'Fresh', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Clove', '/productImages/scentImages/Clove.jpg', 'Fresh', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Patchouli', '/productImages/scentImages/Patchouli.jpg', 'Warm', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1002', 'Ginger', '/productImages/scentImages/Ginger.jpg', 'Warm', 'Female', 'Male')");
          
          //--------------------------------------------------------------
  stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Lavender', '/productImages/scentImages/Lavender.jpg', 'Floral', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'LemonGrass', '/productImages/scentImages/LemonGrass.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'TeaTree', '/productImages/scentImages/TeaTree.jpg', 'Warm', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Peppermint', '/productImages/scentImages/Peppermint.jpg', 'Fresh', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Orange', '/productImages/scentImages/Orange.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Eucalyptus', '/productImages/scentImages/Eucalyptus.jpg', 'Fresh', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Clove', '/productImages/scentImages/Clove.jpg', 'Fresh', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Patchouli', '/productImages/scentImages/Patchouli.jpg', 'Warm', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1003', 'Ginger', '/productImages/scentImages/Ginger.jpg', 'Warm', 'Female', 'Male')");
          //---------------------------------------------------------------
          
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Lavender', '/productImages/scentImages/Lavender.jpg', 'Floral', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'LemonGrass', '/productImages/scentImages/LemonGrass.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'TeaTree', '/productImages/scentImages/TeaTree.jpg', 'Warm', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Peppermint', '/productImages/scentImages/Peppermint.jpg', 'Fresh', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Orange', '/productImages/scentImages/Orange.jpg', 'Fruity', 'Female', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Eucalyptus', '/productImages/scentImages/Eucalyptus.jpg', 'Fresh', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Clove', '/productImages/scentImages/Clove.jpg', 'Fresh', 'Female', '')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Patchouli', '/productImages/scentImages/Patchouli.jpg', 'Warm', '', 'Male')");
          stmt.executeUpdate("insert into Options " +
                    "values( 'A1004', 'Ginger', '/productImages/scentImages/Ginger.jpg', 'Warm', 'Female', 'Male')");
          
          //----------------------------------------------------------------
          
       
           
   
           ResultSet rs = stmt.executeQuery(query);
   
           System.out.println("Options:  Code,   Scent,    Category1,   Categry2 ");
           while (rs.next()) {
               String C = rs.getString("Code");
               String S = rs.getString("Scent");
               String Si = rs.getString("Scentimage");
               String C1 = rs.getString("Category");
               String F = rs.getString("Female");
               String M = rs.getString("Male");
               
               System.out.println(C+ "   " +S + "   " +Si + "   "+ C1+ "   " +  F + " " + M);
           }
   
           stmt.close();
           con.close();
   
       } catch(SQLException ex) {
           System.err.println("SQLException: " + ex.getMessage());
       }
   }
}


