package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_condicionales;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        /**
         * Programa que lea un número positivo de un dígito por teclado y diga en letra a qué dígito corresponde
         * (uno, dos, tres, cuatro, …). Ejemplo: si se introduce el 1, se mostrará por pantalla el “uno”; si se introduce
         * el 11, se mostrará el mensaje “Error: no es un número de un dígito”.
         */

        Scanner SC = new Scanner(System.in);
        System.out.println("porfa introduce el primer numero por Ejemplo (0, 1, 2, 3, 4, 5, 6, 7, 8, 9): ");
        int numero;
        String letra;


        numero = SC.nextInt();

        while (numero < 0 || numero >= 10) {
            if (numero >= 10) {
                System.out.println("Error: no es un número de un dígito");
            }
            if (numero < 0) {
                System.out.println("tu número no positivo porfa introduce numero positivo");
            }
            System.out.println("---------------------");
            System.out.println("porfa introduce el primer numero por Ejemplo (0, 1, 2, 3, 4, 5, 6, 7, 8, 9): ");
            numero = SC.nextInt();


        }

        for (int i = 0; i < 10; i++) {
            if (i == numero) {
                switch (numero) {
                    case 0:
                        letra = "Cero";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 1:
                        letra = "Uno";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 2:
                        letra = "Dos";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 3:
                        letra = "Tres";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 4:
                        letra = "Cuatro";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 5:
                        letra = "Cinco";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 6:
                        letra = "Seis";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 7:
                        letra = "Siete";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 8:
                        letra = "Ocho";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                    case 9:
                        letra = "Nueve";
                        System.out.println("Tu numero "+numero+" Como es: "+letra);
                        break;
                }
            }
        }


    }
}
