# Leer la lista de números
lista_numeros = input("Ingrese una lista de números separados por espacios: ").split()

# Convertir los elementos de la lista a números
lista_numeros = [float(numero) for numero in lista_numeros]

# Verificar si la lista no está vacía
if len(lista_numeros) > 0:
    # Calcular la media
    media = sum(lista_numeros) / len(lista_numeros)

    # Ordenar la lista para calcular la mediana
    for i in range(len(lista_numeros)):
        for j in range(0, len(lista_numeros) - i - 1):
            if lista_numeros[j] > lista_numeros[j + 1]:
                lista_numeros[j], lista_numeros[j + 1] = lista_numeros[j + 1], lista_numeros[j]

    # Calcular la mediana
    if len(lista_numeros) % 2 == 0:
        mediana = (lista_numeros[len(lista_numeros) // 2 - 1] + lista_numeros[len(lista_numeros) // 2]) / 2
    else:
        mediana = lista_numeros[len(lista_numeros) // 2]

    # Calcular la moda
    frecuencias = {}
    for numero in lista_numeros:
        frecuencias[numero] = frecuencias.get(numero, 0) + 1

    moda = None
    max_frecuencia = 0
    for numero, frecuencia in frecuencias.items():
        if frecuencia > max_frecuencia:
            moda = numero
            max_frecuencia = frecuencia

    # Mostrar los resultados
    print("Media:", media)
    print("Mediana:", mediana)
    print("Moda:", moda)
else:
    print("La lista está vacía")
