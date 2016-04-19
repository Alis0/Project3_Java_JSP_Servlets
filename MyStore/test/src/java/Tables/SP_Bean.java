/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
        

/**
 *
 * @author A
 */
public class SP_Bean {



    private String Code;
    private String Name;
    private String Description;
    private String Ingredients;
    private String Bpimage;
    private String Image;
    private double Price;
    private String Skintype;
    
    
    public SP_Bean()
    {
        
    }
  
    public String getCode()
    {
        return Code;
    }
    public String getName()
    {
        return Name;
    }
    public String getDescription()
    {
        return Description;
    }
    public String getIngredients()
    {
        return Ingredients;
    }
    public String getBpimage()
    {
        return Bpimage;
    }
    public String getImage()
    {
        return Image;
    }
    public double getPrice()
    {
        return Price;
    }
    public String getSkintype()
    {
        return Skintype;
    }
    
    
    
    
    public static void processQuery(HttpServletRequest request, Statement statement) throws SQLException
    {
        String sql = "select Productid, Code, Name, Description, Ingredients, Bpimage, Image, Price, Skintype from Soap;";
        ResultSet rs = statement.executeQuery(sql);
        
        ArrayList<SP_Bean> Soap = new ArrayList<SP_Bean>();
        while (rs.next())
        {
            SP_Bean sp = new SP_Bean();
            sp.Code=rs.getString("Code");
            sp.Name=rs.getString("Name");
            sp.Description=rs.getString("Description");
            sp.Ingredients=rs.getString("Ingredients");
            sp.Bpimage=rs.getString("Bpimage");
            sp.Image=rs.getString("Image");
            sp.Price=rs.getDouble("Price");
            sp.Skintype=rs.getString("Skintype");

            
            Soap.add(sp);
        }
        request.setAttribute("Soap", Soap);
        statement.close();
    }
    
    
    
}