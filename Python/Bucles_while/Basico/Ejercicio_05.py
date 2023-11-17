# Declaración de variables
numero = 9
suma = 0

# Mientras el número sea menor o igual a 45
while numero <= 45:
    # Excluir números entre 21 y 27
    if numero < 21 or numero > 27:
        # Verificar si es múltiplo de 3 o 7
        if numero % 3 == 0 or numero % 7 == 0:
            # Sumar al resultado
            suma += numero

    # Incrementar el número
    numero += 1

# Mostrar la suma
print(f"La suma de los múltiplos de 3 y 7 es: {suma}")
