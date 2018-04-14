package br.ufjf.dcc192;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FigurinhasServlet", urlPatterns = {"/usuarios.html", "/FigurinhasServlet.html", "/novoUsuario.html"})
public class FigurinhasServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
         if("/FigurinhasServlet.html".equals(request.getServletPath())){
             listarFigurinhas(request, response);
         }else if ("/novoUsuario.html".equals(request.getServletPath())){
             criarUsuarioForm(request, response);
         }else if ("/edita.html".equals(request.getServletPath())){
             editaUsuarioForm(request, response);
         }else if ("/excluir.html".equals(request.getServletPath())){
             excluiUsuarioForm(request, response);
         }
    }

    private void listarFigurinhas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Figurinhas> figurinhas = new ListaDeFigurinhas().getInstance();
       request.setAttribute("figurinhas", figurinhas);

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/figurinhas-listar.jsp");
        despachante.forward(request, response);
    }

    private void criarUsuarioForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/Usuario-novo.jsp");
        despachante.forward(request, response);
    }

    private void editaUsuarioForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void excluiUsuarioForm(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
