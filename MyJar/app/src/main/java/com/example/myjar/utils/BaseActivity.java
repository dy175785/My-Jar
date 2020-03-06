package com.example.myjar.utils;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 1@auth
 * 2020-03-06 创建的系统天
 * 10:52 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.hold_all.utils 所在包名
 * Administrator 当前用户系统登录名
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
