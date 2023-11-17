# Solicitar al usuario ingresar su edad y el precio de un producto
edad = int(input("Ingrese su edad: "))
precio = float(input("Ingrese el precio del producto: "))

# Aplicar un descuento del 20% si es menor de 18 años
if edad < 18:
    precio_con_descuento = precio * 0.8
    print("Precio con descuento:", precio_con_descuento)
else:
    print("Precio sin descuento:", precio)
