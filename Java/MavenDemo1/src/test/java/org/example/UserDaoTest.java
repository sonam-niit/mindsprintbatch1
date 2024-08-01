package org.example;
import mindsprint.dao.UseDAO;
import mindsprint.daoimpl.UserDAOImpl;
import mindsprint.model.User;
import org.junit.jupiter.api.*;

import java.sql.SQLException;

public class UserDaoTest {
    UseDAO dao;
    @BeforeEach
    public void setup(){
        dao= new UserDAOImpl();
    }
    @AfterEach
    public void tearDown(){
        dao=null;
    }
    @Disabled
    @Test
    public void addUser() throws SQLException {
        Assertions.assertEquals(1,
                dao.addUser(new User("TestUser","test@gmail.com","India")));
    }
    @Test
    public void testGetAll() throws SQLException{
        Assertions.assertEquals(3,dao.getAllUsers().size());
    }
    @Test
    public void searchUser() throws SQLException{
        Assertions.assertNotNull(dao.searchUser("alex"));
        Assertions.assertNull(dao.searchUser("sonam"));
    }
}
