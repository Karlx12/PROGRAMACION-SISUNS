# Ecuación Cuadrática
import math

a = float(input("Ingrese el coeficiente a: "))
b = float(input("Ingrese el coeficiente b: "))
c = float(input("Ingrese el coeficiente c: "))

# Calcular el discriminante
discriminante = b**2 - 4*a*c

if discriminante >= 0:
    # Calcular las raíces reales
    x1 = (-b + math.sqrt(discriminante)) / (2*a)
    x2 = (-b - math.sqrt(discriminante)) / (2*a)

    # Mostrar las raíces
    print(f"Las raíces reales son: {x1} y {x2}")
else:
    print("La ecuación no tiene raíces reales")
