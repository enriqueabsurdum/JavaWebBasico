<%@page import="com.github.enriqueabsurdum.dao.UsuarioDao"%>
<%@page import="java.util.List"%>
<%@page import="com.github.enriqueabsurdum.modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    UsuarioDao daoUsuario = new UsuarioDao();
    List<Usuario> listado = daoUsuario.findAll();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>

        <div class="container mt-5">
            <h4 class="pt-5 pb-3 text-center">Lista de usuarios</h4>
            <table class="table table-bordered table-hover">
                <thead class="thead-light">
                    <tr class="align-middle">
                        <th>#</th>
                        <th>RUN</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Edad</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        if (!listado.isEmpty()) {
                            for (Usuario u : listado) {
                    %>
                    <tr>
                        <td class="align-middle"><%= u.getId()%></td>
                        <td class="align-middle"><%= u.getRun()%></td>
                        <td class="align-middle"><%= u.getNombre()%></td>
                        <td class="align-middle"><%= u.getApellido()%></td>
                        <td class="align-middle"><%= u.getEdad()%></td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan=4>
                            <div class="text-center text-primary text-uppercase font-weight-bold">No hay registros</div>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>

            <div class="my-4">
                <div class="float-middle">
                    <a class="btn btn-primary align-middle px-5" href="/JavaWebBasico/index.jsp">Volver</a>
                </div>
            </div>
        </div>   
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        
    </body>
</html>
