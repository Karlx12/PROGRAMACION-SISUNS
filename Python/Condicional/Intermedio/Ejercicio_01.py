# 1. Establecemos el año como un entero
year = int(input("Ingrese un año: "))

# 2. Los años bisiestos se dan cada 4 años
#    por lo tanto, si el año tiene una división exacta entre 4, entonces es bisiesto
if year % 4 == 0:
    # 3. Imprimimos el resultado
    print("Es un año bisiesto")
else:
    print("No es un año bisiesto")
