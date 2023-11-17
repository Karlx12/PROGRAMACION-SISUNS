<?php
    $usuario = "usuario123";
    $contraseña = "contraseña456";
    $intentos = 0;

    while ($intentos < 3) {
        $usuarioIngresado = "usuario123";
        $contraseñaIngresada = "contraseña456";

        if ($usuarioIngresado === $usuario && $contraseñaIngresada === $contraseña) {
            echo "Inicio de sesión exitoso. Bienvenido, ". $usuario . "<br>";
            break;
        } else {
            echo "Credenciales incorrectas. Intento ". $intentos + 1, " de 3<br>";
            $intentos++;
        }
    }

    if ($intentos === 3) {
        echo "Demasiados intentos fallidos. El programa se ha bloqueado.<br>";
    }
?>