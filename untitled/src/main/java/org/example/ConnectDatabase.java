package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
    private  String hostName = "localhost:3306";
    private String dbName = "customer";
    private String userName = "root";
    private String passWord = "deobiet123";

    private String url = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url,userName,passWord);
            System.out.println("Kết nối thành công");
        }catch (SQLException e){
            System.out.println("Kết nối không thành công");
        }
        return conn;
    }

}
