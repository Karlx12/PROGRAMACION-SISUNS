import random

# Generar número aleatorio para el descuento
descuento_aleatorio = random.randint(1, 100)

# Solicitar al usuario ingresar el total de la compra
total_compra = float(input("Ingrese el total de la compra: "))

# Calcular el descuento según la regla dada
if descuento_aleatorio < 74:
    descuento = total_compra * 0.15
else:
    descuento = total_compra * 0.20

print("El descuento es:", descuento)
