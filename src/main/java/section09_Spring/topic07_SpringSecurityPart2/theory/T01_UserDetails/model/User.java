package section09_Spring.topic07_SpringSecurityPart2.theory.T01_UserDetails.model;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.model.Role;

// TODO
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String login;
    private String password;
    @ManyToMany

    private Set<section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.model.Role> roles;

    public Set<section09_Spring.topic06_SpringSecurityPart1.theory.T05_ObtainInformationAboutCurrentUser.model.Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
