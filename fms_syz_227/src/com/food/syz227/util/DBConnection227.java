package com.food.syz227.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName DBConnection227
 * @Description 数据库工具类
 * @Author sunyongzheng
 * @Date 2021/6/10 14:17:34
 * @Version 1.0
 */
public class DBConnection227 {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private  final static String URL =  "jdbc:mysql://localhost:3306/db_food_syz_227?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&nullCatalogMeansCurrent=true";
    private  final static  String USER = "root";
    private  final static String PASSWORD = "123456";
    static{
        try {
            Class.forName (DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }
    public Connection getConnection(){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection (URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace ();
        }

        return conn;
    }

    public static void main(String[] args) {
        DBConnection227 db = new DBConnection227();
        db.getConnection ();
    }
}
