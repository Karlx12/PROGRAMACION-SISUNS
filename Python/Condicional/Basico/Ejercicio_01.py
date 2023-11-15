# 1. Declaramos una variable donde se almacenará el importe a pagar
monto_pago = float(input("Ingrese el monto a pagar: "))

# 2. Le expresamos la condición a cumplir
if monto_pago > 200:
    # 3. Si es verdadero, el montoPago se reducirá en un 20%
    monto_pago *= 0.8

# 4. Si no cumple la condición, entonces el montoPago no se ve afectado
print("El monto a pagar es:", monto_pago)
