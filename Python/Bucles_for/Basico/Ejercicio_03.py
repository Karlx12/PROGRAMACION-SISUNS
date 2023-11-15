# Leer el tamaño del cuadrado (n)
n = int(input("Ingrese el tamaño del cuadrado: "))

# Verificar si n es mayor que 0
if n > 0:
    # Iterar a través de las filas del cuadrado
    for fila in range(n):
        # Iterar a través de las columnas del cuadrado
        for columna in range(n):
            # Imprimir un asterisco
            print("* ", end="")

        # Salto de línea después de cada fila
        print("")
else:
    print("El tamaño debe ser mayor que 0")
