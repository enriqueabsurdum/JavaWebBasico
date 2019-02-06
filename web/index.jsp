<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>

        <nav class="navbar-expand-lg navbar navbar-dark bg-primary">
            <div class="container font-weight-bold">
                <a class="navbar-brand" href="#">Usuarios</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="/JavaWebBasico/tabla.jsp">Listado</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container mt-3">
            <div class="row">
                <div class="col-sm-6 mx-auto">
                    <div class="card my-5 border-primary">
                        <div class="card-header">
                            <h3 class="text-center font-weight-bold pt-2">Nuevo usuario</h3>
                        </div>
                        <div class="card-body my-3 px-5">
                            <form action="crear-usuario" method="POST">
                                <div class="form-group">
                                    <label>RUN</label>
                                    <input type="text" class="form-control" name="run">
                                </div>
                                <div class="form-group">
                                    <label>Nombre</label>
                                    <input type="text" class="form-control" name="nombre">
                                </div>
                                <div class="form-group">
                                    <label>Apellido</label>
                                    <input type="text" class="form-control" name="apellido">
                                </div>
                                <div class="form-group">
                                    <label>Edad</label>
                                    <input type="number" class="form-control" name="edad">
                                </div>
                                <button type="submit" class="btn btn-primary px-5 float-right">Registrar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>       

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
    </body>
</html>
