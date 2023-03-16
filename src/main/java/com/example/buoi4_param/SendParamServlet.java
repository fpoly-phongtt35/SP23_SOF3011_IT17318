package com.example.buoi4_param;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SendParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String message = req.getParameter("message");
        String title = req.getParameter("title");

//        resp.getWriter().append(message + " " + title);
        req.setAttribute("result", message + " " + title);
        req.setAttribute("messageRtn", message);
        req.setAttribute("titleRtn", title);

        req.getRequestDispatcher("/WEB-INF/view/send-param.jsp")
                .forward(req, resp);
    }
}
