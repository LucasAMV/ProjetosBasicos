package org.example;

import org.example.core.HibernateSetup;
import org.example.entidades.Actor;
import org.hibernate.Session;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando");

        HibernateSetup hibernateSetup = new HibernateSetup();

        Session session = hibernateSetup.getSessionFactory().openSession();
        session.beginTransaction();
//        session.save( new Event( "Our very first event!", new Date() ) );
//        session.save( new Event( "A follow up event", new Date() ) );

        Actor actor1 = session.find(Actor.class, 1L);
        System.out.println(actor1);

        session.getTransaction().commit();
        session.close();

        System.out.println("Fim");
    }

}
