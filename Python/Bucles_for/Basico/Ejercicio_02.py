# Iterar a través de los números del 1 al 100
for numero in range(1, 101):
    # Imprimir el número actual
    print(numero, end="")

    # Verificar si el número es divisible por 3 para agregar un guion bajo
    if numero % 3 == 0:
        print("_", end="")

    # Imprimir un espacio para separar los números
    print(" ", end="")
