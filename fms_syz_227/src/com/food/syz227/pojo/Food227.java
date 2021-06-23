package com.food.syz227.pojo;

import java.util.Objects;

/**
 * @ClassName Food227
 * @Description food实体类
 * @Author sunyongzheng
 * @Date 2021/6/10 14:13:58
 * @Version 1.0
 */
public class Food227 {
    private int foodID227 ;
    private String foodNum227;
    private String foodName227;
    private String foodTel227;
    private String foodAddress227;
    private double foodPrice227;

    public Food227() {
    }

    public Food227(int foodID227, String foodNum227, String foodName227, String foodTel227, String foodAddress227, double foodPrice227) {
        this.foodID227 = foodID227;
        this.foodNum227 = foodNum227;
        this.foodName227 = foodName227;
        this.foodTel227 = foodTel227;
        this.foodAddress227 = foodAddress227;
        this.foodPrice227 = foodPrice227;
    }

    @Override
    public String toString() {
        return "Food227{" +
                "id=" + foodID227 +
                ", foodid=" + foodNum227 +
                ", name='" + foodName227 + '\'' +
                ", phone=" + foodTel227 +
                ", 送货地址='" + foodAddress227 + '\'' +
                ", 价格=" + foodPrice227 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Food227 food227 = (Food227) o;
        return foodID227 == food227.foodID227 &&
                foodNum227 == food227.foodNum227 &&
                foodTel227 == food227.foodTel227 &&
                Double.compare (food227.foodPrice227, foodPrice227) == 0 &&
                Objects.equals (foodName227, food227.foodName227) &&
                Objects.equals (foodAddress227, food227.foodAddress227);
    }

    @Override
    public int hashCode() {
        return Objects.hash (foodID227, foodNum227, foodName227, foodTel227, foodAddress227, foodPrice227);
    }

    public int getFoodID227() {
        return foodID227;
    }

    public void setFoodID227(int foodID227) {
        this.foodID227 = foodID227;
    }

    public String getFoodNum227() {
        return foodNum227;
    }

    public void setFoodNum227(String foodNum227) {
        this.foodNum227 = foodNum227;
    }

    public String getFoodName227() {
        return foodName227;
    }

    public void setFoodName227(String foodName227) {
        this.foodName227 = foodName227;
    }

    public String getFoodTel227() {
        return foodTel227;
    }

    public void setFoodTel227(String foodTel227) {
        this.foodTel227 = foodTel227;
    }

    public String getFoodAddress227() {
        return foodAddress227;
    }

    public void setFoodAddress227(String foodAddress227) {
        this.foodAddress227 = foodAddress227;
    }

    public double getFoodPrice227() {
        return foodPrice227;
    }

    public void setFoodPrice227(double foodPrice227) {
        this.foodPrice227 = foodPrice227;
    }
}
