package Tema2.PRÁCTICA_DE_CLASE_2024_2025;
import java.util.Scanner;
public class Ejercicio_1 {
    public static void Menu() {

        System.out.println("1. Muestra la suma de cada uno de sus dígitos");
        System.out.println("2. Que diga si es primo o no");
        System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
        System.out.println("4. Salir");

    }

    public static void Switch(int n, int m) {
        int suma = 0;
        int total2 = m; // copiado M
        String cadena;
        boolean primo = true;
        switch (n){
            case 1:
                cadena = String.valueOf(m);
                for (int i = 0; i < cadena.length(); i++) {
                    int total = total2 % 10;
                    suma += total;
                    total2 = total2 / 10;

                }

                System.out.println("total de sus dígitos " + m + " es: " + suma);
                break;
            case 2:
                for (int i = 2; i <= m; i++) {
                    if (m % i == 0 && i != m) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println("tu numero " + m + " es primo :)");
                }else {
                    System.out.println("tu numero " + m + " no primo ");
                }

                break;
            case 3:
                System.out.println("Ingrese un numero");
                break;
            case 4:
                System.out.println("Adios ");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void main(String[] args) {
        /**
         * Menú
         * Realiza un programa que pida un número por teclado. Luego muestra un menú con las
         * siguientes opciones:
         * 1. Muestra la suma de cada uno de sus dígitos
         * 2. Que diga si es primo o no
         * 3. La longitud de una circunferencia cuyo radio fuera ese número
         * 4. Salir
         * Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
         * devuelva el resultado.
         */


        int numero, opcion;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduzca Dime tu numero por teclado: ");

        numero = Sc.nextInt();
        String nm = "simo";

        System.out.println(nm.length());



        do {
            System.out.println("------Menu------");
            Menu();
            System.out.println("Introduzca Opcion: ");
            opcion = Sc.nextInt();
            Switch(opcion,numero);
        }while (opcion != 4);

    }
}
