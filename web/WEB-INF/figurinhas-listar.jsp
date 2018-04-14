<%@page import="br.ufjf.dcc192.Figurinhas"%>
<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.ListaDeFigurinhas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Tarefas</title>
    </head>
    <body>
        <h1>Lista de Tarefas</h1>
        <table border = 1>
            <th>ID</th>
            <th>Descrição</th>
            <%
                int i = 0;
                for(Figurinhas figurinhas : (List<Figurinhas>) request.getAttribute("figurinhas")) {
            %>   
            <tr>
                <td><%=figurinhas.getCodigo()%></td>
                <td><%=figurinhas.getDescricao()%></td>                
            </tr>
            <%
            }            
            %>
        </table>
            
    </body>
    
</html>
