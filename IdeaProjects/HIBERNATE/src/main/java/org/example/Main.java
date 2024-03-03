package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.text.html.parser.Entity;
import java.time.Instant;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        try( SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Producer2.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory()) {

            EntityManager entityManager= sessionFactory.createEntityManager();

            Producer2 producer=new Producer2();
            producer.setProducerName("test2");
            producer.setAdress("test3");
            producer.setEmail("test5");


            Product product=new Product();

            product.setName("test1");
            product.setDescription("test4");
            product.setPrice(122.00);
            product.setProducer2(producer);

            producer.setProduct(product);

            entityManager.getTransaction().begin();
            try {
                entityManager.persist(producer);
                entityManager.persist(product);

            }catch (Exception e){
                entityManager.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
            entityManager.getTransaction().commit();


        }catch (Exception e){

            System.out.println(e.getMessage());
        }

    }
}
