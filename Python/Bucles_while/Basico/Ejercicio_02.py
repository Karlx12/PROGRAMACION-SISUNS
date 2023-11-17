# Inicialización del número
numero = 1

# Mientras el número sea menor o igual a 20
while numero <= 20:
    # Mostrar el número actual
    print(numero, end=" ")

    # Si el número es divisible por 5, mostrar 0
    if numero % 5 == 0:
        print(0, end=" ")

    # Incrementar el número
    numero += 1
