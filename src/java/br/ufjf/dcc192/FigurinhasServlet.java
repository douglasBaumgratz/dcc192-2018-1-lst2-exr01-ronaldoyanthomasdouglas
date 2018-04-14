package br.ufjf.dcc192;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuarios.html", "/FigurinhasServlet.html"})
public class FigurinhasServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
         if("/FigurinhasServlet.html".equals(request.getServletPath())){
             listarFigurinhas(request, response);
         }else if ("/nova.html".equals(request.getServletPath())){
             criarFigurinhasForm(request, response);
         }else if ("/edita.html".equals(request.getServletPath())){
            editaFigurinhasForm(request, response);
         }else if ("/excluir.html".equals(request.getServletPath())){
            exlcuiFigurinhasForm(request, response); 
         }
    }

    private void listarFigurinhas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Figurinhas> figurinhas = new ListaDeFigurinhas().getInstance();
       request.setAttribute("figurinhas", figurinhas);

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/figurinhas-listar.jsp");
        despachante.forward(request, response);
    }

    private void criarFigurinhasForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void editaFigurinhasForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exlcuiFigurinhasForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
