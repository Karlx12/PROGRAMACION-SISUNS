# Inicialización de variables
suma = 0
numero = 1

# Calcular la suma de cuadrados de pares y cubos de impares con un bucle Mientras
while numero <= 10:
    if numero % 2 == 0:
        # Sumar el cuadrado de números pares
        suma += numero**2
    else:
        # Sumar el cubo de números impares
        suma += numero**3
    numero += 1

# Mostrar el resultado
print("La suma de cuadrados de pares y cubos de impares entre 1 y 10 es:", suma)
