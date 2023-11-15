# Guardamos la secuencia de ADN en una variable
secuenciaADN = "ATGCTAAGGTTCACGG"

# Calculamos la longitud de la cadena
longitudSADN = len(secuenciaADN)

# Inicializar contadores para cada letra
adenina = 0
citosina = 0
guanina = 0
timina = 0

# Iterar a través de cada letra de la secuencia de ADN
for i in range(longitudSADN):
    # Obtener cada carácter en orden
    letra = secuenciaADN[i]

    # Utilizar un switch para determinar la letra y aumentar el contador correspondiente
    if letra == "A":
        adenina += 1
    elif letra == "C":
        citosina += 1
    elif letra == "G":
        guanina += 1
    elif letra == "T":
        timina += 1

# Mostrar los resultados
print("Adenina (A):", adenina)
print("Citosina (C):", citosina)
print("Guanina (G):", guanina)
print("Timina (T):", timina)
