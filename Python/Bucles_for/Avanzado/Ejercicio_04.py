# Función para verificar si un número es primo
def es_primo(numero):
    if numero <= 1:
        return False
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False
    return True

# Inicialización de variables
numeros = [0] * 5
suma = 0

# Lectura de los 5 números desde la entrada estándar
for i in range(5):
    numeros[i] = int(input(f"Ingrese el número {i+1}: "))

# Sumar solo los números primos
for num in numeros:
    if es_primo(num):
        suma += num

# Mostrar la suma de los números primos
print(f"La suma de los números primos es: {suma}")
