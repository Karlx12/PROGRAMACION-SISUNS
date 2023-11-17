# Solicitar al usuario ingresar su edad
edad = int(input("Ingrese su edad: "))

# Determinar en qué rango se encuentra
if 0 <= edad <= 12:
    print("Niño")
elif 13 <= edad <= 17:
    print("Adolescente")
elif 18 <= edad <= 64:
    print("Adulto")
else:
    print("Adulto Mayor")
