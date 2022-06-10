/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control.Add;

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
@WebServlet(name = "LiveOutAddServlet", urlPatterns = {"/LiveOutAddServlet"})
public class LiveOutAddServlet extends HttpServlet {

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
          String live_out_id=request.getParameter("live_out_id");
          String custom_name=request.getParameter("custom_name");
          String custom_tel=request.getParameter("custom_tel");
          String live_out_room=request.getParameter("live_out_room");
          String live_out_room_type=request.getParameter("live_out_room_type");
          String live_in_time=request.getParameter("live_in_time");
          String live_out_time=request.getParameter("live_out_time");
          String total_live_time=request.getParameter("total_live_time");
          String total_price=request.getParameter("total_price");
          String run_staff_name=request.getParameter("run_staff_name");
          String run_staff_tel=request.getParameter("run_staff_tel");
            DBOperateService operate = new DBOperateService();
            int flag = 0;

            flag = operate.insert_live_out(live_out_id, custom_name, custom_tel, live_out_room, live_out_room_type, live_in_time, live_out_time, total_live_time, total_price, run_staff_name, run_staff_tel);
            if (flag == 1) {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('添加退房成功！')</script>");
            } else {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('添加退房失败！')</script>");
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
