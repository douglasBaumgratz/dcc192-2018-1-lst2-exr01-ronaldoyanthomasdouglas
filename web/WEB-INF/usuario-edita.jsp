<%@page import="br.ufjf.dcc192.Figurinhas"%>
<%@page import="br.ufjf.dcc192.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuário</title>
    </head>
    <body>
        <h1>Editar Usuário</h1>
            <%
                Figurinhas t;
                t = (Figurinhas)request.getAttribute("figurinhas");
            %>   
        <form method="post">
            <label>Código: <input type="text" name="id" size="2" value="<%=request.getParameter("id")%>" disabled="disable" /> </label>
            <br>
            <label>Descricao: <input type="text" name="titulo" value="<%=t.getDescricao()%>"/> </label>
            <br>
            <br>
            <input type="submit" value="Gravar" />
            
        </form>
    </body>
</html>