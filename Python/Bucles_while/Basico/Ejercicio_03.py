# Inicialización de variables
nivel = 1

# Mientras el nivel sea menor o igual a 10
while nivel <= 10:
    # Calcular el número de espacios antes de los números
    espacios = 10 - nivel

    # Imprimir los espacios
    for i in range(espacios):
        print(" ", end="")

    # Imprimir los números ascendentes
    for numero in range(1, nivel + 1):
        print(numero, end="")

    # Imprimir los números descendentes
    for numero in range(nivel - 1, 0, -1):
        print(numero, end="")

    # Ir al siguiente nivel
    nivel += 1
    print()  # Nueva línea para la siguiente fila
