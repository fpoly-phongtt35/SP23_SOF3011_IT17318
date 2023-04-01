package com.example.buoi12_review_1;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter({"/b11/admin/*", "/b12/admin/*"})
public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpSession httpSession = req.getSession();

        // Lấy thông tin username trong session
        String username = (String) httpSession.getAttribute("username");
        if (username == null) { // chưa đăng nhập
            servletResponse.getWriter().append("<h1> 403 </h1>");
        } else { // đã đăng nhập
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}
