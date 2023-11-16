package org.sisuns.bucles_for.avanzado;

public class Ejercicio_02 {
    public static void main(String[] args) {
        // Declaración de variables
        String palabra, palabraMorse = "";
        String morseCaracter;

        // Lectura de la palabra desde la entrada estándar
        System.out.print("Ingrese la palabra a convertir a código Morse: ");
        // Simulación de entrada de usuario
        palabra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Convertir cada caracter de la palabra a código Morse
        for (char caracter : palabra.toCharArray()) {
            // Lógica para obtener el código Morse de un caracter
            switch (caracter) {
                case 'A':
                    morseCaracter = ".-";
                    break;
                case 'B':
                    morseCaracter = "-...";
                    break;
                case 'C':
                    morseCaracter = "-.-.";
                    break;
                case 'D':
                    morseCaracter = "-..";
                    break;
                case 'E':
                    morseCaracter = ".";
                    break;
                case 'F':
                    morseCaracter = "..-.";
                    break;
                case 'G':
                    morseCaracter = "--.";
                    break;
                case 'H':
                    morseCaracter = "....";
                    break;
                case 'I':
                    morseCaracter = "..";
                    break;
                case 'J':
                    morseCaracter = ".---";
                    break;
                case 'K':
                    morseCaracter = "-.-";
                    break;
                case 'L':
                    morseCaracter = ".-..";
                    break;
                case 'M':
                    morseCaracter = "--";
                    break;
                case 'N':
                    morseCaracter = "-.";
                    break;
                case 'O':
                    morseCaracter = "---";
                    break;
                case 'P':
                    morseCaracter = ".--.";
                    break;
                case 'Q':
                    morseCaracter = "--.-";
                    break;
                case 'R':
                    morseCaracter = ".-.";
                    break;
                case 'S':
                    morseCaracter = "...";
                    break;
                case 'T':
                    morseCaracter = "-";
                    break;
                case 'U':
                    morseCaracter = "..-";
                    break;
                case 'V':
                    morseCaracter = "...-";
                    break;
                case 'W':
                    morseCaracter = ".--";
                    break;
                case 'X':
                    morseCaracter = "-..-";
                    break;
                case 'Y':
                    morseCaracter = "-.--";
                    break;
                case 'Z':
                    morseCaracter = "--..";
                    break;
                case '0':
                    morseCaracter = "-----";
                    break;
                case '1':
                    morseCaracter = ".----";
                    break;
                case '2':
                    morseCaracter = "..---";
                    break;
                case '3':
                    morseCaracter = "...--";
                    break;
                case '4':
                    morseCaracter = "....-";
                    break;
                case '5':
                    morseCaracter = ".....";
                    break;
                case '6':
                    morseCaracter = "-....";
                    break;
                case '7':
                    morseCaracter = "--...";
                    break;
                case '8':
                    morseCaracter = "---..";
                    break;
                case '9':
                    morseCaracter = "----.";
                    break;
                default:
                    morseCaracter = " "; // Espacio para caracteres no reconocidos
            }
            palabraMorse += morseCaracter + ' ';
        }

        // Mostrar el resultado
        System.out.println("La palabra '" + palabra + "' en código Morse es: " + palabraMorse);
    }
}
