<%-- 
    Document   : index
    Created on : 9/04/2023, 21:28:57
    Author     : Maydas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>

  <link rel="preload" href="normalize.css" as="style">
  <link href="normalize.css" rel="stylesheet">

  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Krub:wght@400;700&display=swap" rel="stylesheet">

  <link rel="preload" href="Stl.css" as="style">
  <link href="Stl.css" rel="stylesheet">
</head>

<body>

  <header>
    <h1 class="titulo">Ingenieria en Sistemas
      <span>7mo Ciclo</span>
    </h1>

  </header>

  <div class="  nav-bg">
    <nav class="navegacion-principal contenedor">
      <a href="#">Inicio</a>
      <a href="#">Sobre UMG</a>
      <a href="#">Descargar Diploma</a>
      <a href="#">Contacto</a>

    </nav>
  </div>

  <section class="hero">
    <div class="contenido-hero">
      <h2> Encuesta del Evento <span></span></h2>

      Cuidad de Guatemala</p>

    </div>
  </section>

  <main class="contenedor sombra">

    <section>
      <h2>Registro de personas</h2>

      <form action="sv_users" method="POST">
        <fieldset>

          <legend>Ingresa tus datos para registrate al evento</legend>

          <div class="contenedor-campos">
            <div class="campo">
              <label>Nombres</label>
              <input class="input-text" type="text" name="nombres" placeholder="Nombres" required>
            </div>
            <div class="campo">
              <label>Apellidos</label>
              <input class="input-text" type="text" name="apellidos" placeholder="Apellidos"required>
            </div>
            <div class="campo">
              <label>Fecha Nacimiento</label>
              <input class="input-text" type="date" name="fecha_nacimiento" placeholder="Fecha Nacimiento" id="date_timepicker_end" required>
            </div>
            <div class="campo">
              <label>Telefono</label>
              <input class="input-text" type="tel" name="telefono" placeholder="Tu Telefono"required>
            </div>
            <div class="campo">
              <label>Correo Electronico</label>
              <input class="input-text" type="email" name="email" placeholder="Tu Email"required>
            </div>
          </div>
          <div class="alinear-derecha flex">
            <input class="boton W-sm-100" type="submit" value="Enviar">
          </div>
        </fieldset>

      </form>
    </section>

  </main>
  <footer class="footer">
    <p>Todos los derechos reservados. Estudiantes de Ingenieria</p>
  </footer>

</body>

</html>
