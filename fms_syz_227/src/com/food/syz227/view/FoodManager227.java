package com.food.syz227.view;

import com.food.syz227.dao.IFoodDao227;
import com.food.syz227.dao.impl.FoodDao227Impl;
import com.food.syz227.pojo.Food227;
import com.food.syz227.util.TimeTools227;

import java.util.List;
import java.util.Scanner;

/**
 * @ClassName FoodManager227
 * @Description 视图界面类
 * @Author sunyongzheng
 * @Date 2021/6/10 14:24:44
 * @Version 1.0
 */
public class FoodManager227 {
    static TimeTools227 time = new TimeTools227();
    static IFoodDao227 foodDao = new FoodDao227Impl ();
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println ("|---------------外卖订单系统---------------|");
            System.out.println ("|1.增加 2.删除 3.修改 4.查找 5.显示所有 0.退出|");
            System.out.println ("|----------------------------------------|");
            System.out.println ("请选择业务：");
            int cmd = sc.nextInt ();
            switch (cmd) {
                case 1:
                    addFood ();
                    break;
                case 2 :
                    deleteFood ();
                    break;
                case 3 :
                    updateFood ();
                    break;
                case 4 :
                    query ();
                    break;
                case 5 :
                    queryAll ();
                    break;
                case 0:
                    System.exit (0);
                    break;
                default :
                    System.out.println ("输入错误，请重试！");
            }
        }
    }
    public static void addFood(){
        long newTime = time.getTime100 ();
        System.out.println ("---------------增加---------------");
        System.out.println ("食品单号：");
        System.out.println (newTime);
        String foodNum = newTime+"";
        System.out.println ("用户名：");
        String foodName = sc.next ();
        System.out.println ("联系电话:");
        String foodTel = sc.next ();
        System.out.println ("送货地址：");
        String foodAddress = sc.next ();
        System.out.println ("价格:");
        double foodPrice = sc.nextDouble ();
        foodDao.add (new Food227 (0,foodNum,foodName,foodTel,foodAddress,foodPrice));
    }
    public static void deleteFood(){
        System.out.println ("---------------删除---------------");
        System.out.println ("请输入要删除的外卖编号：");
        int key = sc.nextInt ();
        foodDao.queryOne (key);
        System.out.println ("确认要删除吗？1是  2否");
        int isOK = sc.nextInt();
        if (isOK == 1) {
            foodDao.delete (key);
        }
    }
    public static void updateFood(){
        System.out.println ("---------------修改---------------");
        System.out.println ("请输入要修改的外卖编号：");
        int key = sc.nextInt ();
        Food227 food227 = foodDao.queryOne (key);
        System.out.println ("请重新输入外卖信息：");
        System.out.println ("用户名：");
        String foodName = sc.next ();
        System.out.println ("联系电话:");
        String foodTel = sc.next ();
        System.out.println ("送货地址：");
        String foodAddress = sc.next ();
        System.out.println ("价格:");
        double foodPrice = sc.nextDouble ();
        food227.setFoodName227 (foodName);
        food227.setFoodTel227 (foodTel);
        food227.setFoodAddress227 (foodAddress);
        food227.setFoodPrice227 (foodPrice);
        foodDao.update (food227);
    }
    public static void queryAll(){
        System.out.println ("---------------查询所有---------------");
        List<Food227> foodList = foodDao.queryAll ();
        for (Food227 food:foodList) {
            System.out.println (food);
        }
    }
    public static void query(){
        System.out.println ("---------------模糊查询---------------");
        System.out.println ("请输入关键字：");
        String key = sc.next ();
        List<Food227> list = foodDao.query (key);
        for (Food227 food:list
             ) {
            System.out.println (food);
        }
    }
}
