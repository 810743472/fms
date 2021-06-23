package com.food.syz227.dao;

import com.food.syz227.pojo.Food227;

import java.util.List;

public interface IFoodDao227 {
        void add(Food227 food);
        void update(Food227 food);
        List<Food227> query(String key);
        void delete(int foodID);
        List<Food227> queryAll();
        Food227 queryOne(int foodID);
}
