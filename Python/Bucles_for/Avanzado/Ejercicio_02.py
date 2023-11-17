# Inicialización del diccionario Morse
diccionario_morse = {
    'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.', 'H': '....',
    'I': '..', 'J': '.---', 'K': '-.-', 'L': '.-..', 'M': '--', 'N': '-.', 'O': '---', 'P': '.--.',
    'Q': '--.-', 'R': '.-.', 'S': '...', 'T': '-', 'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-',
    'Y': '-.--', 'Z': '--..',
    '0': '-----', '1': '.----', '2': '..---', '3': '...--', '4': '....-', '5': '.....',
    '6': '-....', '7': '--...', '8': '---..', '9': '----.'
}

# Lectura de la palabra desde la entrada estándar
palabra = input("Ingrese la palabra a convertir a código Morse: ").upper()

# Convertir cada caracter de la palabra a código Morse
palabra_morse = ''
for caracter in palabra:
    if caracter.isalnum() and caracter in diccionario_morse:
        morse_caracter = diccionario_morse[caracter]
        palabra_morse += morse_caracter + ' '

# Mostrar el resultado
print(f"La palabra '{palabra}' en código Morse es: {palabra_morse}")
