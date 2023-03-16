package com.example.buoi5_jstl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/nguoi-yeu")
public class NguoiYeuServlet extends HttpServlet {
    private final NguoiYeuRepository repository = new NguoiYeuRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NguoiYeu> danhSachNguoiYeu = repository.layDanhSachNguoiYeu();
        req.setAttribute("dsachNY", danhSachNguoiYeu);
        req.getRequestDispatcher("/WEB-INF/view/nguoi-yeu.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tenNguoiYeu = req.getParameter("tenNy");
        String namSinhStr = req.getParameter("namSinh");
        Integer namSinh = Integer.valueOf(namSinhStr);

        NguoiYeu nym = new NguoiYeu(tenNguoiYeu, namSinh);
        repository.themNguoiYeu(nym);

        resp.sendRedirect("/app/nguoi-yeu");
    }
}
