package PRACTICA_DE_CLASE.opcion_1;
import java.util.Scanner;
public class Ejercicio2 {
    public static int ordenador(int max , int min){
        return (int) ((Math.random()* max - min + 1) + min);
    }
    public static void main(String[] args) {
        /**
         * El Juego del Nim
         * Dos jugadores (el usuario y el ordenador) comienzan con 21 cerillas. Por turnos, cada jugador
         * retira entre 1 y 3 cerillas. El jugador que retire la última cerilla pierde la partida.
         * Escribe un programa que:
         * – Permita al usuario elegir cuántas cerillas quiere retirar (validando que sea entre 1 y 3)
         * – El ordenador retire aleatoriamente entre 1 y 3 cerillas
         * – Muestre el estado del juego después de cada turno
         * – Indique quién ha ganado al finalizar
         */
        Scanner sc = new Scanner(System.in);
        int total = 21;


        boolean salir = true;




        int totalU1=0;
        int totalO2 = 0;

        while (total >= 0){
            System.out.println("porfa dime tu numero para cuántas cerillas quiere retirar (validando que sea entre 1 y 3) : ");
            int usuario = sc.nextInt();
            while (salir){
                if (usuario >= 1 && usuario <= 3) {
                    salir = false;
                }else {
                    System.out.println("eroor : porfa escribe validando que sea entre 1 y 3");
                }
            }



            if (total > 0) {
                total = total - usuario;
                totalU1 += usuario;
                System.out.println("----- ");
                System.out.println("ahora total es :"+total + " total usuario es : " + totalU1);



            }else {
                break;
            }
            
            if(total > 0){
            total = total - ordenador(3, 1);
            if (total > 0){
                totalO2 += ordenador(3, 1);
                System.out.println("----- ");
                System.out.println("ahora total es :"+total + " total ordenador es : " + totalO2);
            }else {
                break;
            }
            }else {
                break;
            }
            
            
        }   

        if (totalO2 > totalU1) {
            System.out.println("ordenadoe es gana : "+ totalO2);
        }else {
            System.out.println("Usuario es gana : "+ totalU1);
        }





    }
}
