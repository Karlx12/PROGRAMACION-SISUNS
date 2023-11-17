# Solicitar al usuario ingresar una calificación (0-20)
calificacion = float(input("Ingrese su calificación (0-20): "))

# Verificar si la calificación es aprobatoria (mayor o igual a 11)
if calificacion >= 11:
    print("Calificación aprobatoria")
else:
    print("Calificación no aprobatoria")
