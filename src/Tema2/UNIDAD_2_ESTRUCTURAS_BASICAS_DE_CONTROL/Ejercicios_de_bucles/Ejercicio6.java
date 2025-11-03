package Tema2.UNIDAD_2_ESTRUCTURAS_BASICAS_DE_CONTROL.Ejercicios_de_bucles;

public class Ejercicio6 {
	
	 /*Programa que sume los 100 primeros números enteros impares. */	

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 100; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los números impares del 1 al 100 es: " + suma);
    }
}
