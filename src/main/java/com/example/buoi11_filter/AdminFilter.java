package com.example.buoi11_filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter({
        "/b11/admin/*" // Đặt filter cho mọi đường dẫn bắt đầu bởi /b11/admin
        , "/b11/cud-user"
})
public class AdminFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req,
                         ServletResponse resp,
                         FilterChain filterChain)
            throws IOException, ServletException {
        // Lấy mật khẩu trên đường dẫn
        String pwd = req.getParameter("password");

        // Kiểm tra mật khẩu hợp lệ
        if ("123456".equals(pwd)) { // Hợp lệ
            // Cho đi tiếp
            // http://localhost:8080/app/b11/admin?password=123456
            filterChain.doFilter(req, resp);
        } else { // Không hợp lệ
            // http://localhost:8080/app/b11/admin
            resp.getWriter().append("<h1> ERROR 403! FORBIDDEN! </h1>");
        }

    }
}
