package org.example;

import jakarta.persistence.EntityManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainO_C {
    public static void main(String[] args) {
        try( SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Client.class)
                .buildSessionFactory()) {

            EntityManager entityManager = sessionFactory.createEntityManager();



                System.exit(1);

            entityManager.getTransaction().begin();
            try {


                entityManager.getTransaction().commit();
            }catch (Exception e){
                entityManager.getTransaction().rollback();
                System.out.println(e.getMessage());
            }



        }catch (Exception e){

            System.out.println(e.getMessage());
        }

        }
}
