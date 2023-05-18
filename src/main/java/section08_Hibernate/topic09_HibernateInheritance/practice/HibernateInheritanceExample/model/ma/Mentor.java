package section08_Hibernate.topic09_HibernateInheritance.practice.HibernateInheritanceExample.model.ma;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor extends Person {

}
