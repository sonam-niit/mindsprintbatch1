package mindsprint.daoimpl;

import mindsprint.dao.UseDAO;
import mindsprint.model.User;
import mindsprint.util.DBConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UseDAO {
    @Override
    public int addUser(User user) throws SQLException {
        Connection conn = DBConfig.getConnection();
        PreparedStatement pst= conn.prepareStatement("insert into user (name,email,country) values(?,?,?)");
        pst.setString(1,user.getName());
        pst.setString(2,user.getEmail());
        pst.setString(3,user.getCountry());

        return  pst.executeUpdate();
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        Connection conn= DBConfig.getConnection();
        Statement statement= conn.createStatement();
        ResultSet resultSet =statement.executeQuery("select * from user");
        ArrayList arrayList= new ArrayList();
        while (resultSet.next()){
            arrayList.add(new User(resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),resultSet.getString(4)));
        }
        return  arrayList;
    }

    @Override
    public int updateUser(User user, int id) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User searchUser(String name) throws SQLException {
        Connection conn= DBConfig.getConnection();
        PreparedStatement statement= conn.prepareStatement("select * from user where name=?");
        statement.setString(1,name);
        ResultSet resultSet =statement.executeQuery();
        if(resultSet.next()){
            User user=new User(resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),resultSet.getString(4));
            return  user;
        }else{
            return null;
        }

    }
}
