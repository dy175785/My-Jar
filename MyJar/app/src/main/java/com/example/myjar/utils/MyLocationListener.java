package com.example.myjar.utils;

import com.baidu.location.BDAbstractLocationListener;
import com.baidu.location.BDLocation;

/**
 * 1@auth
 * 2020-03-05 创建的系统天
 * 16:11 创建的系统时间
 * 2020 创建的年份
 * 03 创建的月份
 * com.example.hold_all.utils 所在包名
 * Administrator 当前用户系统登录名
 */
public class MyLocationListener extends BDAbstractLocationListener {
    @Override
    public void onReceiveLocation(BDLocation bdLocation) {
        //mapView 销毁后不在处理新接收的位置
        /*if (bdLocation == null || mMapView == null){
            return;
        }
        MyLocationData locData = new MyLocationData.Builder()
                .accuracy(location.getRadius())
                // 此处设置开发者获取到的方向信息，顺时针0-360
                .direction(location.getDirection()).latitude(location.getLatitude())
                .longitude(location.getLongitude()).build();
        mBaiduMap.setMyLocationData(locData);*/
    }
}
