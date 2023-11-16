# Lectura de la matriz A desde la entrada estándar
matriz_a = [[int(input(f"Ingrese el elemento A[{i}][{j}]: ")) for j in range(4)] for i in range(4)]

# Lectura de la matriz B desde la entrada estándar
matriz_b = [[int(input(f"Ingrese el elemento B[{i}][{j}]: ")) for j in range(4)] for i in range(4)]

# Inicialización de la matriz resultado
matriz_resultado = [[0] * 4 for _ in range(4)]

# Multiplicación de matrices
for i in range(4):
    for j in range(4):
        for k in range(4):
            matriz_resultado[i][j] += matriz_a[i][k] * matriz_b[k][j]

# Mostrar la matriz resultado
print("Matriz Resultado (A * B):")
for i in range(4):
    for j in range(4):
        print(matriz_resultado[i][j], end=" ")
    print()
