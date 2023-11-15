# Área de un Triángulo
lado1 = float(input("Ingrese la longitud del primer lado: "))
lado2 = float(input("Ingrese la longitud del segundo lado: "))
lado3 = float(input("Ingrese la longitud del tercer lado: "))

s = (lado1 + lado2 + lado3) / 2
area = (s * (s - lado1) * (s - lado2) * (s - lado3)) ** 0.5

print("El área del triángulo es:", area)
