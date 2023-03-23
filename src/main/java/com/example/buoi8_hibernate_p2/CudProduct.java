package com.example.buoi8_hibernate_p2;

import com.example.buoi7_hibernate_p1.HibernateUtil;
import com.example.buoi7_hibernate_p1.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;

public class CudProduct {

    public static void main(String[] args) {
//        deleteById(5000);
        Product product = new Product();
        product.setProductId(5000);
        product.setProductName("Ahehe");
        product.setPrice(BigDecimal.valueOf(92323));
        product.setQuantity(1000);
        create(product);
    }

    public static void create(Product product) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Hàm save() trả về giá trị Khoá chính
        // bỏ qua giá trị khoá chính của tham số truyền vào
        Integer insertedId = (Integer) session.save(product);
        System.out.println(insertedId);

        transaction.commit();

        session.close();
    }

    public static void updateById(Integer id, Product product) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        // Làm gì đó ở đây

        transaction.commit();

        session.close();
    }

    public static void deleteById(Integer id) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        // 1. Tìm sản phẩm theo Id
        // Hàm find() nhận tham số là kiểu Entity và khoá chính
        Product product = session.find(Product.class, id);

        // 1.5 Tạo Transaction
        Transaction transaction = session.beginTransaction();

        // 2. Nếu sản phẩm tồn tại thì xoá
        // Hàm delete() nhận tham số là 1 Entity
        session.delete(product);

        // 2.5 Commit -> Lưu kết quả
        transaction.commit();

        // Trường hợp lỗi, thực hiện trả lại DB ban đầu
        // transaction.rollback();

        // 3. Giải phóng tài nguyên
        session.close();
    }
}
