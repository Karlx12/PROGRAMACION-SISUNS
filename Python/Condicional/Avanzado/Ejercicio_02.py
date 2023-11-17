# Leer tres longitudes
lado1 = float(input("Ingrese la longitud del lado 1: "))
lado2 = float(input("Ingrese la longitud del lado 2: "))
lado3 = float(input("Ingrese la longitud del lado 3: "))

# Verificar si las longitudes forman un triángulo
if lado1 < lado2 + lado3 and lado2 < lado1 + lado3 and lado3 < lado1 + lado2:
    # Determinar el tipo de triángulo
    if lado1 == lado2 == lado3:
        print("Es un triángulo equilátero")
    elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
        print("Es un triángulo isósceles")
    else:
        print("Es un triángulo escaleno")
else:
    print("No es un triángulo")
