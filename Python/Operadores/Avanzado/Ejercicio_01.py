# Hora de Llegada a la Ciudad B
HH = int(input("Ingrese la hora de partida (HH): "))
MM = int(input("Ingrese los minutos de partida (MM): "))
SS = int(input("Ingrese los segundos de partida (SS): "))
tiempoViaje = int(input("Ingrese el tiempo de viaje en segundos: "))

# Convertir la hora de partida a segundos
tiempoPartida = HH * 3600 + MM * 60 + SS

# Calcular la hora de llegada en segundos
tiempoLlegada = tiempoPartida + tiempoViaje

# Convertir la hora de llegada a formato HH:MM:SS
HH_llegada = tiempoLlegada // 3600
MM_llegada = (tiempoLlegada % 3600) // 60
SS_llegada = tiempoLlegada % 60

# Mostrar la hora de llegada
print(f"Hora de llegada: {HH_llegada:02}:{MM_llegada:02}:{SS_llegada:02}")
