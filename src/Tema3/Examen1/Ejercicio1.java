package Tema3.Examen1;

import java.util.Scanner;

public class Ejercicio1 {

    // Debes implementar ambos métodos: String encriptar(String texto) y String
    //desencriptar(String texto) .
    public static String encriptar(String texto){


        // Aqui ademas palabras de usuario en palabras
        StringBuffer palabras = new StringBuffer();
        // este profeso StringBuffer para volver resultado como este (Alpm Ovnpe)
        StringBuffer resresultado = new StringBuffer();
        char c;

        texto = texto + " ";

        int contador = 0;

        while (contador < texto.length()){

            // aquie coje uno letra por ejemplo : texto.charAt(contador) y contador = 1 ==> texto.charAt(1)
            // luego tengo palabra por ejemplo (mohamed)
            // texto.charAt(1) ==> laletra ( O )
            // final : c = texto.charAt(1) ==> c = 'o'
            c = texto.charAt(contador);

            // ahora problema de ecpacio el mejor usar if (c == ' ')

            if (c == ' ') {

                for (int i = 0; i < palabras.length(); i++) {
                    char letra = palabras.charAt(i); // letra

                    if (vocales(letra)) {
                        palabras.setCharAt(i, letra);
                    } else if ((letra >= 'a' && letra <= 'z') && !vocales(letra)) {
                        if (letra == 'z') {
                            palabras.setCharAt(i, 'b');
                        } else {
                            palabras.setCharAt(i, (char)(letra + 1));
                        }
                    }
                }

                Invierte(palabras);

                resresultado.append(palabras);

                // ademas espacio in StringBufer

                resresultado.append(" ");


            } else {
                palabras.append(c);
            }

            contador++;
        }

        if (resresultado.length() > 0) {
            resresultado.deleteCharAt(resresultado.length() - 1);
        }
        return resresultado.toString();
    }

    //Debes implementar ambos métodos: String encriptar(String texto) y String
    //desencriptar(String texto) .
    public static String desencriptar(String texto1){


        // Aqui ademas palabras de usuario en palabras
        StringBuffer palabras = new StringBuffer();
        // este profeso StringBuffer para volver resultado como este (Alpm Ovnpe)
        StringBuffer resresultado = new StringBuffer();
        char c;

        texto1 = texto1 + " ";

        int contador = 0;

        while (contador < texto1.length()){
            c = texto1.charAt(contador);

            if (c == ' ') {
                Invierte(palabras);

                for (int i = 0; i < palabras.length(); i++) {
                    char letra = palabras.charAt(i);

                    if (vocales(letra)) {
                        palabras.setCharAt(i, letra);
                    } else {

                        if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                            if (letra == 'b') {
                                palabras.setCharAt(i, 'z');
                            } else {
                                palabras.setCharAt(i, (char)(letra - 1));
                            }
                        }
                    }
                }

                resresultado.append(palabras);


                // ademas espacio in StringBufer
                resresultado.append(" ");


                palabras.delete(0, palabras.length());

            } else {
                palabras.append(c);
            }

            contador++;
        }



        if (resresultado.length() > 0) resresultado.deleteCharAt(resresultado.length() - 1);
        return resresultado.toString();
    }


    // Las vocales mayúsculas A, E, I, O, U pasan a minúsculas.
    // emportante usar metodo char para a cada letra
    public static boolean vocales(char letras) {
        if (letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u') {
            return true;
        } else if (letras == 'A' || letras == 'E' || letras == 'I' || letras == 'O' || letras == 'U') {
            return true;

        } else {
            return false;
        }
    }


    //
    public static void Invierte(StringBuffer palabras) {
        int palabras1 = palabras.length();
        // aqui quiero guardar la letra mayúscula en mayUscula
        char mayUscula;

        int contador = 0 ;

        while (contador < (palabras1 / 2)){
            mayUscula = palabras.charAt(contador);
            palabras.setCharAt(contador, palabras.charAt(palabras1 - 1 - contador));
            palabras.setCharAt(palabras1 - 1 - contador, mayUscula);
            contador++;

        }

    }


    static void main(String[] args) {
        /**
         * Ejercicio 1. Transformador de texto (3 puntos)
         * Desarrolla una clase TransformadorTexto con dos métodos estáticos:
         * 1.1 Método encriptar (1.75 puntos)
         * Recibe un texto y lo convierte según estas transformaciones, aplicándose en este orden:
         * Cambia todas las consonantes por su siguiente letra en el abecedario (z pasa a b).
         * Las vocales a, e, i, o, u pasan a mayúsculas.
         * Invierte el orden de las letras en cada palabra individual.
         * Por ejemplo:
         * Entrada: hola mundo
         * Salida: Alpm Ovnpe
         * 1.2 Método desencriptar (1.25 puntos)
         * Recibe un texto encriptado y realiza el proceso inverso para recuperar el texto original:
         * Invierte el orden de las letras en cada palabra.
         * Las vocales mayúsculas A, E, I, O, U pasan a minúsculas.
         * Cambia cada consonante por su letra anterior en el abecedario (b pasa a z).
         * Por ejemplo:
         * Entrada: Alpm Ovnpe
         * Salida: hola mundo
         * Indicaciones:
         * No se pueden usar estructuras dinámicas como ArrayList.
         * Usa preferentemente char[] o StringBuilder .
         * Debes implementar ambos métodos: String encriptar(String texto) y String
         * desencriptar(String texto) .
         * Programa principal debe demostrar que encriptar y luego desencriptar devuelve el texto
         * original.
         */
        Scanner sc = new Scanner(System.in);


        System.out.println("Pora Favo Dami Tu Frase Por Ejemplo (hola mundo): ");
        String Frase,encriptar,desencriptar;
        Frase = sc.nextLine();

        /**
         * // Aqui ademas palabras de usuario en palabras
         *         StringBuffer palabras = new StringBuffer();
         *         // este profeso StringBuffer para volver resultado como este (Alpm Ovnpe)
         *         StringBuffer resresultado = new StringBuffer();
         */



        encriptar = encriptar(Frase);
        System.out.println("Encriptado: " + encriptar);

        desencriptar = desencriptar(Frase);
        System.out.println("Desencriptado: " + desencriptar);




    }
}
