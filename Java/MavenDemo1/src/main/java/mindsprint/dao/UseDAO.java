package mindsprint.dao;


import mindsprint.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UseDAO {
    public int addUser(User user) throws SQLException;
    public List<User> getAllUsers() throws SQLException;
    public int updateUser(User user,int id);
    public int deleteUser(int id);
    public User searchUser(String name) throws SQLException;
}
