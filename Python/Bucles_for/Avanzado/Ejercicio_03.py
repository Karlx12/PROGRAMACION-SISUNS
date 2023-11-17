# Inicialización de variables
base_simbolos = "0123456789ABCDEF"
resultado = ""

# Lectura del número decimal desde la entrada estándar
numero_decimal = int(input("Ingrese el número decimal a convertir: "))

# Lectura de la base de conversión desde la entrada estándar
base = int(input("Elija la base de conversión (2 para binario, 8 para octal, 16 para hexadecimal): "))

# Verificar que la base esté en el conjunto {2, 8, 16}
if base not in {2, 8, 16}:
    print("La base de conversión no es válida. Debe ser 2, 8 o 16.")
else:
    # Proceso de conversión
    for digito_restante in range(8 * len(str(numero_decimal))):  # Se asume una longitud máxima de 8 bits por byte del número
        resultado = base_simbolos[digito_restante % base] + resultado
        digito_restante = digito_restante // base

        if digito_restante == 0:
            break  # Terminar el bucle si ya no hay dígitos restantes

    # Mostrar el resultado
    print(f"El número {numero_decimal} en base {base} es: {resultado}")
