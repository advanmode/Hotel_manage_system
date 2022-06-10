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
@WebServlet(name = "ContinuteUpdateServlet", urlPatterns = {"/ContinuteUpdateServlet"})
public class ContinuteUpdateServlet extends HttpServlet {

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
            String continute_id=request.getParameter("continute_id");
           String custom_name=request.getParameter("custom_name");
           String custom_tel=request.getParameter("custom_tel");
           String continute_room=request.getParameter("continute_room");
           String continute_room_type=request.getParameter("continute_room_type");
           String live_begin_time=request.getParameter("live_begin_time");
           String aleady_live_time=request.getParameter("aleady_live_time");
           String continute_begin_time=request.getParameter("continute_begin_time");
           String continute_end_time=request.getParameter("continute_end_time");
           String continute_total_time=request.getParameter("continute_total_time");
           String continute_price=request.getParameter("continute_price");
           String run_staff_name=request.getParameter("run_staff_name");
           String run_staff_tel=request.getParameter("run_staff_tel");
            int flag=0;
            DBOperateService operate=new DBOperateService();
            flag=operate.update_continute(kefang, guke, continute_id, custom_name, custom_tel, continute_room, continute_room_type, live_begin_time, aleady_live_time, continute_begin_time, continute_end_time, continute_total_time, continute_price, run_staff_name, run_staff_tel);
             if (flag == 1) {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改续房成功！')</script>");
            } else {
                out.println("<script language='javascript'>window.location.href='staff.jsp';alert('修改续房失败！')</script>");
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
