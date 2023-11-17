# Inicialización de variables
usuario = "usuario123"
contraseña = "contraseña456"
intentos = 0

# Ciclo Mientras para intentos de inicio de sesión
while intentos < 3:
    # Solicitar al usuario ingresar credenciales
    usuario_ingresado = input("Ingrese el nombre de usuario: ")
    contraseña_ingresada = input("Ingrese la contraseña: ")

    # Verificar credenciales
    if usuario_ingresado == usuario and contraseña_ingresada == contraseña:
        print("Inicio de sesión exitoso. Bienvenido, ", usuario)
        break  # Salir del ciclo si las credenciales son correctas
    else:
        print(f"Credenciales incorrectas. Intento {intentos + 1} de 3")
        intentos += 1

# Bloquear el programa después de 3 intentos fallidos
if intentos == 3:
    print("Demasiados intentos fallidos. El programa se ha bloqueado.")
