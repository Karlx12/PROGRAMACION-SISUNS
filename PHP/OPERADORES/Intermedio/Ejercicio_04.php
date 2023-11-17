<?php
    $minutos = 50;
    $horas = 4;
    $diaDeLaSemana = "martes";

    $montoTotal = 0;

    //Los if con expresiones condicionales
    if($minutos > 10){
        $montoTotal = ($minutos - 10) * 0.30;
    }

    if($horas > 0){
        $montoTotal = $montoTotal + $horas * 0.60;
    }

    //El == es un operador de comparación, es distinto al = que es de asignación.
    //Se basa en verificar si la variable y lo indicado son iguales, el || indica
    //que una de las dos condiciones debe cumplirse para ejecutar el código del if
    if($diaDeLaSemana == "martes" || $diaDeLaSemana == "sábado"){
        $descuento = $montoTotal * 0.15;
        $montoTotal = $montoTotal - $descuento;
    }
    
    echo "El monto a pagar es: ". $montoTotal;
?>