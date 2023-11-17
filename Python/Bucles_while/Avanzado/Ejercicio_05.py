# Inicialización de variables
opciones = ["Piedra", "Papel", "Tijeras"]
victorias = 0
derrotas = 0

# Ciclo Mientras para jugar múltiples rondas
while True:
    # Mostrar opciones al usuario
    print("Opciones: 1. Piedra, 2. Papel, 3. Tijeras, 0. Salir")
    print(f"Victorias: {victorias} Derrotas: {derrotas}")

    # Solicitar al usuario elegir una opción
    eleccion_usuario = input("Elige una opción (1-3): ")

    # Salir del juego si el usuario elige la opción 0
    if eleccion_usuario == "0":
        print("Fin del juego. Gracias por jugar.")
        break

    # Generar elección para la computadora (alternando entre las opciones)
    indice_computadora = (int(eleccion_usuario) % 3) + 1
    eleccion_computadora = opciones[indice_computadora - 1]

    # Mostrar las elecciones del usuario y la computadora
    print(f"Tu elección: {opciones[int(eleccion_usuario) - 1]}")
    print(f"Elección de la computadora: {eleccion_computadora}")

    # Determinar el ganador de la ronda
    if eleccion_usuario == eleccion_computadora:
        print("Empate en esta ronda.")
    else:
        if (eleccion_usuario == "1" and eleccion_computadora == "3") or \
           (eleccion_usuario == "2" and eleccion_computadora == "1") or \
           (eleccion_usuario == "3" and eleccion_computadora == "2"):
            print("¡Ganaste esta ronda!")
            victorias += 1
        else:
            print("¡Perdiste esta ronda!")
            derrotas += 1
