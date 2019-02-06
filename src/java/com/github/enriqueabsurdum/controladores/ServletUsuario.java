package com.github.enriqueabsurdum.controladores;

import com.github.enriqueabsurdum.dao.UsuarioDao;
import com.github.enriqueabsurdum.modelos.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletUsuario", urlPatterns = {"/crear-usuario"})
public class ServletUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String run = request.getParameter("run");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String sEdad = request.getParameter("edad");

        if (!run.equalsIgnoreCase("")
                && !nombre.equalsIgnoreCase("")
                && !apellido.equalsIgnoreCase("")
                && !sEdad.equalsIgnoreCase("")) {

            int edad;
            try {
                edad = Integer.parseInt(sEdad);
            } catch (NumberFormatException nfe) {
                System.out.printf("Excepción %s\n", nfe.getMessage());
                edad = 0;
            }

            UsuarioDao daoUsuario = new UsuarioDao();
            Usuario usuario = new Usuario(0, run, nombre, apellido, edad);
            daoUsuario.create(usuario);
            request.getRequestDispatcher("correcto.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
