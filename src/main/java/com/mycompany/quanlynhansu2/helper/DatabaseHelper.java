package com.mycompany.quanlynhansu2.helper;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
//       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");     
      Class.forName("com.mysql.cj.jdbc.Driver");
  //     String connectionUrl = "jdbc:sqlserver://localhost;database=BaiTapLon;";
     String connectionUrl = "jdbc:mysql://localhost:3306/hotel?autoReconnect=true&useSSL=false";

       String dbusername = "root";
       String dbpassword = "123456";
       Connection con = DriverManager.getConnection(connectionUrl, dbusername, dbpassword);
       return con;
    }
}


