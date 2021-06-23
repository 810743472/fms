package com.food.syz227.dao.impl;

import com.food.syz227.dao.IFoodDao227;
import com.food.syz227.pojo.Food227;
import com.food.syz227.util.DBConnection227;
import com.food.syz227.util.TimeTools227;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FoodDao227Impl
 * @Description 接口实现类
 * @Author sunyongzheng
 * @Date 2021/6/10 14:23:51
 * @Version 1.0
 */
public class FoodDao227Impl implements IFoodDao227 {
    DBConnection227 db = new DBConnection227();
    TimeTools227 time = new TimeTools227();
    @Override
    public void add(Food227 food) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql= "INSERT INTO t_food_227 (foodID227,foodNum227,foodName227,foodTel227,foodAddress227,foodPrice227) VALUE (0,?,?,?,?,?)";
        long newTime = time.getTime100 ();
        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString (1,food.getFoodNum227 ());
            pstmt.setString (2,food.getFoodName227 ());
            pstmt.setString (3,food.getFoodTel227 ());
            pstmt.setString (4,food.getFoodAddress227 ());
            pstmt.setDouble (5,food.getFoodPrice227 ());
            int ok = pstmt.executeUpdate ();
            if (1 <= ok){
                System.out.println ("添加成功----");
            }else {
                System.out.println ("添加失败----");
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public void update(Food227 food) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql2 = "update t_food_227 set foodName227 = ?,foodTel227 = ?,foodAddress227 = ?,foodPrice227 = ? where foodID227 = ?";
        int a = 0;
        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement (sql2);
            pstmt.setString (1,food.getFoodName227 ());
            pstmt.setString (2,food.getFoodTel227 ());
            pstmt.setString (3,food.getFoodAddress227 ());
            pstmt.setDouble (4,food.getFoodPrice227 ());
            pstmt.setInt (5,food.getFoodID227 ());
            int ok = pstmt.executeUpdate ();
            if (1 <= ok){
                System.out.println ("修改成功----");
            }else {
                System.out.println ("修改失败----");
            }

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

    @Override
    public List<Food227> query(String key) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql= "select * from t_food_227 where  foodName227 like ?";
        Food227 food = null;
        List<Food227> foodList = new ArrayList<> ();
        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString (1,"%"+key+"%");
            rs = pstmt.executeQuery();
            while (rs.next ()){
                foodList.add(new Food227 (rs.getInt (1),rs.getString (2),rs.getString (3),rs.getString (4),rs.getString (5),rs.getDouble (6)));
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return foodList;
    }

    @Override
    public void delete(int foodID) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql= "delete from t_food_227 where foodID227 = ?";
        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt (1,foodID);
            int ok = pstmt.executeUpdate ();
            if (1 <= ok){
                System.out.println ("删除成功----");
            }else {
                System.out.println ("删除失败----");
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }

    @Override
    public List<Food227> queryAll() {
        List<Food227> list = new ArrayList<> ();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Food227 food = null;
        String sql = "select * from t_food_227";

        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next ()){
                food = new Food227 (rs.getInt (1),rs.getString (2),rs.getString (3),rs.getString (4),rs.getString (5),rs.getDouble (6));
                list.add (food);
            }

        } catch (Exception e) {
            e.printStackTrace ();
        }
        return list;
    }

    @Override
    public Food227 queryOne(int foodID) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        Food227 food = null;
        ResultSet rs = null;
        String sql= "select * from t_food_227 where foodID227 = ?";
        try {
            conn = db.getConnection ();
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt (1,foodID);
            rs = pstmt.executeQuery();
            while (rs.next ()){
                food = new Food227 (rs.getInt (1),rs.getString (2),rs.getString (3),rs.getString (4),rs.getString (5),rs.getDouble (6));
                System.out.println (food);
            }

        } catch (SQLException e) {
            e.printStackTrace ();
        }
        return food;
    }
}
