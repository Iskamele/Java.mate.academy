package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T09_WhatIsTransaction;

import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.dao.MovieDao;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.dao.MovieDaoImpl;
import section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T08_CreateUserDaoClass.model.Movie;

public class Main {

    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Terminator 5");
        movie.setDescription("Awesome movie");

        movieDao.save(movie);

        Movie movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
    }
}
