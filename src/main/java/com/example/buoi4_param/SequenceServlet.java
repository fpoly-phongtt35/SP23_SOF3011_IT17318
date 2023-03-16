package com.example.buoi4_param;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SequenceServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lấy giá trị của tham số có tên là "end"
        String endStr = req.getParameter("end");

        // Chuyển giá trị chuỗi thành số
        Integer end = Integer.valueOf(endStr);

        // Duyệt từ 1 -> end và in ra giao diện
        for(int i = 1; i <= end; i++) {
            resp.getWriter().append(i + " ");
        }
    }
}
