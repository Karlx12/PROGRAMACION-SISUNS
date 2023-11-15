# Solicitar al usuario ingresar la cantidad de hijos y la situación de la madre
cantidad_hijos = int(input("Ingrese la cantidad de hijos: "))
madre_viuda = input("¿La madre es viuda? (Sí/No): ").lower()

# Calcular el monto del subsidio familiar
monto = 0

if cantidad_hijos <= 2:
    monto = 70
elif 3 <= cantidad_hijos <= 5:
    monto = 90
else:
    monto = 120

# Por cada hijo en edad escolar reciben S/.10.00 adicionales
hijos_edad_escolar = int(input("Ingrese la cantidad de hijos en edad escolar: "))
monto += hijos_edad_escolar * 10

# Si la madre es viuda, la familia recibe S/.20.00 adicionales
if madre_viuda == "sí":
    monto += 20

print("El monto mensual es:", monto)
