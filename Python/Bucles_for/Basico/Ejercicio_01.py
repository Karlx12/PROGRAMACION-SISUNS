# Leer un número
dato = int(input("Ingrese un número: "))

# Inicializar el contador de divisores
contador = 0

# Verificar si el número es divisible entre él mismo y los anteriores a él
for i in range(1, dato + 1):
    if dato % i == 0:
        # El número es divisible, aumentar el contador
        contador += 1

# Determinar si el número es primo
if contador == 2:
    print(f"El número {dato} es primo.")
else:
    # Aquellos con más de 2 divisores no son primos
    print(f"El número {dato} no es primo.")
