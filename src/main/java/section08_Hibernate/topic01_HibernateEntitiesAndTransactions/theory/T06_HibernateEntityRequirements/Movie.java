package section08_Hibernate.topic01_HibernateEntitiesAndTransactions.theory.T06_HibernateEntityRequirements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    // Либо конструктор должен быть не переопределённым, чтобы работал hibernate
    // Либо вместе с кастомным нужно добавлять пустой
    // Геттеры и сеттеры
    // Класс должен быть top-level классом (не вложенным, локальным или анонимным)
    // Entity не должен быть final (hibernate не может создать proxy entity's class)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
