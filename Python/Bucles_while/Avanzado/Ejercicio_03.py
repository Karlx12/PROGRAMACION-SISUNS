# Lectura de los números a multiplicar desde la entrada estándar
multiplicando = int(input("Ingrese el multiplicando: "))
multiplicador = int(input("Ingrese el multiplicador: "))

# Inicialización de variables
resultado = 0

# Aplicar el algoritmo de la multiplicación rusa
while multiplicando > 0:
    # Si el multiplicando es impar, sumar al resultado el multiplicador
    if multiplicando % 2 != 0:
        resultado += multiplicador
    # Dividir el multiplicando por 2 y multiplicar el multiplicador por 2
    multiplicando //= 2
    multiplicador *= 2

# Mostrar el resultado de la multiplicación
print("El resultado de la multiplicación es:", resultado)
