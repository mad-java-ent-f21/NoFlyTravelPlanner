package com.jvjohnson1.no_fly.controller;

import com.jvjohnson1.no_fly.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userData = new UserDao();
//        String searchName = req.getParameter("searchTerm");
//        if (searchName == null) {
            req.setAttribute("users", userData.getAll());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/showUsers.jsp");
            dispatcher.forward(req, resp);
//        } else {
//            req.setAttribute("users", userData.searchByLastName(searchName));
//            RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
//            dispatcher.forward(req, resp);
//        }
    }
}