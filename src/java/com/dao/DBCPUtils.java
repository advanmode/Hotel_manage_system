/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author 钟镇斌
 */
public class DBCPUtils {

    private static final String connectionURL = "jdbc:mysql://localhost:3306/javaee?useUnicode=true&characterEncoding=UTF8&useSSL=false";  //URL
    private static final String username = "javaee";  //数据库用户名称
    private static final String password = "123456";  //数据库用户密码

    private static BasicDataSource ds;

    static {
        ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl(connectionURL);
        ds.setUsername(username);
        ds.setPassword(password);

        ds.setInitialSize(5);
        ds.setMaxTotal(100);
    }
    //获取连接

    public static Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return null;
    }

    public static void close(ResultSet rs, PreparedStatement stmt, Connection con) {
        closeResultSet(rs);
        closeStatement(stmt);
        closeConnection(con);
    }

    //关闭ResultSet
    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭PreparedStatement
    public static void closeStatement(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //关闭Connection
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
