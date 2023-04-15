<?php

require_once("funciones.php");

$pdo = conectar_pdo("localhost", "umg", "t8>)XkRHZSq@L8*4", "db_diplomas");

//$insertar = insertarCampos($pdo, "personas");

if(insertarCampos($pdo, "personas")){
    header("Location: index.html");
    exit();
}else{
    echo "Ocurrió un error al insertar el registro";
}

/*include("conexion.php");
$con = conectar();
//$con = conectar_pdo();

$nombres = $_POST["nombres"];
$apellidos = $_POST["apellidos"];
$nacimiento = $_POST["fecha_nacimiento"];
$telefono = $_POST["telefono"];
$email = $_POST["email"];

$sql = "INSERT INTO personas (nombres, apellidos, fecha_nacimiento, telefono, email, fecha) 
        VALUES('$nombres', '$apellidos', '$nacimiento', '$telefono', '$email', CURRENT_TIMESTAMP())";


//print_r($sql);
$query = mysqli_query($con, $sql);
//$query = $con->prepare($sql);
var_dump($query);

if ($query) {
    Header("Location: index.html");
} else {

}

/*echo "<script>
alert('Registro insertado');
window.location='Encuesta.html';
</script>"*/
?>