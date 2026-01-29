package PruebaExamen;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio2 {

    public static int genrealAleatorio(int max, int min) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }

    public static int[] cadenaGeneral(int cadena) {
        int [] array = new int[cadena];
        for (int i = 0; i < array.length; i++) {
            array[i] = genrealAleatorio(array.length, 1);
        }
        return array;
    }

    public static int[] AdivinaUsuario(int cadena) {
        Scanner sc = new Scanner(System.in);
        int num;
        int [] array1 = new int[cadena];
        for (int i = 0; i < cadena; i++){
            System.out.println("Introduzca un numero: ");
            num = Integer.parseInt(sc.nextLine());
            array1[i] = num;
        }
        return array1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int correcta = 0;
        int NoCorrecta = 0;

        do {
            System.out.println("1. nueva partida ");
            System.out.println("2. cerrar juego ");
            System.out.println("por favor seleccione una opcion de 1 a 2: ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("porfa dami numero de la cadena de 2 a 9 cifras) ");
                    int cadena = Integer.parseInt(sc.nextLine());
                    int[] cadenaGeneral1 = cadenaGeneral(cadena);
                    System.out.println(Arrays.toString(cadenaGeneral1));

                    int[] pruebaCorrecta = new int[cadenaGeneral1.length];
                    boolean correcto = true;
                    while (correcto){
                        System.out.println("---------------------------------------");
                        System.out.println("Adivina los números en la cadena de " + cadena);
                        int[] AdivinaUsuario1 = AdivinaUsuario(cadena);
                        System.out.println("---------------------------------------");
                        System.out.println("Ahora tu tiene Cadena pero todos solo tiene cero como este ([0,0,0,0,0])");
                        System.out.println(Arrays.toString(pruebaCorrecta));
                        for (int i = 0; i < cadenaGeneral1.length; i++) {

                            if (AdivinaUsuario1[i] == cadenaGeneral1[i]) {
                                pruebaCorrecta[i] = AdivinaUsuario1[i];
                                System.out.println("tu numero ( " + AdivinaUsuario1[i] +" ) es correcta : " + cadenaGeneral1[i]);
                                correcta++;
                                System.out.println("ahora tu tiene total del correcta es : " + correcta);
                            }else {

                                System.out.println("tu numero ( " + AdivinaUsuario1[i] +" ) es No correcta ");
                                NoCorrecta++;
                                System.out.println("ahora tu tiene total de No correcta es : " + NoCorrecta);
                            }

                        }

                        System.out.println("---------------------------------------------------------");
                        System.out.println("Recuerda los números correctamente para poder usarlos.");
                        System.out.println("números que suman cero son los que debemos adivinar de nuevo");
                        System.out.println(Arrays.toString(pruebaCorrecta));


                        boolean ganador = true;

                        System.out.println("-------------------------------------------");
                        for (int i = 0; i < cadenaGeneral1.length; i++) {
                            if (pruebaCorrecta[i] != cadenaGeneral1[i]) {
                                ganador = false;
                                break;
                            }
                        }

                        if (ganador) {

                            System.out.println("==========Bien Bien Bien=============");
                            System.out.println("Perfecto Juego terminado tu ganas");
                            System.out.println("==========HenoraBuena=============");
                            correcto = false;
                        }else{
                            int opcion1 = 2;
                            while (opcion1 != 1 && opcion1 != 0) {
                                System.out.println("---------------------------------------------------------");
                                System.out.println("1. Quieres rendirte escribe numero cero (0)");
                                System.out.println("2. Quieres continua escribe numero uno (1)");
                                opcion1 = Integer.parseInt(sc.nextLine());
                                switch (opcion1) {
                                    case 0:
                                        System.out.println("vale Gracias");
                                        correcto = false;
                                        break;
                                    case 1:
                                        System.out.println("vale perfecto");
                                        break;
                                    default:
                                        System.out.println("opcion no valido: ");
                                        break;
                                }
                            }
                        }

                    }

                    break;
                case 0,2:
                    System.out.println("Adios, un saludo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("-----------------------------");
                    break;
            }

        }while (opcion != 0 && opcion != 2);


    }
}
