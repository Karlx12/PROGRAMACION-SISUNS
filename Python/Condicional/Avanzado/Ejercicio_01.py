# 1. Al ser números, los definimos como enteros
dato = int(input("Ingrese un número: "))

# 2. Dato neutro: No es positivo ni negativo, cumpliendo el requisito solo el cero
if dato == 0:
    print("Es neutro")
else:
    # 3. Dato positivo o negativo
    if dato > 0:
        print("Es positivo")
    else:
        print("Es negativo")

# 4. Si existe división exacta (residuo de cero) entre 3 o 5 entonces es múltiplo de estos
if dato % 3 == 0 or dato % 5 == 0:
    print("El número es múltiplo de 3 o 5.")
else:
    print("El número no es múltiplo de 3 o 5.")
