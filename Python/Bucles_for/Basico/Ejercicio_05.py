N = int(input("Ingrese el valor de N: "))
suma = 0
contador = 0

for numero in range(2, N * 20):  # Asumiendo que hay al menos N números primos en los primeros N * 20 números naturales
    es_primo = True

    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            es_primo = False
            break

    if es_primo:
        suma += numero
        contador += 1

    if contador == N:
        break

print(f"La suma de los primeros {N} números primos es: {suma}")
