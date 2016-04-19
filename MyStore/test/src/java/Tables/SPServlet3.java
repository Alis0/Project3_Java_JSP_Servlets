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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdbc.ConnectionPool;

/**
 *
 * @author A
 */
public class SPServlet3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //String url="/SiteLayout/CenterPanel/BrowseProducts.jsp";
        try {
            ServletContext servletContext = getServletContext();
            ConnectionPool connectionPool = (ConnectionPool) servletContext.getAttribute("connectionPool");

            Connection connection = null;
            try {
                connection = connectionPool.getConnection();

                connection.setAutoCommit(false);

                Statement statement = connection.createStatement();

                SP_Bean sp = new SP_Bean();
                sp.processQuery(request, statement);

                Statement statement2 = connection.createStatement();

                Options_Bean.processQ(request, statement2);

                connection.commit();
            } catch (SQLException e) {
            }

            if (connection != null) {
                connectionPool.free(connection);
            }
        } finally {

            String p = request.getParameter("param");

            if (p != null) {
                RequestDispatcher dispatcher
                        = getServletContext().getRequestDispatcher("/SiteLayout/CenterPanel/Products/ProductPages/" + p + ".jsp");
                dispatcher.forward(request, response);
            }

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
