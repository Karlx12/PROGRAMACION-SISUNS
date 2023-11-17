# Lectura de las palabras desde la entrada estándar
palabra1 = input("Ingrese la primera palabra: ")
palabra2 = input("Ingrese la segunda palabra: ")

# Inicialización de variables
longitud1 = len(palabra1)
longitud2 = len(palabra2)
prefijo = ""
i = 1

# Encontrar el prefijo común con un bucle Mientras
while i <= min(longitud1, longitud2):
    if palabra1[:i] == palabra2[:i]:
        prefijo = palabra1[:i]
    else:
        break
    i += 1

# Mostrar el resultado
if len(prefijo) > 0:
    print("El prefijo común es:", prefijo)
else:
    print("No existe un prefijo común.")
