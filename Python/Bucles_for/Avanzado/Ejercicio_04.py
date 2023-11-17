# Inicialización de variables
numeros = [0] * 5
suma = 0

# Lectura de los 5 números desde la entrada estándar
for i in range(5):
    numeros[i] = int(input("Ingrese el número {}: ".format(i + 1)))

# Verificar si un número es primo y sumarlo
for num in numeros:
    if num > 1:
        es_primo = True
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                es_primo = False
                break
        if es_primo:
            suma += num

# Mostrar la suma de los números primos
print("La suma de los números primos es:", suma)
