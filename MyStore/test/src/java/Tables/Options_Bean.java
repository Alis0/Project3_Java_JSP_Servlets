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
public class Options_Bean {



    private String Code;
    private String Scent;
    private String Scentimage;
    private String Category;
    private String Female;
     private String Male;
    
    
    
    public Options_Bean()
    {
        
    }
  
    public String getCode()
    {
        return Code;
    }
    public String getScent()
    {
        return Scent;
    }
    public String getScentimage()
    {
        return Scentimage;
    }
    public String getCategory()
    {
        return Category;
    }
     public String getFemale()
    {
        return Female;
    }
      public String getMale()
    {
        return Male;
    }
 
    
    
    
    
    public static void processQ(HttpServletRequest request, Statement statement) throws SQLException
    {
        String sql = "select Code, Scent, Scentimage, Category, Female, Male from Options;";
        ResultSet rs = statement.executeQuery(sql);
        
        ArrayList<Options_Bean> Options = new ArrayList<Options_Bean>();
        while (rs.next())
        {
            Options_Bean op = new Options_Bean();
            op.Code=rs.getString("Code");
            op.Scent=rs.getString("Scent");
            op.Scentimage=rs.getString("Scentimage");
            op.Category=rs.getString("Category");
            op.Female=rs.getString("Female");
            op.Male=rs.getString("Male");
            
            
            Options.add(op);
        }
        request.setAttribute("Options", Options);
        statement.close();
    }
    
    
    
}