/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

public class Quiz_Bean {

    private String Category;
    private String Skintype;
    private String Female;
    private String Male;

    public Quiz_Bean() {

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

    public static void add2QuizDB(HttpServletRequest request, Statement statement) throws SQLException {

        String mySubmit = request.getParameter("mySubmit");

        switch (mySubmit) {
            case "Submit Results":

                String S = request.getParameter("Skintype");
                String C = request.getParameter("Category");
                String F = request.getParameter("Female");
                String M = request.getParameter("Male");

                String sql2 = "DELETE FROM Quiz";
                String sql = "insert into Quiz "
                        + "values('" + S + "', '" + C + "', '" + F + "', '" + M + "');";

                System.out.println(S + " " + C + " " + F + " " + M);

                statement.executeUpdate(sql2);

                statement.executeUpdate(sql);

                statement.close();
                break;
        }

    }

}
