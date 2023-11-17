# Lectura del texto desde la entrada estándar
texto = input("Ingrese una cadena de texto: ")

# Inicialización de variables
contador_palabras = 0
longitud = len(texto)
i = 0

# Contar el número de palabras con un bucle Mientras
while i < longitud:
    # Si encuentra un espacio, incrementar el contador de palabras
    if texto[i] == " ":
        contador_palabras += 1
    i += 1

# Incrementar el contador para la última palabra (no seguida por espacio)
contador_palabras += 1

# Mostrar el resultado
print("El número de palabras en el texto es:", contador_palabras)
