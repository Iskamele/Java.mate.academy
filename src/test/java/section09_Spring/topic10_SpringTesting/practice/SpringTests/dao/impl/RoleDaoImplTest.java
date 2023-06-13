package section09_Spring.topic10_SpringTesting.practice.SpringTests.dao.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.dao.RoleDao;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.exception.DataProcessingException;
import section09_Spring.topic10_SpringTesting.practice.SpringTests.model.Role;

class RoleDaoImplTest extends AbstractTest {
    private static final String MODERATOR_ROLE = "MODERATOR";
    private RoleDao roleDao;
    private Role adminRole;

    @BeforeEach
    void setUp() {
        roleDao = new RoleDaoImpl(getSessionFactory());
        adminRole = roleDao.save(new Role(Role.RoleName.ADMIN));
    }

    @Override
    protected Class<?>[] entities() {
        return new Class[]{Role.class};
    }

    @Test
    void save_saveRole_Ok() {
        //arrange
        Long expectedAdminId = 1L;

        //assert
        Assertions.assertEquals(expectedAdminId, adminRole.getId());
        Assertions.assertEquals(Role.RoleName.ADMIN, adminRole.getRoleName());
    }

    @Test
    void save_saveNull_NotOk() {
        //assert
        Assertions.assertThrows(DataProcessingException.class, () -> roleDao.save(null));
    }

    @Test
    void getRoleByName_validName_Ok() {
        //act
        Role actualAdminRole = roleDao.getRoleByName(adminRole.getRoleName().name()).orElseThrow();

        //assert
        Assertions.assertEquals(adminRole, actualAdminRole);
    }

    @Test
    void getRoleByName_notValidName_NotOk() {
        //assert
        Assertions.assertThrows(DataProcessingException.class,
                () -> roleDao.getRoleByName(MODERATOR_ROLE));
    }

    @Test
    void getRoleByName_nullNameOk() {
        //assert
        Assertions.assertThrows(DataProcessingException.class,
                () -> roleDao.getRoleByName(null));
    }
}
