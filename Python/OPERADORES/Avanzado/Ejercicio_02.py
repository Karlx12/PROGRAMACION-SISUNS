# Número de Árboles a Sembrar
metrosCuadradosPino = 10
metrosCuadradosEucalipto = 15
metrosCuadradosPalmera = 18

arbolesPorHectareaPino = 8
arbolesPorHectareaEucalipto = 15
arbolesPorHectareaPalmera = 10

hectareasDisponibles = 7

pinos = hectareasDisponibles * arbolesPorHectareaPino
eucaliptos = hectareasDisponibles * arbolesPorHectareaEucalipto
palmeras = hectareasDisponibles * arbolesPorHectareaPalmera

print(f"Número de pinos a sembrar: {pinos}")
print(f"Número de eucaliptos a sembrar: {eucaliptos}")
print(f"Número de palmeras a sembrar: {palmeras}")
