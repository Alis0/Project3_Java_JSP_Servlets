package Tables;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Cart {

    private String Name = "noName";

    private String Bpimage = "noimage";

    private int Qty;

    private String Scent;

    private double Price;

    private double Total;

    private double Grandtotal;

    private int Index;

    public String toString() {
        return Name + " : " + Bpimage + " : " + Qty + " : " + Scent;
    }

    public Cart() {

    }

    public String getName() {
        return Name;
    }

    public String getBpimage() {
        return Bpimage;
    }

    public int getQty() {
        return Qty;
    }

    public String getScent() {
        return Scent;
    }

    public double getPrice() {
        return Price;
    }

    public int getIndex() {
        return Index;
    }

    public double getTotal() {
        return Total;
    }

    public double getGrandtotal() {
        return Grandtotal;
    }

    public void setName(String n) {
        if (n != null) {

            Name = n;
        }
    }

    public void setBpimage(String b) {
        if (b != null) {
            Bpimage = b;
        }
    }

    public void setQty(int q) {
        Qty = q;
    }

    public void setScent(String s) {
        if (s != null) {
            Scent = s;
        }
    }

    public void setPrice(double p) {
        Price = p;
    }

    public void setIndex(int i) {
        Index = i;
    }

    public void setTotal(double t) {
        Total = t;
    }

    public void setGrandtotal(double gt) {
        Grandtotal = gt;
    }

    public static void update(ArrayList<Cart> cartArr, HttpServletRequest request) throws SQLException {
        String action = request.getParameter("action");

        String name = request.getParameter("Name");
        String bpimage = request.getParameter("Bpimage");

//-----------------------------------------------------------------------
        String p = request.getParameter("Price");
        double price = 0;
        if (p != null) {
            price = Double.parseDouble(p.trim());
        }

//------------------------------------------------------        
        String q = request.getParameter("Qty");
        int qty = 0;
        if (q != null) {
            qty = Integer.parseInt(q.trim());
        }

//----------------------------------------------------------
        String scent = request.getParameter("Scent");
//--------------------------------------------------------------------
        String s = request.getParameter("index");
        System.out.println("s index equals: " + s);
        int index = -1;
        if (s != null) {
            index = Integer.parseInt(s.trim());
        }

//--------------------------------------------------------------------
        Cart ctb = new Cart();

        ctb.setName(name);
        ctb.setBpimage(bpimage);
        ctb.setPrice(price);
        ctb.setQty(qty);
        ctb.setScent(scent);
        ctb.setIndex(index);
//---------------------------------------------------------------

        Double total = Math.floor((qty * price) * 100) / 100;
//================================================================
        Double grandtotal = 0.00;

        grandtotal = grandtotal + total;

//==============================================================
        switch (action) {

            case "add":

                System.out.println("Total= " + total);

                ctb.setTotal(total);
                ctb.setGrandtotal(grandtotal);

                cartArr.add(ctb);
                break;
//-------------------------------------------------------

            case "remove from cart":

                System.out.println("remove index equals: " + index);
                cartArr.remove(index);

                break;

            //-----------------------------------------------------------               
            case "update qty":

                System.out.println("update index equals: " + index);

                Cart ct = new Cart();
                ct = cartArr.get(index);

                ct.setQty(qty);
                System.out.println("index at update = " + index);

                ct.setTotal(total);
                ct.setGrandtotal(grandtotal);
                break;
         //-----------------------------------------------------------------------

            case "Cart Totals":
                Cart c = new Cart();
                c.setGrandtotal(grandtotal);

                break;
        }

        //====================================================================      
        request.setAttribute("cartArr", cartArr);
    }

}
