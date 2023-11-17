# Leer un número de 4 dígitos
numero = int(input("Ingrese un número de 4 dígitos: "))

# Verificar si el número tiene 4 dígitos
if 1000 <= numero <= 9999:
    # Inicializar contador de dígitos impares
    contador_impares = 0

    # Iterar sobre cada dígito del número
    while numero > 0:
        # Obtener el último dígito
        digito = numero % 10

        # Verificar si el dígito es impar
        if digito % 2 != 0:
            # Incrementar el contador de dígitos impares
            contador_impares += 1

        # Eliminar el último dígito
        numero //= 10

    # Mostrar la cantidad de dígitos impares
    print("La cantidad de dígitos impares es:", contador_impares)
else:
    print("El número no tiene 4 dígitos")
