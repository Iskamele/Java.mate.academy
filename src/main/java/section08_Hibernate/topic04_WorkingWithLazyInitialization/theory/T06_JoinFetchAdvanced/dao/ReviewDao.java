package section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.dao;

import section08_Hibernate.topic04_WorkingWithLazyInitialization.theory.T06_JoinFetchAdvanced.model.Review;

public interface ReviewDao {
    Review save(Review entity);

    Review get(Long id);
}
