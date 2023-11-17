<?php
    $nota1 = 15;
    $nota2 = 11;
    $nota3 = 12;
    
    $promedio = ($nota1 + $nota2 + $nota3) / 3;

    //El round() sin su segundo parámetro indica redondeo hasta la parte entera
    echo "El promedio de las notas es: ". round($promedio);
?>