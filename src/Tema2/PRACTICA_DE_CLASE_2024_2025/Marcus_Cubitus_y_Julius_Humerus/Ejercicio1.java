package Tema2.PRACTICA_DE_CLASE_2024_2025.Marcus_Cubitus_y_Julius_Humerus;
import java.util.Scanner;
public class Ejercicio1 {
    public static int aleatorio(int max, int min){
        return (int) ((Math.random()*(max-min+1))+min);
    }
    public static int caluclar(int turno){
        int total = 0;
        int empate = 0;

        int dadoMarcus, dadoJulius;


        for (int i = 0; i < turno; i++) {
            dadoMarcus = aleatorio(6,1);
            dadoJulius = aleatorio(6,1);
            System.out.println("-----------------------");
            System.out.println("Dados de marcus: " + dadoMarcus + " Dados de julius: " + dadoJulius);
            if (dadoMarcus > dadoJulius) {
                total += dadoMarcus + dadoJulius + empate;
                System.out.println("-----------------------");
                System.out.println("gana los puntos de ambos dados : " + total + " marcus: " + total + " julius");
                System.out.println("Marcus es gana en este runda: "+ i );
                empate = 0 ;
            }else if (dadoMarcus < dadoJulius) {
                total += dadoMarcus + dadoJulius + empate;
                System.out.println("-----------------------");
                System.out.println("gana los puntos de ambos dados : " + total + " marcus: " + total + " julius");
                System.out.println("Julius es gana en este runda: "+ i );
                empate = 0 ;
            }else {
                if (i == (turno -1)){
                    break;
                }
                empate += dadoJulius + dadoMarcus;
                System.out.println("-----------------------");
                System.out.println("Empate");
            }
        }
        return total;

    }


    public static void main(String[] args) {

        /**
         * Marcus Cubitus y Julius Humerus son dos legionarios muy aficionados a los juegos de
         * dados y que aparecen a menudo en estos exámenes. Esta vez juegan a un juego en el
         * que primero se decide cuántos turnos se van a jugar. En cada turno, cada jugador tira
         * un dado. Si un jugador saca un valor mayor que el otro, gana los puntos de ambos
         * dados. Si los dos jugadores sacan el mismo valor, los puntos de ambos dados se
         * acumulan para el siguiente turno. Si en el último turno hay un empate, esos puntos se
         * pierden, porque la partida termina. Escriba un programa que muestre una partida de
         * este juego, detallando quién gana la partida, quién gana cada turno y la puntuación
         * acumulada por cada jugador tras cada turno.
         */

        Scanner sc = new Scanner(System.in);
        int turno;
        System.out.println("Introduzca el turno: ");
        turno = sc.nextInt();

        for (int i = 0; i < turno; i++) {
            int tiradaMarcus = caluclar(turno);
            int tiradaJulius = caluclar(turno);
            System.out.println("-----------------------");
            System.out.println(tiradaJulius+" "+tiradaMarcus);


        }

    }
}
