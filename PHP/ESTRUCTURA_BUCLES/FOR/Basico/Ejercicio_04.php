<?php
    $lista_numeros = [4, 7, 2, 8, 1, 9, 6, 3, 5];
    if (count($lista_numeros) > 0){
        $media = 0;
        //La función array_sum() suma todos los valores de un array. 
        $media = array_sum($lista_numeros) / count($lista_numeros);
        //Ordenar la lista para calcular la mediana.
        $longitud = count($lista_numeros);
        for ($i = 0; $i < $longitud; $i++) {
            for ($j = 0; $j < $longitud - $i - 1; $j++) {
                if ($lista_numeros[$j] > $lista_numeros[$j + 1]) {
                    //Intercambiar elementos si están en el orden incorrecto.
                    $temp = $lista_numeros[$j];
                    $lista_numeros[$j] = $lista_numeros[$j + 1];
                    $lista_numeros[$j + 1] = $temp;
                }
            }
        }

        //Calcular la mediana.
        if($longitud % 2 == 0){
            $mediana = ($lista_numeros[$longitud/2-1] + $lista_numeros[$longitud/2]) / 2;
        }else{
            $mediana = $lista_numeros[intval($longitud/2)];
        }

        //Calcular la moda.
        $frecuencias = [];
        foreach ($lista_numeros as $numero) {
            //Un operador ternario de la forma "(condicion) ? verdadero : falso", es como un if.
            //La función isset() comprueba si el valor existe.
            $frecuencias[$numero] = isset($frecuencias[$numero]) ? $frecuencias[$numero] + 1 : 1;
        }

        $max_frecuencia = 0;
        foreach ($frecuencias as $numero => $valor) {
            if ($valor > $max_frecuencia) {
                $moda = $numero;
                $max_frecuencia = $valor;
            }
        }

        echo "Media: ".$media."<br>";
        echo "Mediana: ".$mediana."<br>";

        if($max_frecuencia == 1){
            echo "No hay moda, todos tienen la misma frecuencia de repetición <br>";
        }else{
            echo "Moda: ".$moda."<br>";
        }
    }else{
        echo "La lista está vacía";
    }
?>