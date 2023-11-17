<?php
    $opciones = ["Piedra", "Papel", "Tijeras"];
    $victorias = 0;
    $derrotas = 0;

    while (true) {
        echo "Opciones: 1. Piedra, 2. Papel, 3. Tijeras, 0. Salir<br>";
        echo "Victorias: $victorias <br> Derrotas: $derrotas <br>";

        echo "Elige una opción (1-3): ";
        $eleccionUsuario = rand(0,3).""; //Valor dado por el usuario
        echo "$eleccionUsuario<br>";

        if ($eleccionUsuario === "0") {
            echo "Fin del juego. Gracias por jugar.<br>";
            break;
        }

        $indiceComputadora = (intval($eleccionUsuario) % 3) + 1;
        $eleccionComputadora = $opciones[$indiceComputadora - 1];

        echo "Tu elección: {$opciones[intval($eleccionUsuario) - 1]} <br>";
        echo "Elección de la computadora: $eleccionComputadora <br>";

        if ($eleccionUsuario === $eleccionComputadora) {
            echo "Empate en esta ronda.<br>";
        } else {
            if (($eleccionUsuario === "1" && $eleccionComputadora === "3") ||
                ($eleccionUsuario === "2" && $eleccionComputadora === "1") ||
                ($eleccionUsuario === "3" && $eleccionComputadora === "2")) {
                echo "¡Ganaste esta ronda!<br>";
                $victorias++;
            } else {
                echo "¡Perdiste esta ronda!<br>";
                $derrotas++;
            }
        }
    }
?>