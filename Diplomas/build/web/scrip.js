/* abre la ventana de impresión */
/*document.getElementById("imprimir").addEventListener("click", function() {
    window.print(); 
  });
  */

/*funcion para enviar correo electronico*/
/*
  document.getElementById("enviarCorreo").addEventListener("click", function() {
    window.location.href = "mailto:hosorios1@miumg.edu.gt";
    var contenido = document.body.innerHTML; // Obtiene el contenido de la pantalla
  }); */

  document.getElementById("enviarCorreo").addEventListener("click", function() {
    var contenido = document.body.innerHTML; // Obtiene el contenido de la pantalla
    var remitente = "kevinjaviosol@gmail.com"; // Agregar el correo electrónico del remitente
    var destinatario = "hosorios1@miumg.edu.gt"; // Cambiar por el destinatario deseado
    var asunto = "pruebas"; // Cambiar por el asunto deseado
    var cuerpo = encodeURIComponent(contenido); // Codifica el contenido para que se pueda enviar por correo electrónico
    
    window.location.href = "mailto:kevinjaviosol@gmail.com" + destinatario + "?subject=" + asunto + "&body=" + cuerpo;
  });
  

  

  
  