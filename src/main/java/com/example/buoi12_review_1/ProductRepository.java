package com.example.buoi12_review_1;

import com.example.buoi7_hibernate_p1.HibernateUtil;
import com.example.buoi7_hibernate_p1.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ProductRepository {

    public List<Product> findAll() {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        Query<Product> query = session
                .createQuery("FROM Product p", Product.class);
        return query.getResultList();
    }

    public void delete(Integer productId) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Product product = session.get(Product.class, productId);
        if (product != null) { // Nếu tồn tại
            session.delete(product);
            transaction.commit();
        } else {
            transaction.rollback();
        }

    }
}
