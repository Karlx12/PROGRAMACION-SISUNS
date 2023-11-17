# Cobro en Estacionamiento
minutos = int(input("Ingrese la cantidad de minutos: "))
horas = int(input("Ingrese la cantidad de horas: "))
diaDeLaSemana = input("Ingrese el día de la semana: ")

montoTotal = 0

if minutos > 10:
    montoTotal = (minutos - 10) * 0.30

if horas > 0:
    montoTotal = montoTotal + horas * 0.60

if diaDeLaSemana.lower() == "martes" or diaDeLaSemana.lower() == "sábado":
    descuento = montoTotal * 0.15
    montoTotal = montoTotal - descuento

print("El monto a pagar es:", montoTotal)
