# Lectura del número de 4 cifras desde la entrada estándar
numero = int(input("Ingrese un número de 4 cifras: "))

# Verificar que el número tenga 4 cifras
if 1000 <= numero <= 9999:
    # Inicialización de variables
    original = numero
    inverso = 0

    # Obtener el número inverso
    while numero > 0:
        digito = numero % 10
        inverso = inverso * 10 + digito
        numero = numero // 10

    # Verificar si es capicúa y mostrar el resultado
    if original == inverso:
        print(f"El número {original} es capicúa.")
    else:
        print(f"El número {original} no es capicúa.")
else:
    print("El número ingresado no tiene 4 cifras. Fin del programa.")
