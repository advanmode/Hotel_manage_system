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
@WebServlet(name = "ScheduledUpdateServlet", urlPatterns = {"/ScheduledUpdateServlet"})
public class ScheduledUpdateServlet extends HttpServlet {

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
            String kefang = request.getParameter("kefang");
            String guke = request.getParameter("guke");
            String scheduled_id = request.getParameter("scheduled_id");
            String custom_name = request.getParameter("custom_name");
            String custom_identify = request.getParameter("custom_identify");
            String custom_tel = request.getParameter("custom_tel");
            String scheduled_room = request.getParameter("scheduled_room");
            String scheduled_room_type = request.getParameter("scheduled_room_type");
            String scheduled_time = request.getParameter("scheduled_time");
            String scheduled_begin_live = request.getParameter("scheduled_begin_live");
            String scheduled_end_leave = request.getParameter("scheduled_end_leave");
            String scheduled_total_time = request.getParameter("scheduled_total_time");
            String scheduled_price = request.getParameter("scheduled_price");
            DBOperateService operate = new DBOperateService();
            int flag = 0;

            flag = operate.update_scheduled(kefang, guke, scheduled_id, custom_name, custom_identify, custom_tel, scheduled_room, scheduled_room_type, scheduled_time, scheduled_begin_live, scheduled_end_leave, scheduled_total_time, scheduled_price);
            if (flag >= 1) {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改预定成功！')</script>");
            } else {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改预定失败！')</script>");
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
