package org.example;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;

public class UserService {
    ConnectDatabase connectDatabase ;

    public UserService() {
        connectDatabase =new ConnectDatabase();
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> list =new ArrayList<>();
        Connection conn =connectDatabase.connect();

        String query ="select * from user;";

        try {
            Statement stm =conn.createStatement();
            ResultSet rs =stm.executeQuery(query);

            //duyệt kết quả
            while (rs.next()){
                int id = rs.getInt("id");
                String userName =rs.getString("user_name");
                String email =rs.getString("email");
                String passWord =rs.getString("password");

                list.add(new User(id,userName,email,passWord));
            }
            conn.close();
        }catch (SQLException e ){
            throw  new RuntimeException(e);
        }

           return list;
    }
    public void insert(){
        Connection conn =connectDatabase.connect();
        String query = "insert into user (id,user_name,email,password)\n" +
                "value(null,?, ?,?);";
        String encodePassword = BCrypt.hashpw("123456",BCrypt.gensalt(12));
      try {
          PreparedStatement pstm =conn.prepareStatement(query);
          pstm.setString(1,"hoa");
          pstm.setString(2,"hoa@gmail.com");
          pstm.setString(3,encodePassword);

          int row =pstm.executeUpdate();
          if (row != 0){
              System.out.println("Thêm thành công");
          }
          conn.close();
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
    }
    public User getUserByid(int fid ){
        User u =new User();
        Connection conn =connectDatabase.connect();
        String query = "call getUserById(?);";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
              pstm.setInt(1,fid);
              ResultSet rs =pstm.executeQuery();
              while (rs.next()){
                  int id = rs.getInt("id");
                  String userName =rs.getString("user_name");
                  String email =rs.getString("email");
                  String passWord =rs.getString("password");

                  u = new User(id,userName,email,passWord);

              }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
