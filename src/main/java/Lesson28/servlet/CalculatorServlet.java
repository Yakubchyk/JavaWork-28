package Lesson28.servlet;

import Lesson28.model.Operation;
import Lesson28.service.OperationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalculatorServlet extends HttpServlet {
        private final OperationService operationService = new OperationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }

    @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            final double num1 = Double.parseDouble(req.getParameter("num1"));
            final double num2 = Double.parseDouble(req.getParameter("num2"));
            String type = req.getParameter("type");

            Operation operation = new Operation(num1, num2, type);


            Operation executedOperation = operationService.getResult(operation);

            req.setAttribute("operation", executedOperation);

            getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
        }
    }
//        double result = 0;
//        switch (type) {
//            case "sum":
//                Operation sum = new SumOperation(num1, num2);
//                result = sum.getResult();
//                break;
//            case "sub":
//                Operation sub = new SubOperation(num1, num2);
//                result = sub.getResult();
//                break;
//            case "mul":
//                Operation mul = new MulOperation(num1, num2);
//                result = mul.getResult();
//                break;

//            default:
//                req.setAttribute("errorMessage", "Invalid operation type.");
//                req.getRequestDispatcher("/pages/calc.jsp").forward(req, resp);



