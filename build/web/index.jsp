<%@page import="conteudo.pagina.Conteudo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>JSP Page</title>
        <style>
            table, th, td{
                border: 1px solid #aaa;
            }
            td, th{
                padding: 8px;
                text-align: center;
            }
        </style>
    </head>

    <body>
        <center>
            <header>
                <h1>JSP Page</h1>
            </header>
            <br>
            <section>
                <%
                    Conteudo cont = new Conteudo();

                    out.print(cont.conteudo());

                %>
            </section>
            <br>
            <footer>
                <p>&copy;<em>by Lucas Torres</em></p>
            </footer>
        </center>
    </body>
</html>
