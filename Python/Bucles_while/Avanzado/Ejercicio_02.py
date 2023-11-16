# Inicialización de variables
intento = 0

# Asignar un número aleatorio al número a adivinar
numero_aleatorio = 50  # Puedes elegir cualquier número en el rango de 1 a 100

# Ciclo para adivinar el número
while True:
    # Incrementar el contador de intentos
    intento += 1

    # Solicitar al usuario adivinar el número
    numero_adivinanza = int(input(f"Intento {intento}: Ingrese un número entre 1 y 100: "))

    # Verificar si el número es igual, mayor o menor
    if numero_adivinanza == numero_aleatorio:
        print("¡Felicitaciones! Has adivinado el número correctamente.")
        break
    elif numero_adivinanza < numero_aleatorio:
        print("El número es mayor. Intenta nuevamente.")
    else:
        print("El número es menor. Intenta nuevamente.")
