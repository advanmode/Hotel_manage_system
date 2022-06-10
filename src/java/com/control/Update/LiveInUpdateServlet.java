/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control.Update;

import com.service.DBOperateService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 钟镇斌
 */
@WebServlet(name = "LiveInUpdateServlet", urlPatterns = {"/LiveInUpdateServlet"})
public class LiveInUpdateServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8"); 
          String kefang=request.getParameter("kefang");
          String guke=request.getParameter("guke");
          String live_in_id=request.getParameter("live_in_id");
          String custom_name=request.getParameter("custom_name");
          String custom_identify=request.getParameter("custom_identify");
          String custom_tel=request.getParameter("custom_tel");
          String live_in_room=request.getParameter("live_in_room");
          String live_in_room_type=request.getParameter("live_in_room_type");
          String room_price=request.getParameter("room_price");
          String live_in_time=request.getParameter("live_in_time");
          String plan_leave_time=request.getParameter("plan_leave_time");
          String total_live_time=request.getParameter("total_live_time");
          String total_price=request.getParameter("total_price");
          String deposit=request.getParameter("deposit");
          String run_staff_name=request.getParameter("run_staff_name");
          String run_staff_tel=request.getParameter("run_staff_tel");
          int flag=0;
          DBOperateService operateService=new DBOperateService();
          flag=operateService.update_live_in(kefang, guke, live_in_id, custom_name, custom_identify, custom_tel, live_in_room, live_in_room_type, room_price, live_in_time, plan_leave_time, total_live_time,total_price, deposit, run_staff_name, run_staff_tel);
            if (flag >= 1) {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改入住成功！')</script>");
            } else {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改入住失败！')</script>");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
