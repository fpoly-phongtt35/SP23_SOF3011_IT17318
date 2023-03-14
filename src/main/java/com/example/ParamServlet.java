package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/param.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstNumberStr = req.getParameter("firstNumber");
        String secondNumberStr = req.getParameter("secondNumber");

        Integer firstNumber = Integer.valueOf(firstNumberStr);
        Integer secondNumber = Integer.valueOf(secondNumberStr);

        Integer result = firstNumber + secondNumber;

        resp.getWriter().append("<h1> Kết quả = " + result + " </h1>");
    }
}
