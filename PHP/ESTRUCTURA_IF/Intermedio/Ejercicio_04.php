<?php
    $salarioNormal = 10;
    $horasTrabajadas = 45;

    if ($horasTrabajadas > 40) {
        $horasNormales = 40;
        $horasExtras = $horasTrabajadas - 40;
        $salario = ($horasNormales * $salarioNormal) + ($horasExtras * $salarioNormal * 2);
    } else {
        $salario = $horasTrabajadas * $salarioNormal;
    }

    echo "El salario es: ". $salario;
?>