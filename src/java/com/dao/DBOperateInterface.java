/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import java.util.ArrayList;


/**
 *
 * @author 钟镇斌
 */
interface DBOperateInterface {
     //登录验证方法
    User queryLogin(String id,String password);
    //预定管理的方法：显示全部、增加、删除、修改、查询
    ArrayList<Scheduled> showAll_scheduled();
    int insert_scheduled(String scheduled_id,String custom_name,String custom_identify,String custom_tel,String scheduled_room,String scheduled_room_type,String scheduled_time,String scheduled_begin_live,String scheduled_end_leave,String scheduled_total_time,String scheduled_price);
    int delete_scheduled(String scheduled_room,String custom_name);
    int update_scheduled(String kefang,String guke,String scheduled_id,String custom_name,String custom_identify,String custom_tel,String scheduled_room,String scheduled_room_type,String scheduled_time,String scheduled_begin_live,String scheduled_end_leave,String scheduled_total_time,String scheduled_price);
    Scheduled query_scheduled(String scheduled_room,String custom_name);
    
    //入住管理的方法：显示全部、增加、删除、修改、查询
    ArrayList<Live_in> showAll_live_in();
    int insert_live_in(String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type,String room_price, String live_in_time, String plan_leave_time, String total_live_time,String total_price,String deposit, String run_staff_name, String run_staff_tel);
    int delete_live_in(String live_in_room, String custom_name);
    int update_live_in(String kefang, String guke, String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type,String room_price ,String live_in_time, String plan_leave_time, String total_live_time,String total_price,String deposit, String run_staff_name,String run_staff_tel);       
    ArrayList<Live_in> query_live_in(String total_live_time, String custom_name);
    
     //换房管理的方法：显示全部、增加、删除、修改、查询
     ArrayList<Exchanged> showAll_exchanged();
     int insert_exchanged(String exchanged_id, String custom_name, String custom_tel,String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time,String run_staff_name ,String run_staff_tel);
     int delete_exchanged(String after_room, String custom_name);
     int update_exchanged(String kefang, String guke, String exchanged_id, String custom_name, String custom_tel, String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time,String run_staff_name,String run_staff_tel);
     Exchanged query_exchanged(String before_room, String custom_name);
     
      //续住管理的方法：显示全部、增加、删除、修改、查询
     ArrayList<Continute> showAll_continute();
     int insert_continute(String continute_id, String custom_name,String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time, String continute_price, String run_staff_name, String run_staff_tel);
     int delete_continute(String continute_room, String custom_name);
     int update_continute(String kefang, String guke, String continute_id, String custom_name, String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time,String continute_price, String run_staff_name, String run_staff_tel);
     ArrayList<Continute> query_continute(String aleady_live_time, String custom_name);
     
     //退房管理的方法：显示全部、增加、删除、修改、查询
     ArrayList<Live_out> showAll_live_out();
     int insert_live_out(String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name, String run_staff_tel);
     int delete_live_out(String live_out_room, String custom_name);
     int update_live_out(String kefang, String guke, String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name,String run_staff_tel);
     Live_out query_live_out(String live_out_room, String custom_name);
     
    //客房管理的方法：显示全部、增加、删除、修改、查询，以及价格调整
    //显示客房记录
     ArrayList<Room> showAll_room();
     int insert_room(String room_id, String room, String room_type, String room_price,String state);
     int delete_room(String room_id, String room);
     int update_room(String id,String kefang,String room_id, String room, String room_type, String room_price,String state);
     ArrayList<Room> query_room(String state, String room);
     int adjust_room(String room_type,String room_price);
      
     //员工管理的方法：显示全部、增加、删除
     ArrayList<User> showAll_user();
     int insert_user(String id,String name,String password,String email,String authority);
     int delete_user(String id,String name);
     
   
}
