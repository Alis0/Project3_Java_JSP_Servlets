/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tables;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
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
public class SPServlet5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url = "/SiteLayout/CenterPanel/Quiz.jsp";

        try {
            ServletContext servletContext = getServletContext();
            ConnectionPool connectionPool = (ConnectionPool) servletContext.getAttribute("connectionPool");

            Connection connection = null;
            try {
                connection = connectionPool.getConnection();

                connection.setAutoCommit(false);
                
                Statement statement = connection.createStatement();

                Quiz_Bean.add2QuizDB(request, statement);

                Statement statement2 = connection.createStatement();

                
                Quiz_Results_Bean.quizResults(request, statement2);


                connection.commit();

            } catch (SQLException e) {
                System.out.println("abcdefg exception");
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
