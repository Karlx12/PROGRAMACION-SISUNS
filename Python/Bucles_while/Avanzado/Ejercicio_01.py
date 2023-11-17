# Algoritmo dividirRestando
# Definir dividendo, divisor, cociente, residuo Como Entero

# Entrada de datos
dividendo = int(input("Ingrese el dividendo: "))

# Asegurarse de que el divisor sea mayor que 0
divisor = int(input("Ingrese el divisor (debe ser mayor que 0): "))
if divisor <= 0:
    print("El divisor no puede ser 0 o menor.")
else:
    # Inicializar el cociente y el residuo
    cociente = 0
    residuo = dividendo

    # Simular la división usando restas
    while residuo >= divisor:
        residuo = residuo - divisor
        cociente = cociente + 1

    # Mostrar resultados
    print("Cociente:", cociente)
    print("Residuo:", residuo)
