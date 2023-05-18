package section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache;

import section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.dao.AuthorDao;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.dao.AuthorDaoImpl;
import section08_Hibernate.topic010_HibernateCacheLevels.theory.T03_SecondLevelCache.model.Author;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {
        /*
         1. Add dependencies hibernate-ehcache
         2. Add properties
            - hibernate.cache.use_second_level_cache
            - hibernate.cache.region.factory_class
         3. Add annotations
            - @Cacheable
            - @org.hibernate.annotation.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
         4. Call method 'authorDao.get(1L);' twice
         5. See how many selects will be displayed in logs

         */

        // В рамках разных сессий, но в одной SessionFactory, будет работать кеширование
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        AuthorDao authorDao = new AuthorDaoImpl(sessionFactory);

        Author agatha = new Author("Agatha Christie");
        Author lesya = new Author("Lesya Ukrainka");
        Author victor = new Author("Victor Hugo");

        authorDao.save(agatha);
        authorDao.save(lesya);
        authorDao.save(victor);

        Author authorFromDB = authorDao.get(1L);
        Author anotherAuthorFromDB = authorDao.get(1L);

        System.out.println(authorFromDB);
        System.out.println(anotherAuthorFromDB);
        sessionFactory.close();

    }
}
