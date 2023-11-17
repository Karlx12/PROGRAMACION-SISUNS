<?php 
    $secuenciaADN = "ATGCTAAGGTTCACGG";
    $longitudSADN = strlen($secuenciaADN);
    $adenina = 0;
    $citosina = 0;
    $guanina = 0;
    $timina = 0;
    for ($i = 0; $i < $longitudSADN; $i++) {
        //Colocamos los corchetes en la variable: $secuenciaADN[$i]
        // El $i = 0...longitud de la cadena
        switch ($secuenciaADN[$i]) {
            case 'A':
                $adenina++;
                break;
            case 'C':
                $citosina++;
                break;
            case 'G':
                $guanina++;
                break;
            case 'T':
                $timina++;
                break;
        }
    }
    echo "Adenina (A): ".$adenina."<br>";
    echo "Citosina (C): ".$citosina."<br>";
    echo "Guanina (G): ".$guanina."<br>";
    echo "Timina (T): ".$timina."<br>";
?>