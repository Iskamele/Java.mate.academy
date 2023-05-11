package section08_Hibernate.topic05_CriteriaAPI.practice.HibernateCriteriaQuery.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import section08_Hibernate.topic05_CriteriaAPI.practice.HibernateCriteriaQuery.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PhoneDaoImplAlternative extends AbstractDao implements PhoneDao {
    public PhoneDaoImplAlternative(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Phone create(Phone phone) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = factory.openSession();
            transaction = session.beginTransaction();
            session.save(phone);
            transaction.commit();
            return phone;
        } catch (Exception e) {
            throw new RuntimeException("Can't create phone for: " + phone, e);
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Phone> findAll(Map<String, String[]> params) {
        try (Session session = factory.openSession()) {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Phone> query = cb.createQuery(Phone.class);
            Root<Phone> phoneRoot = query.from(Phone.class);
            Predicate conjunction = cb.conjunction();
            for (Map.Entry<String, String[]> entry : params.entrySet()) {
                CriteriaBuilder.In<Object> in = cb.in(phoneRoot.get(entry.getKey()));
                Stream.of(entry.getValue()).forEach(in::value);
                conjunction = cb.and(conjunction, in);
            }
            query.where(conjunction);
            return session.createQuery(query).getResultList();
        } catch (Exception e) {
            String paramsString = params.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + Arrays.toString(entry.getValue()))
                    .collect(Collectors.joining(", "));
            throw new RuntimeException("Can't find phones for params: " + paramsString, e);
        }
    }
}
