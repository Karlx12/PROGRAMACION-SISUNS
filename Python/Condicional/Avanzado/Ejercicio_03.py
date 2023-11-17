# Leer tres números enteros
num1 = int(input("Ingrese el primer número entero: "))
num2 = int(input("Ingrese el segundo número entero: "))
num3 = int(input("Ingrese el tercer número entero: "))

# Verificar cuál es el número intermedio
if (num1 >= num2 and num1 <= num3) or (num1 <= num2 and num1 >= num3):
    print("El número intermedio es:", num1)
elif (num2 >= num1 and num2 <= num3) or (num2 <= num1 and num2 >= num3):
    print("El número intermedio es:", num2)
else:
    print("El número intermedio es:", num3)
