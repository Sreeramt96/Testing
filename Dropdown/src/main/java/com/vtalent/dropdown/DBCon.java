package com.vtalent.dropdown;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    private static Connection con;

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_intro","root","Sreeram@96");
        }catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
        return con;
    }
}
