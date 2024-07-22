package Lesson28.servlet;

import Lesson28.Operations.MulOperation;
import Lesson28.Operations.SubOperation;
import Lesson28.Operations.SumOperation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/_calc")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/pages/_calc.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

req.setAttribute("type", req.getParameter("type"));


        double num1 = Double.parseDouble(req.getParameter("num1"));
        double num2 = Double.parseDouble(req.getParameter("num2"));
        String type = req.getParameter("type");

        double result = 0;
        switch (type) {
            case "sum":
                SumOperation sumOperation = new SumOperation(num1, num2);
                result = sumOperation.getResult();
                break;
            case "sub":
                SubOperation subOperation = new SubOperation(num1, num2);
                result = subOperation.getResult();
                break;
            case "mul":
                MulOperation mulOperation = new MulOperation(num1, num2);
                result = mulOperation.getResult();
                break;


            default:
                req.setAttribute("errorMessage", "Invalid operation type.");
                req.getRequestDispatcher("/_calc.jsp").forward(req, resp);

        }
        req.setAttribute("result", result);
        req.getRequestDispatcher("/pages/_calc.jsp").forward(req, resp);


    }
}
