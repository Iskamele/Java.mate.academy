package section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.AbstractDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.dao.ShoppingCartDao;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.exception.DataProcessingException;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.ShoppingCart;
import section09_Spring.topic07_SpringSecurityPart2.practice.SpringSecurityPartTwo.model.User;

@Repository
public class ShoppingCartDaoImpl extends AbstractDao<ShoppingCart> implements ShoppingCartDao {
    public ShoppingCartDaoImpl(SessionFactory factory) {
        super(factory, ShoppingCart.class);
    }

    @Override
    public ShoppingCart getByUser(User user) {
        try (Session session = factory.openSession()) {
            Query<ShoppingCart> getByUser = session.createQuery(
                    "SELECT DISTINCT sc FROM ShoppingCart sc "
                            + "left join fetch sc.tickets t "
                            + "left join fetch t.movieSession ms "
                            + "left join fetch ms.cinemaHall "
                            + "left join fetch ms.movie "
                            + "WHERE sc.user = :user", ShoppingCart.class);
            getByUser.setParameter("user", user);
            return getByUser.getSingleResult();
        } catch (Exception e) {
            throw new DataProcessingException("Not found shopping cart for user " + user, e);
        }
    }
}
