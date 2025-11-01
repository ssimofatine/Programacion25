package EjerciciosDeIntroducciónAlaProgramación1;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /**
         * Ejercicio 12
         * Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
         * d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
         * la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
         * determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
         */

        int v1, v2, d, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer v1 velocidades (Km/H): ");
        v1 = sc.nextInt();
        System.out.println("Ingrese el segundo v2 velocidades (Km/H): ");
        v2 = sc.nextInt();


        //t = d / (v1 + v2);   //d = (v1 + v2) * t;

        
    }
}
