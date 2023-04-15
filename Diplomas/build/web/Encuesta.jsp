<%-- 
    Document   : Encuesta
    Created on : 9/04/2023, 21:38:34
    Author     : Maydas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
      <a href="./index.html">Inicio</a>
      <a href="https://umg.edu.gt/info">Sobre UMG</a>
      <a href="#">Descargar Diploma</a>
      <a href="#">Contacto</a>

    </nav>
  </div>

  <section class="hero">


    </div>
  </section>

  <main class="contenedor sombra">


    <section>
      <h2>Ingreso a la Encuesta</h2>

      <form class="formulario">

        <fieldset>

            <legend>Recibe tu diploma 
            </legend>
                    
            <form>
   
<p>El mensaje es: <%= request.getAttribute("mensaje") %></p>



         <a href="<%= request.getAttribute("mensaje") %>" download="diploma-participacion.pdf">Descargar</a>
         
            </form>
        </fieldset>

      </form>
    </section>

  </main>
  <footer class="footer">
    <p>Todos los derechos reservados. Estudiantes de UMG.</p>
  </footer>
</body>

</html>
