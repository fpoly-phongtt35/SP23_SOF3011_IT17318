package com.example.buoi12_review_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/b12/admin/product/delete")
public class DeleteProductAdminServlet extends HttpServlet {

    private ProductRepository repository = new ProductRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String productIdStr = req.getParameter("productId");

        Integer productId = Integer.valueOf(productIdStr);

        repository.delete(productId);

        resp.sendRedirect("/app/b12/admin/product");
    }
}
