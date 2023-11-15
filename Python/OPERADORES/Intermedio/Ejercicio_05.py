# Área de un Cilindro
import math

radio = float(input("Ingrese el radio del cilindro: "))
altura = float(input("Ingrese la altura del cilindro: "))

area = 2 * math.pi * radio * (radio + altura)

print("El área del cilindro es:", area)
