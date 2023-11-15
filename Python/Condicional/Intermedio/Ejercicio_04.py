# Solicitar al usuario ingresar las horas trabajadas
horas_trabajadas = float(input("Ingrese las horas trabajadas: "))

# Definir salario por hora normal
salario_normal = 10.0  # Reemplaza con el valor real

# Calcular el salario según las horas extras
if horas_trabajadas > 40:
    horas_normales = 40
    horas_extras = horas_trabajadas - 40
    salario = (horas_normales * salario_normal) + (horas_extras * salario_normal * 2)
else:
    salario = horas_trabajadas * salario_normal

print("El salario es:", salario)
