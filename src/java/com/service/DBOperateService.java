/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.Continute;
import com.dao.DBOperate;
import com.dao.Exchanged;
import com.dao.Live_in;
import com.dao.Live_out;
import com.dao.Room;
import com.dao.Scheduled;
import com.dao.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 钟镇斌
 */
public class DBOperateService implements DBOprateServiceInterface {
    //登录验证方法

    public User queryLogin(String id, String password) {
        User user = new User();
        DBOperate query = new DBOperate();
        user = query.queryLogin(id, password);
        return user;
    }

    //预定管理的方法：显示全部、增加、删除、修改、查询
    //显示全部预定记录
    public ArrayList<Scheduled> showAll_scheduled() {
        ArrayList<Scheduled> list_all = new ArrayList<>();
        DBOperate query_all = new DBOperate();
        list_all = query_all.showAll_scheduled();
        return list_all;
    }
    //增加预定

    public int insert_scheduled(String scheduled_id, String custom_name, String custom_identify, String custom_tel, String scheduled_room, String scheduled_room_type, String scheduled_time, String scheduled_begin_live, String scheduled_end_leave, String scheduled_total_time, String scheduled_price) {
        int rs = 0;
        DBOperate insert = new DBOperate();
        rs = insert.insert_scheduled(scheduled_id, custom_name, custom_identify, custom_tel, scheduled_room, scheduled_room_type, scheduled_time, scheduled_begin_live, scheduled_end_leave, scheduled_total_time, scheduled_price);
        return rs;
    }

    //删除预定
    public int delete_scheduled(String scheduled_room, String custom_name) {
        int rs = 0;
        DBOperate delete = new DBOperate();
        rs = delete.delete_scheduled(scheduled_room, custom_name);
        return rs;
    }

    //修改预定
    public int update_scheduled(String kefang, String guke, String scheduled_id, String custom_name, String custom_identify, String custom_tel, String scheduled_room, String scheduled_room_type, String scheduled_time, String scheduled_begin_live, String scheduled_end_leave, String scheduled_total_time, String scheduled_price) {
        int rs = 0;
        DBOperate update = new DBOperate();
        rs = update.update_scheduled(kefang, guke, scheduled_id, custom_name, custom_identify, custom_tel, scheduled_room, scheduled_room_type, scheduled_time, scheduled_begin_live, scheduled_end_leave, scheduled_total_time, scheduled_price);
        return rs;
    }

    //查询预定
    public Scheduled query_scheduled(String scheduled_room, String custom_name) {
        Scheduled rs = new Scheduled();
        DBOperate query = new DBOperate();
        rs = query.query_scheduled(scheduled_room, custom_name);
        return rs;
    }

    //入住管理的方法：显示全部、增加、删除、修改、查询
    //显示全部入住
    public ArrayList<Live_in> showAll_live_in() {
        ArrayList<Live_in> list_live_in = new ArrayList<>();
        DBOperate operate = new DBOperate();
        list_live_in = operate.showAll_live_in();
        return list_live_in;
    }

