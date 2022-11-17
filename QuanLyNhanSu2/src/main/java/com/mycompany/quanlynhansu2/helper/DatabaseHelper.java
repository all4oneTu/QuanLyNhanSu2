package com.mycompany.quanlynhansu2.helper;

import java.sql.Connection;
import java.sql.DriverManager;

// ket noi toi sql server
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       String connectionUrl = "jdbc:sqlserver://localhost;database=BaiTapLon;";
       String dbusername = "sa";
       String dbpassword = "Hang180901";
       Connection con = DriverManager.getConnection(connectionUrl, dbusername, dbpassword);
       return con;
    }
}
