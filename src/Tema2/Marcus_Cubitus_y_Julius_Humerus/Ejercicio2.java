package Tema2.PRACTICA_DE_CLASE_2024_2025.Marcus_Cubitus_y_Julius_Humerus;
import java.util.Scanner;

public class Ejercicio2 {
    public static int aleatorio(int max, int min) {
        return (int) ((Math.random() * max - min + 1) + min);
    }

    public static int min(int n1, int n2, int n3, int n4, int n5) {
        return Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)),n5);
    }
    public static int max(int n1, int n2, int n3, int n4, int n5) {
        return Math.max(Math.max(Math.max(n1, n2), Math.max(n3, n4)),n5);
    }

    public static int calcularPuntuacion(){
        int total = 0;
        int dado1,dado2,dado3,dado4,dado5;

        dado1 = aleatorio(6, 1);
        dado2 = aleatorio(6, 2);
        dado3 = aleatorio(6, 3);
        dado4 = aleatorio(6, 4);
        dado5 = aleatorio(6, 5);

        int min = min(dado1,dado2,dado3,dado4,dado5);
        int max = max(dado1,dado2,dado3,dado4,dado5);

        if(dado1 != max && dado1 != min){
            total = total + dado1;
        }
        if(dado2 != max && dado2 != min){
            total = total + dado2;
        }
        if(dado3 != max && dado3 != min){
            total = total + dado3;
        }
        if(dado4 != max && dado4 != min){
            total = total + dado4;
        }
        if(dado5 != max && dado5 != min){
            total = total + dado5;
        }
        System.out.println("------------------------");
        System.out.println("d1: "+dado1+" D2: "+dado2+" D3: "+dado3+" D4: "+dado4+" D5: "+dado5);
        System.out.println("Min : "+min+" Max : "+max);

        return total;
    }
    public static void main(String[] args) {
        /*
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen
        en sus ratos libres jugando a juegos de dados, el pasatiempo favorito de
        los antiguos romanos. Un juego que pudieron haber jugado estos amigos
        consiste en tirar cada jugador cinco dados. La puntuación es la suma total
        de puntos, sin contar los valores que coincidan con el mínimo o el máximo
        obtenido. El jugador que saca más puntos gana la partida. Escriba un programa
        que simule varias partidas seguidas de este juego de dados
         */
        int ronda;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de ronda: ");
        ronda = Sc.nextInt();
        int ganaRondaMarcus = 0, ganaRondaJulius = 0;

        int tiradaMarcus, tiradaJulius;


        for (int i = 0; i < ronda; i++) {
            tiradaJulius = calcularPuntuacion();
            tiradaMarcus = calcularPuntuacion();
            System.out.println("------------------------");
            System.out.println("tirada Marcus: " + tiradaMarcus);
            System.out.println("tirada Julius: " + tiradaJulius);
            
            if (tiradaMarcus > tiradaJulius) {
                ganaRondaMarcus++;
            } else if (tiradaJulius > tiradaMarcus) {
                ganaRondaJulius++;
            }else {
                System.out.println("------------------------");
                System.out.println("Empate");
            }

        }
        System.out.println("------------------------");
        System.out.println("Ganada en Ronda de Marcus: " + ganaRondaMarcus);
        System.out.println("Ganada en Ronda de Julius: " + ganaRondaJulius);

        if (ganaRondaMarcus > ganaRondaJulius) {
            System.out.println("------------------------");
            System.out.println("Marcus es Gana en este Rondas: "+ ronda);
        } else if (ganaRondaMarcus < ganaRondaJulius) {
            System.out.println("------------------------");
            System.out.println("Julius es Gana en este Rondas: "+ ronda);
        }else {
            System.out.println("------------------------");
            System.out.println("Empate");
        }

    }
}
