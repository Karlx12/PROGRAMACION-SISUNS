# Inicialización de variables
primer_termino = 1
segundo_termino = 1
suma_terminos = 2  # Inicializado con los dos primeros términos de la serie
promedio = 0

# Lectura del valor de N desde la entrada estándar
N = int(input("Ingrese el valor de N: "))

# Verificar si N es menor o igual a 0
if N <= 0:
    print("N debe ser un número entero positivo.")
else:
    # Mostrar los dos primeros términos de la serie
    print(f"Serie de Fibonacci hasta el término {N}: {primer_termino}, {segundo_termino}", end="")

    # Calcular y mostrar el resto de la serie
    for termino_actual in range(3, N + 1):
        siguiente_termino = primer_termino + segundo_termino
        print(f", {siguiente_termino}", end="")
        suma_terminos += siguiente_termino

        # Actualizar los términos para el próximo cálculo
        primer_termino, segundo_termino = segundo_termino, siguiente_termino

    # Calcular y mostrar el promedio
    promedio = suma_terminos / N
    print(f"\nPromedio de la serie: {promedio}")
