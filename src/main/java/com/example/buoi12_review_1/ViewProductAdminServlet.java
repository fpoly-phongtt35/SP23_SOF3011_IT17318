package com.example.buoi12_review_1;

import com.example.buoi7_hibernate_p1.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/b12/admin/product")
public class ViewProductAdminServlet extends HttpServlet {

    private final ProductRepository repository = new ProductRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Lấy ds từ kho dữ liệu
        List<Product> productList = repository.findAll();

        // Đóng gói để truyền về giao diện
        req.setAttribute("dsSanPham", productList);

        // Đi đến giao diện
        req.getRequestDispatcher("/WEB-INF/view/b12/crud-product.jsp")
                .forward(req, resp);
    }
}
