/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author 钟镇斌
 */
public class DBOperate implements DBOperateInterface {

    //从数据库中查询用户
    //登录验证
    public User queryLogin(String id, String password) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User user = new User();
        try {
            con = DBCPUtils.getConnection();
            //查询用户名为id,密码为password的用户
            String sql = "select * from users where id=? and password=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            while (rs.next()) {

                user.setId(rs.getString(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setAuthority(rs.getString(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }

        return user;
    }

    //预定管理的方法：显示全部、增加、删除、修改、查询
    //显示预定记录
    public ArrayList<Scheduled> showAll_scheduled() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Scheduled> list_scheduled = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from scheduled";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Scheduled scheduled_all = new Scheduled();
                scheduled_all.setScheduled_id(rs.getString(1));
                scheduled_all.setCustom_name(rs.getString(2));
                scheduled_all.setCustom_identify(rs.getString(3));
                scheduled_all.setCustom_tel(rs.getString(4));
                scheduled_all.setScheduled_room(rs.getString(5));
                scheduled_all.setScheduled_room_type(rs.getString(6));
                scheduled_all.setScheduled_time(rs.getString(7));
                scheduled_all.setScheduled_begin_live(rs.getString(8));
                scheduled_all.setScheduled_end_leave(rs.getString(9));
                scheduled_all.setScheduled_total_time(rs.getString(10));
                scheduled_all.setScheduled_price(rs.getString(11));
                list_scheduled.add(scheduled_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_scheduled;
    }

    //添加预定
    public int insert_scheduled(String scheduled_id, String custom_name, String custom_identify, String custom_tel, String scheduled_room, String scheduled_room_type, String scheduled_time, String scheduled_begin_live, String scheduled_end_leave, String scheduled_total_time, String scheduled_price) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into scheduled values(?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, scheduled_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_identify);
            stmt.setString(4, custom_tel);
            stmt.setString(5, scheduled_room);
            stmt.setString(6, scheduled_room_type);
            stmt.setString(7, scheduled_time);
            stmt.setString(8, scheduled_begin_live);
            stmt.setString(9, scheduled_end_leave);
            stmt.setString(10, scheduled_total_time);
            stmt.setString(11, scheduled_price);

            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"被预定");
            stmt.setString(2, scheduled_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除预定
    public int delete_scheduled(String scheduled_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //
            String sql = "delete from scheduled where scheduled_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, scheduled_room);
            stmt.setString(2, custom_name);
            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, scheduled_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改预定
    public int update_scheduled(String kefang, String guke, String scheduled_id, String custom_name, String custom_identify, String custom_tel, String scheduled_room, String scheduled_room_type, String scheduled_time, String scheduled_begin_live, String scheduled_end_leave, String scheduled_total_time, String scheduled_price) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update scheduled set scheduled_id=?,custom_name=?,custom_identify=?,custom_tel=?,scheduled_room=?,scheduled_room_type=?,scheduled_time=?,scheduled_begin_live=?,scheduled_end_leave=?,scheduled_total_time=?,scheduled_price=? where scheduled_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, scheduled_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_identify);
            stmt.setString(4, custom_tel);
            stmt.setString(5, scheduled_room);
            stmt.setString(6, scheduled_room_type);
            stmt.setString(7, scheduled_time);
            stmt.setString(8, scheduled_begin_live);
            stmt.setString(9, scheduled_end_leave);
            stmt.setString(10, scheduled_total_time);
            stmt.setString(11, scheduled_price);
            stmt.setString(12, kefang);
            stmt.setString(13, guke);

            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询预定
    public Scheduled query_scheduled(String scheduled_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Scheduled scheduled_query = new Scheduled();
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from scheduled where scheduled_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, scheduled_room);
            stmt.setString(2, custom_name);
            rs = stmt.executeQuery();
            //
            if (rs.next()) {

                scheduled_query.setScheduled_id(rs.getString(1));
                scheduled_query.setCustom_name(rs.getString(2));
                scheduled_query.setCustom_identify(rs.getString(3));
                scheduled_query.setCustom_tel(rs.getString(4));
                scheduled_query.setScheduled_room(rs.getString(5));
                scheduled_query.setScheduled_room_type(rs.getString(6));
                scheduled_query.setScheduled_time(rs.getString(7));
                scheduled_query.setScheduled_begin_live(rs.getString(8));
                scheduled_query.setScheduled_end_leave(rs.getString(9));
                scheduled_query.setScheduled_total_time(rs.getString(10));
                scheduled_query.setScheduled_price(rs.getString(11));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return scheduled_query;

    }

    //入住管理的方法：显示全部、增加、删除、修改、查询
    //显示入住记录
    public ArrayList<Live_in> showAll_live_in() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Live_in> list_live_in = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from live_in";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Live_in live_in_all = new Live_in();
                live_in_all.setLive_in_id(rs.getString(1));
                live_in_all.setCustom_name(rs.getString(2));
                live_in_all.setCustom_identify(rs.getString(3));
                live_in_all.setCustom_tel(rs.getString(4));
                live_in_all.setLive_in_room(rs.getString(5));
                live_in_all.setLive_in_room_type(rs.getString(6));
                live_in_all.setRoom_price(rs.getString(7));
                live_in_all.setLive_in_time(rs.getString(8));
                live_in_all.setPlan_leave_time(rs.getString(9));
                live_in_all.setTotal_live_time(rs.getString(10));
                live_in_all.setTotal_price(rs.getString(11));
                live_in_all.setDeposit(rs.getString(12));
                live_in_all.setRun_staff_name(rs.getString(13));
                live_in_all.setRun_staff_tel(rs.getString(14));
                list_live_in.add(live_in_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_live_in;
    }

    //添加入住
    public int insert_live_in(String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type, String room_price, String live_in_time, String plan_leave_time, String total_live_time, String total_price, String deposit, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into live_in values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_in_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_identify);
            stmt.setString(4, custom_tel);
            stmt.setString(5, live_in_room);
            stmt.setString(6, live_in_room_type);
            stmt.setString(7, room_price);
            stmt.setString(8, live_in_time);
            stmt.setString(9, plan_leave_time);
            stmt.setString(10, total_live_time);
            stmt.setString(11, total_price);
            stmt.setString(12, deposit);
            stmt.setString(13, run_staff_name);
            stmt.setString(14, run_staff_tel);

            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"已住");
            stmt.setString(2, live_in_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除入住
    public int delete_live_in(String live_in_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //
            String sql = "delete from live_in where live_in_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_in_room);
            stmt.setString(2, custom_name);
            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, live_in_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改入住
    public int update_live_in(String kefang, String guke, String live_in_id, String custom_name, String custom_identify, String custom_tel, String live_in_room, String live_in_room_type, String room_price, String live_in_time, String plan_leave_time, String total_live_time, String total_price, String deposit, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update live_in set live_in_id=?,custom_name=?,custom_identify=?,custom_tel=?,live_in_room=?,live_in_room_type=?,room_price=?,live_in_time=?,plan_leave_time=?,total_live_time=?,total_price=?,deposit=?,run_staff_name=?,run_staff_tel=? where live_in_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_in_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_identify);
            stmt.setString(4, custom_tel);
            stmt.setString(5, live_in_room);
            stmt.setString(6, live_in_room_type);
            stmt.setString(7, room_price);
            stmt.setString(8, live_in_time);
            stmt.setString(9, plan_leave_time);
            stmt.setString(10, total_live_time);
            stmt.setString(11, total_price);
            stmt.setString(12, deposit);
            stmt.setString(13, run_staff_name);
            stmt.setString(14, run_staff_tel);
            stmt.setString(15, kefang);
            stmt.setString(16, guke);

            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询入住
    public ArrayList<Live_in> query_live_in(String total_live_time, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Live_in> list=new ArrayList<>();
       
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from live_in where total_live_time>=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, total_live_time);
            stmt.setString(2, custom_name);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Live_in live_in_query = new Live_in();
                live_in_query.setLive_in_id(rs.getString(1));
                live_in_query.setCustom_name(rs.getString(2));
                live_in_query.setCustom_identify(rs.getString(3));
                live_in_query.setCustom_tel(rs.getString(4));
                live_in_query.setLive_in_room(rs.getString(5));
                live_in_query.setLive_in_room_type(rs.getString(6));
                live_in_query.setRoom_price(rs.getString(7));
                live_in_query.setLive_in_time(rs.getString(8));
                live_in_query.setPlan_leave_time(rs.getString(9));
                live_in_query.setTotal_live_time(rs.getString(10));
                live_in_query.setTotal_price(rs.getString(11));
                live_in_query.setDeposit(rs.getString(12));
                live_in_query.setRun_staff_name(rs.getString(13));
                live_in_query.setRun_staff_tel(rs.getString(14));
                
                list.add(live_in_query);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list;

    }

    //换房管理的方法：显示全部、增加、删除、修改、查询
    //显示换房记录
    public ArrayList<Exchanged> showAll_exchanged() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Exchanged> list_exchanged = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from exchanged";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Exchanged exchanged_all = new Exchanged();
                exchanged_all.setExchanged_id(rs.getString(1));
                exchanged_all.setCustom_name(rs.getString(2));
                exchanged_all.setCustom_tel(rs.getString(3));
                exchanged_all.setBefore_room(rs.getString(4));
                exchanged_all.setBefore_room_type(rs.getString(5));
                exchanged_all.setBefore_room_price(rs.getString(6));
                exchanged_all.setAfter_room(rs.getString(7));
                exchanged_all.setAfter_room_type(rs.getString(8));
                exchanged_all.setAfter_room_price(rs.getString(9));
                exchanged_all.setExchanged_time(rs.getString(10));
                exchanged_all.setRun_staff_name(rs.getString(11));
                exchanged_all.setRun_staff_tel(rs.getString(12));
                list_exchanged.add(exchanged_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_exchanged;
    }

    //添加
    public int insert_exchanged(String exchanged_id, String custom_name, String custom_tel, String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into exchanged values(?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, exchanged_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, before_room);
            stmt.setString(5, before_room_type);
            stmt.setString(6, before_room_price);
            stmt.setString(7, after_room);
            stmt.setString(8, after_room_type);
            stmt.setString(9, after_room_price);
            stmt.setString(10, exchanged_time);
            stmt.setString(11, run_staff_name);
            stmt.setString(12, run_staff_tel);

            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, before_room);
            alter=stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"已住");
            stmt.setString(2, after_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除换房
    public int delete_exchanged(String after_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "delete from exchanged where after_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, after_room);
            stmt.setString(2, custom_name);
            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, after_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改换房
    public int update_exchanged(String kefang, String guke, String exchanged_id, String custom_name, String custom_tel, String before_room, String before_room_type, String before_room_price, String after_room, String after_room_type, String after_room_price, String exchanged_time, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update exchanged set exchanged_id=?,custom_name=?,custom_tel=?,before_room=?,before_room_type=?,before_room_price=?,after_room=?,after_room_type=?,after_room_price=?,exchanged_time=?,run_staff_name=?,run_staff_tel=? where before_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, exchanged_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, before_room);
            stmt.setString(5, before_room_type);
            stmt.setString(6, before_room_price);
            stmt.setString(7, after_room);
            stmt.setString(8, after_room_type);
            stmt.setString(9, after_room_price);
            stmt.setString(10, exchanged_time);
            stmt.setString(11, run_staff_name);
            stmt.setString(12, run_staff_tel);
            stmt.setString(13, kefang);
            stmt.setString(14, guke);

            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询换房
    public Exchanged query_exchanged(String before_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Exchanged exchanged_query = new Exchanged();
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from exchanged where before_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, before_room);
            stmt.setString(2, custom_name);
            rs = stmt.executeQuery();
            //
            if (rs.next()) {

                exchanged_query.setExchanged_id(rs.getString(1));
                exchanged_query.setCustom_name(rs.getString(2));
                exchanged_query.setCustom_tel(rs.getString(3));
                exchanged_query.setBefore_room(rs.getString(4));
                exchanged_query.setBefore_room_type(rs.getString(5));
                exchanged_query.setBefore_room_price(rs.getString(6));
                exchanged_query.setAfter_room(rs.getString(7));
                exchanged_query.setAfter_room_type(rs.getString(8));
                exchanged_query.setAfter_room_price(rs.getString(9));
                exchanged_query.setExchanged_time(rs.getString(10));
                exchanged_query.setRun_staff_name(rs.getString(11));
                exchanged_query.setRun_staff_tel(rs.getString(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return exchanged_query;

    }

    //续房管理的方法：显示全部、增加、删除、修改、查询
    //显示续房记录
    public ArrayList<Continute> showAll_continute() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Continute> list_continute = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from continute";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Continute continute_all = new Continute();
                continute_all.setContinute_id(rs.getString(1));
                continute_all.setCustom_name(rs.getString(2));
                continute_all.setCustom_tel(rs.getString(3));
                continute_all.setContinute_room(rs.getString(4));
                continute_all.setContinute_room_type(rs.getString(5));
                continute_all.setLive_begin_time(rs.getString(6));
                continute_all.setAleady_live_time(rs.getString(7));
                continute_all.setContinute_begin_time(rs.getString(8));
                continute_all.setContinute_end_time(rs.getString(9));
                continute_all.setContinute_total_time(rs.getString(10));
                continute_all.setContinute_price(rs.getString(11));
                continute_all.setRun_staff_name(rs.getString(12));
                continute_all.setRun_staff_tel(rs.getString(13));
                list_continute.add(continute_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_continute;
    }

    //添加续房
    public int insert_continute(String continute_id, String custom_name, String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time, String continute_price, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into continute values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, continute_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, continute_room);
            stmt.setString(5, continute_room_type);
            stmt.setString(6, live_begin_time);
            stmt.setString(7, aleady_live_time);
            stmt.setString(8, continute_begin_time);
            stmt.setString(9, continute_end_time);
            stmt.setString(10, continute_total_time);
            stmt.setString(11, continute_price);
            stmt.setString(12, run_staff_name);
            stmt.setString(13, run_staff_tel);

            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"已住");
            stmt.setString(2, continute_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除续房
    public int delete_continute(String continute_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "delete from continute where continute_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, continute_room);
            stmt.setString(2, custom_name);
            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, continute_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改续房
    public int update_continute(String kefang, String guke, String continute_id, String custom_name, String custom_tel, String continute_room, String continute_room_type, String live_begin_time, String aleady_live_time, String continute_begin_time, String continute_end_time, String continute_total_time, String continute_price, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update continute set continute_id=?,custom_name=?,custom_tel=?,continute_room=?,continute_room_type=?,live_begin_time=?,aleady_live_time=?,continute_begin_time=?,continute_end_time=?,continute_total_time=?,continute_price=?,run_staff_name=?,run_staff_tel=? where continute_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, continute_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, continute_room);
            stmt.setString(5, continute_room_type);
            stmt.setString(6, live_begin_time);
            stmt.setString(7, aleady_live_time);
            stmt.setString(8, continute_begin_time);
            stmt.setString(9, continute_end_time);
            stmt.setString(10, continute_total_time);
            stmt.setString(11, continute_price);
            stmt.setString(12, run_staff_name);
            stmt.setString(13, run_staff_tel);
            stmt.setString(14, kefang);
            stmt.setString(15, guke);

            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询续房
    public ArrayList<Continute> query_continute(String aleady_live_time, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Continute> list=new ArrayList<>();
       
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from continute where aleady_live_time>=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, aleady_live_time);
            stmt.setString(2, custom_name);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Continute continute_query = new Continute();
                continute_query.setContinute_id(rs.getString(1));
                continute_query.setCustom_name(rs.getString(2));
                continute_query.setCustom_tel(rs.getString(3));
                continute_query.setContinute_room(rs.getString(4));
                continute_query.setContinute_room_type(rs.getString(5));
                continute_query.setLive_begin_time(rs.getString(6));
                continute_query.setAleady_live_time(rs.getString(7));
                continute_query.setContinute_begin_time(rs.getString(8));
                continute_query.setContinute_end_time(rs.getString(9));
                continute_query.setContinute_total_time(rs.getString(10));
                continute_query.setContinute_price(rs.getString(11));
                continute_query.setRun_staff_name(rs.getString(12));
                continute_query.setRun_staff_tel(rs.getString(13));
                list.add(continute_query);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list;

    }

    //退房管理的方法：显示全部、增加、删除、修改、查询
    //显示退房记录
    public ArrayList<Live_out> showAll_live_out() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Live_out> list_live_out = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from live_out";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Live_out live_out_all = new Live_out();
                live_out_all.setLive_out_id(rs.getString(1));
                live_out_all.setCustom_name(rs.getString(2));
                live_out_all.setCustom_tel(rs.getString(3));
                live_out_all.setLive_out_room(rs.getString(4));
                live_out_all.setLive_out_room_type(rs.getString(5));
                live_out_all.setLive_in_time(rs.getString(6));
                live_out_all.setLive_out_time(rs.getString(7));
                live_out_all.setTotal_live_time(rs.getString(8));
                live_out_all.setTotal_price(rs.getString(9));
                live_out_all.setRun_staff_name(rs.getString(10));
                live_out_all.setRun_staff_tel(rs.getString(11));
                list_live_out.add(live_out_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_live_out;
    }

    //添加退房
    public int insert_live_out(String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into live_out values(?,?,?,?,?,?,?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_out_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, live_out_room);
            stmt.setString(5, live_out_room_type);
            stmt.setString(6, live_in_time);
            stmt.setString(7, live_out_time);
            stmt.setString(8, total_live_time);
            stmt.setString(9, total_price);
            stmt.setString(10, run_staff_name);
            stmt.setString(11, run_staff_tel);

            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2, live_out_room);
            alter=stmt.executeUpdate();
            
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除退房
    public int delete_live_out(String live_out_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        int alter=0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "delete from live_out where live_out_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_out_room);
            stmt.setString(2, custom_name);
            result = stmt.executeUpdate();
            
            sql = "update Room set state=? where room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1,"空房");
            stmt.setString(2,live_out_room);
            alter=stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改退房
    public int update_live_out(String kefang, String guke, String live_out_id, String custom_name, String custom_tel, String live_out_room, String live_out_room_type, String live_in_time, String live_out_time, String total_live_time, String total_price, String run_staff_name, String run_staff_tel) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update live_out set live_out_id=?,custom_name=?,custom_tel=?,live_out_room=?,live_out_room_type=?,live_in_time=?,live_out_time=?,total_live_time=?,total_price=?,run_staff_name=?,run_staff_tel=? where live_out_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_out_id);
            stmt.setString(2, custom_name);
            stmt.setString(3, custom_tel);
            stmt.setString(4, live_out_room);
            stmt.setString(5, live_out_room_type);
            stmt.setString(6, live_in_time);
            stmt.setString(7, live_out_time);
            stmt.setString(8, total_live_time);
            stmt.setString(9, total_price);
            stmt.setString(10, run_staff_name);
            stmt.setString(11, run_staff_tel);
            stmt.setString(12, kefang);
            stmt.setString(13, guke);

            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询退房
    public Live_out query_live_out(String live_out_room, String custom_name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Live_out live_out_query = new Live_out();
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from live_out where live_out_room=? or custom_name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, live_out_room);
            stmt.setString(2, custom_name);
            rs = stmt.executeQuery();
            //
            if (rs.next()) {

                live_out_query.setLive_out_id(rs.getString(1));
                live_out_query.setCustom_name(rs.getString(2));
                live_out_query.setCustom_tel(rs.getString(3));
                live_out_query.setLive_out_room(rs.getString(4));
                live_out_query.setLive_out_room_type(rs.getString(5));
                live_out_query.setLive_in_time(rs.getString(6));
                live_out_query.setLive_out_time(rs.getString(7));
                live_out_query.setTotal_live_time(rs.getString(8));
                live_out_query.setTotal_price(rs.getString(9));
                live_out_query.setRun_staff_name(rs.getString(10));
                live_out_query.setRun_staff_tel(rs.getString(11));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return live_out_query;

    }

    //客房管理的方法：显示全部、增加、删除、修改、查询，以及价格调整
    //显示客房记录
    public ArrayList<Room> showAll_room() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Room> list_room = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from room";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Room room_all = new Room();
                room_all.setRoom_id(rs.getString(1));
                room_all.setRoom(rs.getString(2));
                room_all.setRoom_type(rs.getString(3));
                room_all.setRoom_price(rs.getString(4));
                room_all.setState(rs.getString(5));

                list_room.add(room_all);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_room;
    }

    //添加客房
    public int insert_room(String room_id, String room, String room_type, String room_price, String state) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into room values(?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, room_id);
            stmt.setString(2, room);
            stmt.setString(3, room_type);
            stmt.setString(4, room_price);
            stmt.setString(5, state);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //删除客房
    public int delete_room(String room_id, String room) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "delete from room where room_id=? or room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, room_id);
            stmt.setString(2, room);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //修改客房
    public int update_room(String id, String kefang, String room_id, String room, String room_type, String room_price, String state) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update room set room_id=?,room=?,room_type=?,room_price=?,state=? where room_id=? or room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, room_id);
            stmt.setString(2, room);
            stmt.setString(3, room_type);
            stmt.setString(4, room_price);
            stmt.setString(5, state);
            stmt.setString(6, id);
            stmt.setString(7, kefang);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //查询客房
    public ArrayList<Room> query_room(String state, String room) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Room> list_room = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询
            String sql = "select * from room where state=? or room=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, state);
            stmt.setString(2, room);
            rs = stmt.executeQuery();
            //
            while (rs.next()) {
                Room room_query = new Room();
                room_query.setRoom_id(rs.getString(1));
                room_query.setRoom(rs.getString(2));
                room_query.setRoom_type(rs.getString(3));
                room_query.setRoom_price(rs.getString(4));
                room_query.setState(rs.getString(5));

                list_room.add(room_query);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_room;

    }

    //价格调整
    public int adjust_room(String room_type, String room_price) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //修改
            String sql = "update room set room_price=? where room_type=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, room_price);
            stmt.setString(2, room_type);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    //员工管理的方法：显示全部、增加、删除
    public ArrayList<User> showAll_user() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<User> list_user = new ArrayList<>();
        try {
            con = DBCPUtils.getConnection();
            //查询全部
            String sql = "select * from users where authority='staff'";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
           
            while (rs.next()) {
                
                    User user_all = new User();
                    user_all.setId(rs.getString(1));
                    user_all.setName(rs.getString(2));
                    user_all.setPassword(rs.getString(3));
                    user_all.setEmail(rs.getString(4));
                    user_all.setAuthority(rs.getString(5));
                    list_user.add(user_all);
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return list_user;
    }

    public int insert_user(String id, String name, String password, String email, String authority) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //添加
            String sql = "insert into users values(?,?,?,?,?)";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, name);
            stmt.setString(3, password);
            stmt.setString(4, email);
            stmt.setString(5, authority);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;
    }

    public int delete_user(String id, String name) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = DBCPUtils.getConnection();
            //删除
            String sql = "delete from users where id=? or name=?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.setString(2, name);
            result = stmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBCPUtils.close(rs, stmt, con);
        }
        return result;

    }
}
