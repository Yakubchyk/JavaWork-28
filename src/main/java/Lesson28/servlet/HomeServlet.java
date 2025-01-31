package Lesson28.servlet;

import Lesson28.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getSession().getAttribute("user") != null) {
            req.setAttribute("user", req.getSession().getAttribute("user"));
            req.getRequestDispatcher("/login.jsp").forward(req, resp);


        } else {
            req.getRequestDispatcher("/pages/reg.jsp").forward(req, resp);
        }
    }
}