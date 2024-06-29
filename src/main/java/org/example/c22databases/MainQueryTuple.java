package org.example.c22databases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;

import java.util.List;
import java.util.stream.Stream;

public class MainQueryTuple {

    public static void main(String[] args) {

        List<Artist> artists = null;
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "c22databases");
             EntityManager em = emf.createEntityManager();) {

            var transaction = em.getTransaction();
            transaction.begin();
            artists = getArtistsJPQL(em, "%Greatest Hits%");
            artists.forEach(System.out::println);

//            var names = getArtistNames(em, "%Stev%");
//            names
//                    .map(a -> new Artist(
//                            a.get("id", Integer.class),
//                            (String) a.get("name")))
//                    .forEach(System.out::println);

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Artist> getArtistsJPQL(EntityManager em, String matchedValue) {

//        String jpql = "SELECT a FROM Artist a WHERE a.artistName LIKE ?1";
        String jpql = "SELECT a FROM Artist a JOIN albums album " +
                "WHERE album.albumName LIKE ?1 OR album.albumName LIKE ?2";
        var query = em.createQuery(jpql, Artist.class);
        query.setParameter(1, matchedValue);
        query.setParameter(2, "%Best of%");
        return query.getResultList();
    }

    private static Stream<Tuple> getArtistNames(EntityManager em, String matchedValue) {

        String jpql = "SELECT a.artistId id, a.artistName as name FROM Artist a " +
                "WHERE a.artistName LIKE ?1";
        var query = em.createQuery(jpql, Tuple.class);
        query.setParameter(1, matchedValue);
        return query.getResultStream();
    }
}
