package com.example.buoi11_filter.authentication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/b11/login")
public class LoginServlet extends HttpServlet {

    // GET - Hiển thị giao diện
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/login.jsp")
                .forward(req, resp);
    }

    // POST - Xử lý LOGIC
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("phongtt35".equalsIgnoreCase(username)
            && "phongtt35".equals(password)) {
            // ĐĂNG NHẬP THÀNH CÔNG
            // LƯU VÀO SESSION
            req.getSession().setAttribute("username", username);
            resp.sendRedirect("/app/after-login.jsp");

        } else { // LOGIN thất bại
            // Gán tin nhắn
            req.setAttribute("errMessage", "Sai TK hoặc MK!");
            // Chuyển trang
            req.getRequestDispatcher("/WEB-INF/view/login.jsp")
                    .forward(req, resp);
        }
    }
}
