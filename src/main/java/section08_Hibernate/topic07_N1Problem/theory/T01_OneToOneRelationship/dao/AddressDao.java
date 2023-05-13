package section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.dao;

import section08_Hibernate.topic07_N1Problem.theory.T01_OneToOneRelationship.model.Address;

public interface AddressDao {
    Address save(Address address);

    Address get(Long id);
}
