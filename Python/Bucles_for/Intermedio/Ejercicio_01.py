# Leer una palabra
palabra = input("Ingrese una palabra: ")

# Obtener la longitud de la cadena
tamCadena = len(palabra)

# Inicializar la cadena inversa
palabraReversa = ""

# Construir la cadena inversa
for i in range(tamCadena):
    # Obtener el carácter desde el final de la palabra hacia el principio
    palabraReversa += palabra[tamCadena - i - 1]

# Verificar si la palabra es un palíndromo
if palabra == palabraReversa:
    print("Es un palíndromo")
else:
    print("No es un palíndromo")

# Mostrar la palabra inversa
print("Palabra invertida:", palabraReversa)