    //入住增加
    public int insert_live_in(String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type, String room_price, String live_in_time, String plan_leave_time, String total_live_time, String total_price, String deposit, String run_staff_name, String run_staff_tel) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag = operate.insert_live_in(live_in_id, custom_name, custom_identify, custom_tel, live_in_room, live_in_room_type, room_price, live_in_time, plan_leave_time, total_live_time, total_price, deposit, run_staff_name, run_staff_tel);
        return flag;
    }

    //入住删除
    public int delete_live_in(String live_in_room, String custom_name) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag = operate.delete_live_in(live_in_room, custom_name);
        return flag;
    }

    //入住修改
    public int update_live_in(String kefang, String guke, String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type, String room_price, String live_in_time, String plan_leave_time, String total_live_time, String total_price, String deposit, String run_staff_name, String run_staff_tel) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag = operate.update_live_in(kefang, guke, live_in_id, custom_name, custom_identify, custom_tel, live_in_room, live_in_room_type, room_price, live_in_time, plan_leave_time, total_live_time, total_price, deposit, run_staff_name, run_staff_tel);
        return flag;
    }

    //入住查询
    public ArrayList<Live_in> query_live_in(String total_live_time, String custom_name) {
        ArrayList<Live_in> list=new ArrayList<>();
        DBOperate operate = new DBOperate();
        list = operate.query_live_in(total_live_time, custom_name);
        return list;
    }

    
    //换房管理的方法：显示全部、增加、删除、修改、查询
    public ArrayList<Exchanged> showAll_exchanged() {
        ArrayList<Exchanged> list = new ArrayList<>();
        DBOperate operate = new DBOperate();
        list = operate.showAll_exchanged();
        return list;
    }

    ;
    public int insert_exchanged(String exchanged_id, String custom_name, String custom_tel, String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time, String run_staff_name, String run_staff_tel) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag = operate.insert_exchanged(exchanged_id, custom_name, custom_tel, before_room, before_room_type, before_room_price, after_room, after_room_type, after_room_price, exchanged_time, run_staff_name, run_staff_tel);
        return flag;
    }

    ;
    public int delete_exchanged(String after_room, String custom_name) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.delete_exchanged(after_room, custom_name);
        return flag;
    }

    ;
    public int update_exchanged(String kefang, String guke, String exchanged_id, String custom_name, String custom_tel, String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time, String run_staff_name, String run_staff_tel) {
        int flag = 0;
        DBOperate operate = new DBOperate();
        flag = operate.update_exchanged(kefang, guke, exchanged_id, custom_name, custom_tel, before_room, before_room_type, before_room_price, after_room, after_room_type, after_room_price, exchanged_time, run_staff_name, run_staff_tel);
        return flag;
    }

    public Exchanged query_exchanged(String before_room, String custom_name) {
        Exchanged query = new Exchanged();
        DBOperate operate = new DBOperate();
        query = operate.query_exchanged(before_room, custom_name);
        return query;
    }
    //续住管理的方法：显示全部、增加、删除、修改、查询
    public ArrayList<Continute> showAll_continute(){
    ArrayList<Continute> list=new ArrayList<>();
    DBOperate operate=new DBOperate();
    list=operate.showAll_continute();
    return list;
    }
    public int insert_continute(String continute_id, String custom_name,String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time, String continute_price, String run_staff_name, String run_staff_tel){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.insert_continute(continute_id, custom_name, custom_tel, continute_room, continute_room_type, live_begin_time, aleady_live_time, continute_begin_time, continute_end_time, continute_total_time, continute_price, run_staff_name, run_staff_tel);
        return flag;
    }
    public int delete_continute(String continute_room, String custom_name){
       int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.delete_continute(continute_room, custom_name);
        return flag;
    }
    public int update_continute(String kefang, String guke, String continute_id, String custom_name, String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time,String continute_price, String run_staff_name, String run_staff_tel){
       int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.update_continute(kefang, guke, continute_id, custom_name, custom_tel, continute_room, continute_room_type, live_begin_time, aleady_live_time, continute_begin_time, continute_end_time, continute_total_time, continute_price, run_staff_name, run_staff_tel);
        return flag;
    }
    public ArrayList<Continute> query_continute(String aleady_live_time, String custom_name){
      ArrayList<Continute> list=new ArrayList<>();
      DBOperate operate=new DBOperate();
      list=operate.query_continute(aleady_live_time, custom_name);
      return list;
    }
    
     //退房管理的方法：显示全部、增加、删除、修改、查询
     public ArrayList<Live_out> showAll_live_out(){
     ArrayList<Live_out> list=new ArrayList<>();
    DBOperate operate=new DBOperate();
    list=operate.showAll_live_out();
    return list;
     }
     public int insert_live_out(String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name, String run_staff_tel){
     int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.insert_live_out(live_out_id, custom_name, custom_tel, live_out_room, live_out_room_type, live_in_time, live_out_time, total_live_time, total_price, run_staff_name, run_staff_tel);
     return flag;
     }
     public int delete_live_out(String live_out_room, String custom_name){
     int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.delete_live_out(live_out_room, custom_name);
        return flag;
     }
     public int update_live_out(String kefang, String guke, String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name,String run_staff_tel){
     int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.update_live_out(kefang, guke, live_out_id, custom_name, custom_tel, live_out_room, live_out_room_type, live_in_time, live_out_time, total_live_time, total_price, run_staff_name, run_staff_tel);
        return flag;
     }
     public Live_out query_live_out(String live_out_room, String custom_name){
     Live_out query=new Live_out();
      DBOperate operate = new DBOperate();
      query=operate.query_live_out(live_out_room, custom_name);
      return query;
     }
     
      //客房管理的方法：显示全部、增加、删除、修改、查询
    //显示客房记录
     public ArrayList<Room> showAll_room(){
      ArrayList<Room> list=new ArrayList<>();
    DBOperate operate=new DBOperate();
    list=operate.showAll_room();
    return list;
     }
     public int insert_room(String room_id, String room, String room_type, String room_price,String state){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.insert_room(room_id, room, room_type, room_price,state);
         return flag;
     }
     public int delete_room(String room_id, String room){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.delete_room(room_id, room);
         return flag;
     }
     public int update_room(String id,String kefang,String room_id, String room, String room_type, String room_price,String state){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.update_room(id, kefang, room_id, room, room_type, room_price,state);
         return flag;
     }
     public ArrayList<Room> query_room(String state, String room){
     ArrayList<Room> list=new ArrayList<>();
     DBOperate operate = new DBOperate();
     list=operate.query_room(state, room);
     return list;
     }
     public int adjust_room(String room_type,String room_price){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.adjust_room(room_type, room_price);
         return flag;
     }
     
      //员工管理的方法：显示全部、增加、删除
    public ArrayList<User> showAll_user(){
       ArrayList<User> list=new ArrayList<>();
    DBOperate operate=new DBOperate();
    list=operate.showAll_user();
    return list;
    }
    public int insert_user(String id,String name,String password,String email,String authority){
     int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.insert_user(id, name, password, email, authority);
         return flag;
    }
    public int delete_user(String id,String name){
      int flag = 0;
        DBOperate operate = new DBOperate();
        flag=operate.delete_user(id, name);
         return flag;
    }
}
