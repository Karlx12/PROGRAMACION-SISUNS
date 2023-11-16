# Lectura del número desde la entrada estándar
N = int(input("Ingrese un número entero no negativo (N): "))

# Validar que N sea no negativo
if N < 0:
    print("El número debe ser no negativo. Fin del programa.")
else:
    # Inicialización del factorial
    factorial = 1
    i = 1

    # Calcular el factorial de N con un bucle while
    while i <= N:
        factorial *= i
        i += 1

    # Mostrar el resultado
    print(f"El factorial de {N} es: {factorial}")
