<?php
    $temperaturaCelsius = 50;

    $kelvin = $temperaturaCelsius + 273.15;

    $ranking = $temperaturaCelsius * 1.25;

    $fahrenheit = ($temperaturaCelsius * 9/5) + 32;
    
    echo "Temperatura en Kelvin: ". $kelvin."<br>";
    echo "Temperatura en Ranking: ". $ranking."<br>";
    echo "Temperatura en Fahrenheit: ". $fahrenheit."<br>";
?>