# Determinante de una Matriz Cuadrada
matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

# Solicitar los 9 elementos de la matriz cuadrada
for i in range(3):
    for j in range(3):
        matriz[i][j] = float(input(f"Ingrese el elemento en la posición ({i+1}, {j+1}): "))

# Calcular el determinante
determinante = matriz[0][0] * (matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1]) - \
               matriz[0][1] * (matriz[1][0]*matriz[2][2] - matriz[1][2]*matriz[2][0]) + \
               matriz[0][2] * (matriz[1][0]*matriz[2][1] - matriz[1][1]*matriz[2][0])

if determinante != 0:
    print("El determinante de la matriz es diferente de cero")
else:
    print("El determinante de la matriz es cero, la matriz no es invertible")
