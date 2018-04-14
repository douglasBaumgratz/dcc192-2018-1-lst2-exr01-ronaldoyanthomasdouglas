<%@page import="br.ufjf.dcc192.Figurinhas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Figurinhas</title>
    </head>
    <body>
        <h1>Editar Figurinhas</h1>
            <%
                Figurinhas t;
                t = (Figurinhas)request.getAttribute("figurinhas");
            %>   
        <form method="post">
            <label>Código: <input type="text" name="codFigura" size="2" value="<%=request.getParameter("id")%>" disabled="disable" /> </label>
            <br>
            <label>Descricao: <input type="text" name="descricao" value="<%=t.getDescricao()%>"/> </label>
            <br>
            <br>
            <input type="submit" value="Gravar" />          
            
        </form>
    </body>
</html>