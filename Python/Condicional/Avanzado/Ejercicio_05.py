# Leer el consumo mensual en minutos
consumo_mensual = int(input("Ingrese el consumo mensual en minutos: "))

# Inicializar variables de precios y descuento
precio_normal = 0.03
precio_descuento = 0.02
descuento_porcentaje = 1.25

# Calcular el costo según la política de la empresa
if consumo_mensual > 800:
    # Calcular el costo para los primeros 300 minutos a precio normal
    costo_primeros_300 = 300 * precio_normal

    # Calcular el costo para los siguientes minutos a precio de descuento
    costo_restantes = (consumo_mensual - 300) * precio_descuento

    # Calcular el descuento
    descuento = (costo_primeros_300 + costo_restantes) * (descuento_porcentaje / 100)

    # Calcular el costo final con descuento
    costo_total = costo_primeros_300 + costo_restantes - descuento
elif consumo_mensual > 500:
    # Calcular el costo para los primeros 300 minutos a precio normal
    costo_primeros_300 = 300 * precio_normal

    # Calcular el costo para los siguientes minutos a precio de descuento
    costo_restantes = (consumo_mensual - 300) * precio_descuento

    # Calcular el costo total sin descuento
    costo_total = costo_primeros_300 + costo_restantes
elif consumo_mensual > 300:
    # Calcular el costo para todos los minutos a precio normal
    costo_total = consumo_mensual * precio_normal
else:
    # Calcular el costo para todos los minutos a precio normal
    costo_total = consumo_mensual * precio_normal

# Mostrar el costo total
print("El costo total es:", costo_total)
