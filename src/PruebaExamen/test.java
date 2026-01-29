package PruebaExamen;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para las cadenas
        String frase;
        String buscar;
        String sustituto;

        // 1. Pedir los datos al usuario
        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();

        System.out.println("¿Qué texto quieres buscar (quitar)? ");
        buscar = sc.nextLine();

        System.out.println("¿Por qué texto lo quieres sustituir (poner)? ");
        sustituto = sc.nextLine();

        // Usamos StringBuffer para construir el resultado eficientemente
        StringBuffer resultado = new StringBuffer();

        int lenF = frase.length();   // Longitud de la frase
        int lenB = buscar.length();  // Longitud de lo que buscamos

        // 2. Recorremos la frase original
        for (int i = 0; i < lenF; i++) {

            boolean hayMatch = true; // Suponemos que hay coincidencia

            // VERIFICACIÓN:
            // Primero: ¿Quedan suficientes letras para que quepa la palabra buscada?
            if (i + lenB > lenF) {
                hayMatch = false;
            } else {
                // Segundo: Comprobamos letra por letra si coincide
                for (int j = 0; j < lenB; j++) {
                    // Comparamos la letra de la frase (i + j) con la de búsqueda (j)
                    if (frase.charAt(i + j) != buscar.charAt(j)) {
                        hayMatch = false;
                        break; // Si una falla, ya no es igual
                    }
                }
            }

            // ACCIÓN:
            if (hayMatch) {
                // CASO 1: Encontramos la palabra 'buscar'
                // En lugar de copiar la original, añadimos la 'sustituto' al resultado
                resultado.append(sustituto);

                // IMPORTANTE: Saltamos los caracteres que ya hemos sustituido
                // Restamos 1 porque el bucle for hará i++ al final
                i += lenB - 1;

            } else {
                // CASO 2: No hay coincidencia
                // Simplemente copiamos la letra original al resultado
                resultado.append(frase.charAt(i));
            }
        }

        // 3. Mostrar el resultado final
        System.out.println("\n--- Resultado ---");
        System.out.println(resultado.toString());

        // 7. إغلاق كائن Scanner
        sc.close();
    }
}
