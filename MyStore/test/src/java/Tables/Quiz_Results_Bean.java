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
import javax.servlet.http.HttpSession;

/**
 *
 * @author A
 */
public class Quiz_Results_Bean {

    private String Name;
    private String Bpimage;
    private String Scent;
    private String Scentimage;
    private String Category;
    private String Skintype;
    private String Female;
    private String Male;

    public String toString()
    {
        return Name + " " + Scent;
    }
    public Quiz_Results_Bean() {
    }

 

    public String getName() {
        return Name;
    }

    public String getBpimage() {
        return Bpimage;
    }

    public String getScent() {
        return Scent;
    }

    public String getScentimage() {
        return Scentimage;
    }

    public String getCategory() {
        return Category;
    }

    public String getSkintype() {
        return Skintype;
    }

    public String getFemale() {
        return Female;
    }

    public String getMale() {
        return Male;
    }

    //-------------------------------------------------------------------------
  /*

    public void setName(String n) {
        Name = n;
    }

    public void setBpimage(String bpi) {
        Bpimage = bpi;
    }

    public void setScent(String sc) {
        Scent = sc;
    }

    public void setScentimage(String si) {
        Scentimage = si;
    }

    public void setCategory(String c) {
        Category = c;
    }

    public void setSkintype(String s) {
        Skintype = s;
    }

    public void setFemale(String f) {
        Female = f;
    }

    public void setMale(String m) {
        Male = m;
    }
*/
    //----------------------------------------------------------------------------------
 /*  public static void quizResults( HttpServletRequest request, Statement statement) throws SQLException {

   
    
     String sql = "select Soap.Name, Soap.Bpimage, Soap.Skintype, Options.Scentimage, "
     + "Options.Scent, Options.Category, Options.Female, Options.Male, Quiz.Category, "
     + "Quiz.Skintype, Quiz.Female, Quiz.Male from Soap, Quiz, Options "
     + "where Soap.Skintype = Quiz.Skintype AND Quiz.Category = Options.Category "
     + "AND Quiz.Male = Options.Male OR Quiz.Female = Options.Female; ";
    
    
     ResultSet rs = statement.executeQuery(sql);
        
     ArrayList<Quiz_Results_Bean> qrb  = new ArrayList<Quiz_Results_Bean>();

     while (rs.next()) {

     String name = rs.getString("Name");
     String bpimage = rs.getString("Bpimage");
     String scentimage = rs.getString("Scentimage");
     String scent = rs.getString("Scent");
     String category = rs.getString("Category");
     String skintype = rs.getString("Skintype");
     String female = rs.getString("Female");
     String male = rs.getString("Male");
            
            
     System.out.println(name+" "+bpimage+ " " + scentimage);
    

     Quiz_Results_Bean qr = new Quiz_Results_Bean();

     qr.setName(name);
     qr.setBpimage(bpimage);
     qr.setScentimage(scentimage);
     qr.setScent(scent);
     qr.setCategory(category);
     qr.setSkintype(skintype);
     qr.setFemale(female);
     qr.setMale(male);
            
            
     qrb.add(qr);
     }
     request.setAttribute("QuizR", qrb);
     statement.close();

     }
     */
    public static void quizResults(HttpServletRequest request, Statement statement) throws SQLException {
        String sql = "select Soap.Name, Soap.Bpimage, Soap.Skintype, Options.Scentimage, "
                + "Options.Scent, Options.Category, Options.Female, Options.Male, Quiz.Category, "
                + "Quiz.Skintype, Quiz.Female, Quiz.Male from Soap, Quiz, Options "
                + "where Soap.Skintype = Quiz.Skintype AND Quiz.Category = Options.Category "
                + "AND Quiz.Male = Options.Male OR Quiz.Female = Options.Female; ";

// "select Soap.Name, Soap.Bpimage, Soap.Skintype, Options.Scentimage, Options.Scent, Options.Category, Options.Female, Options.Male, Quiz.Category, Quiz.Skintype, Quiz.Female, Quiz.Male from Soap, Quiz, Options where Soap.Skintype = Quiz.Skintype AND Quiz.Category = Options.Category AND Quiz.Male = Options.Male OR Quiz.Female = Options.Female; "
        ResultSet rs = statement.executeQuery(sql);

        ArrayList<Quiz_Results_Bean> qrb = new ArrayList<Quiz_Results_Bean>();
        if (rs != null) {
            while (rs.next()) {
                Quiz_Results_Bean quizrb = new Quiz_Results_Bean();
                quizrb.Name = rs.getString("Name");
                quizrb.Bpimage = rs.getString("Bpimage");
                quizrb.Skintype = rs.getString("Skintype");
                quizrb.Scentimage = rs.getString("Scentimage");
                quizrb.Scent = rs.getString("Scent");
                quizrb.Category = rs.getString("Category");
                quizrb.Female = rs.getString("Female");
                quizrb.Male = rs.getString("Male");

                qrb.add(quizrb);

                System.out.println(qrb);

            }
        }
        request.setAttribute("qrb", qrb);
        statement.close();
    }

}
