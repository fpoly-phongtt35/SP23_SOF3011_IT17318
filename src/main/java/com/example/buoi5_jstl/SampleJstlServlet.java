package com.example.buoi5_jstl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/sample-jstl-1")
public class SampleJstlServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NguoiYeu[] danhSachNguoiYeu = new NguoiYeu[] {
          new NguoiYeu("An", 2000),
          new NguoiYeu("Bình", 2004),
          new NguoiYeu("Cúc", 2005)
        };

        // Truyền danh sách sang JSP
        req.setAttribute("danhSachNY", danhSachNguoiYeu);

        req.getRequestDispatcher("/WEB-INF/view/sample-jstl.jsp")
                .forward(req, resp);
    }
}
