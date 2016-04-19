/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.ConnectionPool;

/**
 *
 * @author A
 */
public class SPServlet4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/SiteLayout/CenterPanel/Cart.jsp";

        try {
            ServletContext servletContext = getServletContext();
            ConnectionPool connectionPool = (ConnectionPool) servletContext.getAttribute("connectionPool");

            Connection connection = null;
            try {
                connection = connectionPool.getConnection();

                Statement statement = connection.createStatement();

                ArrayList<Cart> cartArr;
                HttpSession session = request.getSession(true);

                cartArr = (ArrayList<Cart>) session.getAttribute("Cart");
                if (cartArr == null) {
                    cartArr = new ArrayList<>();
                    session.setAttribute("Cart", cartArr);
                }

                Cart.update(cartArr, request);

            } catch (SQLException e) {
            }

            if (connection != null) {
                connectionPool.free(connection);
            }
        } finally {

            RequestDispatcher dispatcher = request.getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
