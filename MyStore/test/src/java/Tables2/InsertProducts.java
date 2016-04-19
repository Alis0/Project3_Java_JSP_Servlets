/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables2;

import java.sql.*;

public class InsertProducts {

    public static void main(String args[]) {
        Connection con = ConnectionClass.getConnection(args);
        Statement stmt;
        String query = "select Productid, Code, Name, Description,"
                + "Ingredients, Bpimage, Image, Price, Skintype from Soap";

        if (con == null) {
            System.out.println("Unable to create connection");
            return;
        }

        try {
            stmt = con.createStatement();

            stmt.executeUpdate("insert into Soap "
                    + "values( '0', 'A1000', 'Get Clean Anti-Aging Soap', 'The Get clean Anti-Aging Soap will have you looking "
                    + "years younger.  Rich avocado oil and shea butter moisturize you skin while age reversing carrot "
                    + "seed and tea tree oils work turn back the hands of time thanks to their skin firming and wrinkle reducing properties.',"
                    + "'Ingredients: Sodium Hydroxide(lye), Coconut Oil, Palm Oil, Caster Oil, Tea Tree Seed Oil, Tea Tree Oil, "
                    + "Carrot Seed Oil, Shea Butter, Avocado Butter, Brazilian Clay',"
                    + " '/productImages/productBPImages/A1000bp.jpg', '/productImages/MainImage/A1000.jpg', '8.95', 'Anitage')");

            stmt.executeUpdate("insert into Soap "
                    + "values( '0', 'A1001', 'Get Clean Dry Skin Soap', 'The Get Clean Dry Skin Soap remedies dry and flaking skin.  "
                    + "It contains avocado and shea which leave your skin feeling rich and moisturized.  Also, caster oil acts as a natural "
                    + "humectant, drawing moisture to your skin.',"
                    + "'Ingredients: Sodium Hydroxide(lye), Coconut Oil, Palm Oil, Caster Oil,  Shea Butter, Avocado Butter, Brazilian Clay',"
                    + " '/productImages/productBPImages/A1001bp.jpg', '/productImages/MainImage/A1001.jpg', '7.60', 'Dry')");

            stmt.executeUpdate("insert into Soap "
                    + "values( '0', 'A1002', 'Get Clean Sensitive Skin Soap', 'The Get Clean Sensitive Skin soap is great for inflamed or acne prone skin. "
                    + " It contains anti inflammatory Chia Seed and Cammomile oils, and added Kaolin clay absorbs excess oil. ',"
                    + "'Ingredients: Sodium Hydroxide(lye), Coconut Oil, Palm Oil, Sunflower Oil, Chia Seed Oil, Chammomile Oil, Shea Butter, Kaolin Clay, Brazilian Clay',"
                    + " '/productImages/productBPImages/A1002bp.jpg', '/productImages/MainImage/A1002.jpg', '8.00', 'Sensitive')");

            stmt.executeUpdate("insert into Soap "
                    + "values( '0', 'A1003', 'Get Clean Oily Skin Soap', 'The Get Clean Oily Skin Soap  will make you skin feel fresh, clean, and dry.  "
                    + "Kaolin clay helps to absorb excess oil while sunflower oil and shea provide just enough moisture for glowing, healthy skin.',"
                    + "'Ingredients: Sodium Hydroxide(lye), Coconut Oil, Palm Oil, Sunflower Oil,  Shea Butter, Brazilian Clay, Kaolin Clay',"
                    + " '/productImages/productBPImages/A1003bp.jpg', '/productImages/MainImage/A1003.jpg', '7.45', 'Oily')");

            stmt.executeUpdate("insert into Soap "
                    + "values( '0', 'A1004', 'Get Clean Basic Soap', 'The Get Clean Basic Soap is great for all skin types.  "
                    + "Our perfectly balanced formula contains just the right amount of natural soap and oils(including Cocount, "
                    + "sustainable palm, and sunflower oils) to help make your skin look fresh and radiant.',"
                    + "'Ingredients: Sodium Hydroxide(lye), Coconut Oil, Palm Oil, Sunflower Oil,  Shea Butter, Brazilian Clay',"
                    + " '/productImages/productBPImages/A1004bp.jpg', '/productImages/MainImage/A1004.jpg', '7.20', 'Combination')");

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Soap:  Productid, Code, Name, Description,"
                    + "Ingredients, Bpimage, Image, Price, Skintype ");
            while (rs.next()) {
                String PID = rs.getString("Productid");
                String PC = rs.getString("Code");
                String PN = rs.getString("Name");
                String PD = rs.getString("Description");
                String PING = rs.getString("Ingredients");
                String PBI = rs.getString("Bpimage");
                String PI = rs.getString("Image");
                Double p = rs.getDouble("Price");
                String st = rs.getString("Skintype");

                System.out.println(PID + "   " + PC + "   " + PN + "   " + PD + "   " + PING + "  " + PBI + "  " + PI + "  " + p + " " + st);
            }

            stmt.close();
            con.close();

        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
