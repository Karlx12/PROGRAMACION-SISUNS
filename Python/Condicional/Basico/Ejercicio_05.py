# Solicitar al usuario ingresar su peso y altura
peso = float(input("Ingrese su peso (kg): "))
altura = float(input("Ingrese su altura (m): "))

# Calcular el Índice de Masa Corporal (IMC)
imc = peso / (altura * altura)

# Determinar la categoría del IMC
if imc < 18.5:
    print("Bajo de peso")
elif 18.5 <= imc < 25:
    print("Peso normal")
elif 25 <= imc < 30:
    print("Sobrepeso")
else:
    print("Obesidad")
