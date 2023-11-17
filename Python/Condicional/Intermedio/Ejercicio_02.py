# Definir listas para los símbolos romanos y sus equivalentes en valores
simbolos_romanos = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
valores = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]

# Solicitar al usuario ingresar un número entero
numero = int(input("Ingrese un número entero (1-3999): "))

# Verificar si el número está en el rango válido
if 1 <= numero <= 3999:
    # Inicializar la cadena de resultado
    resultado_romano = ""

    # Iterar sobre los valores y construir el número romano
    for i in range(len(simbolos_romanos)):
        while numero >= valores[i]:
            # Agregar el símbolo romano al resultado
            resultado_romano += simbolos_romanos[i]
            # Restar el valor correspondiente al número
            numero -= valores[i]

    # Mostrar el número romano resultante
    print("El número romano es:", resultado_romano)
else:
    print("Número fuera de rango")
