package com.example.buoi7_hibernate_p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class TestHIbernate {

    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getFactory();
        Session session = factory.openSession();

        Query<Product> query = session.createQuery("FROM Product p", Product.class);
        List<Product> products = query.getResultList();

        for(Product product : products) {
            System.out.println(product.getProductId() + " - " + product.getProductName());
        }
    }
}
