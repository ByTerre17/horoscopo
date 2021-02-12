/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Utilidades;

/**
 *
 * @author manue
 */
public class horoscopo extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet horoscopo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet horoscopo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        ArrayList<String> meses = Utilidades.getMeses();
        request.setAttribute("meses", meses);
        request.getRequestDispatcher("horoscopo.jsp").forward(request, response);
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
        String fecha =  (String) request.getAttribute("fecha");
        String signo = null;
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM");
        Date aries1 = null;
        try {
            aries1 = formato.parse("21/3");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date aries2 = null;
        try {
            aries2 = formato.parse("19/4");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date tauro1 = null;
        try {
            tauro1 = formato.parse("20/4");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date tauro2 = null;
        try {
            tauro2 = formato.parse("21/5");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date geminis1 = null;
        try {
            geminis1 = formato.parse("21/5");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date geminis2 = null;
        try {
            geminis2 = formato.parse("20/6");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date cancer1 = null;
        try {
            cancer1 = formato.parse("21/6");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date cancer2 = null;
        try {
            cancer2 = formato.parse("22/7");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date leo1 = null;
        try {
            leo1 = formato.parse("23/7");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date leo2 = null;
        try {
            leo2 = formato.parse("22/8");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date virgo1 = null;
        try {
            virgo1 = formato.parse("23/8");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date virgo2 = null;
        try {
            virgo2 = formato.parse("22/9");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date libra1 = null;
        try {
            libra1 = formato.parse("23/9");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date libra2 = null;
        try {
            libra2 = formato.parse("22/10");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date escorpio1 = null;
        try {
            escorpio1 = formato.parse("23/10");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date escorpio2 = null;
        try {
            escorpio2 = formato.parse("21/11");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date sagitario1 = null;
        try {
            sagitario1 = formato.parse("22/11");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date sagitario2 = null;
        try {
            sagitario2 = formato.parse("21/12");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date capricornio1 = null;
        try {
            aries2 = formato.parse("22/12");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date capricornio2 = null;
        try {
            aries2 = formato.parse("19/1");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date acuario1 = null;
        try {
            aries2 = formato.parse("20/1");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date acuario2 = null;
        try {
            aries2 = formato.parse("18/2");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date piscis1 = null;
        try {
            piscis1 = formato.parse("19/2");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date piscis2 = null;
        try {
            piscis2 = formato.parse("20/3");
        } catch (ParseException ex) {
            Logger.getLogger(horoscopo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        if(fechaDate.before(aries1)&&fechaDate.after(aries2)){
            signo="aries";
        }
        if(fechaDate.before(tauro1)&&fechaDate.after(tauro2)){
            signo="tauro";
        }
        if(fechaDate.before(geminis1)&&fechaDate.after(geminis2)){
            signo="geminis";
        }
        if(fechaDate.before(cancer1)&&fechaDate.after(cancer2)){
            signo="cancer";
        }
        if(fechaDate.before(leo1)&&fechaDate.after(leo2)){
            signo="leo";
        }
        if(fechaDate.before(virgo1)&&fechaDate.after(virgo2)){
            signo="virgo";
        }
        if(fechaDate.before(libra1)&&fechaDate.after(libra2)){
            signo="libra";
        }
        if(fechaDate.before(escorpio1)&&fechaDate.after(escorpio2)){
            signo="escorpio";
        }
        if(fechaDate.before(sagitario1)&&fechaDate.after(sagitario2)){
            signo="sagitario";
        }
        if(fechaDate.before(capricornio1)&&fechaDate.after(capricornio2)){
            signo="capricornio";
        }
        if(fechaDate.before(acuario1)&&fechaDate.after(acuario2)){
            signo="acuario";
        }
        if(fechaDate.before(piscis1)&&fechaDate.after(piscis2)){
            signo="piscis";
        }
        request.setAttribute("signo", signo);
        request.getRequestDispatcher("signo.jsp").forward(request, response);
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
