numeros = [35, 67, 25, 90, 100, 31, 14, 90]

longitud = len(numeros)

for i in range(longitud):
    for j in range(0, longitud - i - 1):
        if numeros[j] < numeros[j + 1]:
            numeros[j], numeros[j + 1] = numeros[j + 1], numeros[j]

print("Lista ordenada de mayor a menor:", numeros)
