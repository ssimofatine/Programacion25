package PRACTICA_DE_CLASE.opcion_1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void menu (){
        System.out.println("--------menu--------");
        System.out.println("1. Mostrar la tabla de multiplicar de ese número (del 1 al 10)");
        System.out.println("2. Calcular el factorial del número");
        System.out.println("3. Mostrar todos los divisores del número");
        System.out.println("4. Salir");
    }

    public static void swichMenu(int opcion, int num){
        boolean salir = true;

        while (salir){
            switch (opcion) {
                case 1:
                    for (int i = 1; i <= 10 ; i++) {
                        int num1;
                        num1 = i * num;
                        System.out.println("-------------");
                        System.out.println(i + " * " + num + " = " + num1);
                    }
                    break;
                case 2:
                    int multiplicar =1;
                    for (int i = num; i >= 1 ; i--) {
                        multiplicar *= num;
                        System.out.println("--------------");
                        System.out.println("multiplicar factorial : " + multiplicar);
                    }
                    System.out.println("--------------");
                    System.out.println("Calcular el factorial del número : "+ multiplicar);
                    break;
                case 3:

                    int contador =0;
                    for (int i = 2; i <= 9 ; i++) {
                        if (num % i == 0) {
                            System.out.println("tu numero " + num + " es division por " + i);
                        }else {
                            System.out.println("tu numero " + num + " No division por " + i);

                        }
                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    salir = false;
                    break;
                default:
                    System.out.println("opción no valida (Error)");
            }
        }
    }


    public static void main(String[] args) {
        /**
         *  * Calculadora de Propiedades Numéricas
         * Realiza un programa que pida un número entero positivo por teclado. Luego muestra un menú
         * con las siguientes opciones:
         * 1. Mostrar la tabla de multiplicar de ese número (del 1 al 10)
         * 2. Calcular el factorial del número
         * 3. Mostrar todos los divisores del número
         * 4. Salir
         * Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
         * devuelva el resultado o lo muestre directamente.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("porfa introduce tu numero entero positivo: ");

        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("perfecto tu numero entero es positivo");
        }else {
            System.out.println("tu numero entero no positivo");
        }

        menu();

        System.out.println("selecion un opcion");

        int opcion = scanner.nextInt();

        swichMenu(opcion, num);






    }
}
