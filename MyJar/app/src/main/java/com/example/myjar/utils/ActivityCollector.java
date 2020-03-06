package com.example.myjar.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 1@auth
 * 2020-03-06 创建的系统天
 * 10:53 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.hold_all.utils 所在包名
 * Administrator 当前用户系统登录名
 */
public class ActivityCollector {

    public static List<Activity> sActivities=new ArrayList<>();

    public static void addActivity(Activity activity){
        sActivities.add(activity);
    }

    public static void removeActivity(Activity activity){
        sActivities.remove(activity);
    }

    public static void finishAll(){
        for (Activity activity:sActivities) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
