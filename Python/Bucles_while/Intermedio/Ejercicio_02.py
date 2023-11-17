# Lectura del número N desde la entrada estándar
N = int(input("Ingrese un número entero N: "))

# Validar que N sea positivo
if N <= 0:
    print("El número debe ser un entero positivo. Fin del programa.")
else:
    # Inicialización de variables
    termino = 7
    incremento = 2
    i = 1

    # Mostrar los primeros N términos de la serie
    while i <= N:
        print(termino, end=" ")
        termino += incremento
        incremento += 1
        i += 1
