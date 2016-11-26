/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncomptebancaire;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aurelie pc neuf
 */

public class Comptebancaire extends HttpServlet {
    
    public void init(ServletConfig c) throws ServletException {
        super.init(c);
        getServletContext().setAttribute("listOperations", new ArrayList<Operations>());
    }

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Comptebancaire</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Gestion du compte bancaire</h1>");
            String virement = request.getParameter("virement");
            String retrait = request.getParameter("retrait");
            if (virement == null && retrait == null){
                out.println("Vous devez selectionner une action à effectuer sur votre compte ! :");
            }else{
                if(virement != null && retrait != null){
                   out.println("Vous devez selectionner qu'une seule action à effectuer sur votre compte ! :");
                } else {
                    Operations op = new Operations();           
                    op.setObjet(request.getParameter("objet"));            
                    op.setMontant(Integer.parseInt(request.getParameter("montant")));
                    ArrayList<Operations> listOperations = (ArrayList<Operations>)getServletContext().getAttribute("listOperations");
                    listOperations.add(op); 
                    int solde = (op.getSoldeAvant());
                    out.println("Votre solde de départ : " + op.getSoldeAvant() + "<br>");
                    if (virement != null){                        
                        solde = (op.getSoldeAvant()) + (op.getMontant());
                        out.println("solde = " + solde + "<br>");
                        op.setNewSolde(solde); 
                        out.println("solde avant : " + (op.getSoldeAvant()) + "<br>" + "Montant a ajouter :" + (op.getMontant()) + "<br>");
                        op.setSoldeAvant(solde);
                    }
                    if (retrait != null){
                        
                    }
                    
                    out.println("Voici votre nouveau Solde : " + op.getNewSolde() + "<br>");                  
                    out.println("<br> <br> Voici la liste des opérations effectuées : <br>");
                    for (Operations o:listOperations){
                        out.println(o + "</br>");
                    }
                }
            out.println("<br><a href=\"index.html\">Retour au menu</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }}

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
