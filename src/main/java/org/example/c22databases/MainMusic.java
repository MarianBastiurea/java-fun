package org.example.c22databases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class MainMusic {

    public static void main(String[] args) {

        try (var sessionFactory =
                     Persistence.createEntityManagerFactory(
                             "c22databases");
             EntityManager entityManager = sessionFactory.createEntityManager();
        ) {

            var transaction = entityManager.getTransaction();
            transaction.begin();
            Artist artist = entityManager.find(Artist.class, 202);
            System.out.println(artist);
            artist.addAlbum("The Best of Muddy Waters");
            System.out.println(artist);
//            entityManager.remove(artist);
//            entityManager.persist(new Artist("Muddy Water"));
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


