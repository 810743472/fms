package com.food.syz227.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TimeTools227.java(时间处理类)
 * @author sunyongzheng
 * @date 2021-6-10
 */
public class TimeTools227 {


    public long getTime100(){
        long now = 0;
        Date date = new Date();
        now = date.getTime ();
        return now;
    }

}
