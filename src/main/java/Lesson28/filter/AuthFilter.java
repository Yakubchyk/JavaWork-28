package Lesson28.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.*;

//
//@WebFilter(servletNames = {"RegServlet", "LoginServlet"})
//public class SecurityFilter extends HttpFilter {


@WebFilter("/calc")
public class AuthFilter extends HttpFilter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        if (req.getSession().getAttribute("user") == null) {
            resp.sendRedirect(req.getContextPath() + "/pages/reg.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }
}

//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        if (req.getSession().getAttribute("user") == null) {
//            chain.doFilter(req,res);
//        } else {
//            res.sendRedirect("/");
//        }
//    }

