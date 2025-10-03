package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio6 {
    public static void main(String[] args) {

        //6. ¿Qué muestra por pantalla el siguiente programa?

        System.out.println("Hola usuario."+" Bienvenido."); // pintar a pantalla : Hola usuario. Bienvenido.
        String dia = "Lunes"; // guardar en memoria Lunes (String)
        System.out.println("Hoy es " + dia); // pintar en pantalla : Hoy es Lunes
        int hora = 12; // guardar en memoria numero 12 (Int)
        System.out.println("Son las " + hora + " en punto."); // pintar en pantalla : Son las 12 en punto.
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto"); // pintar en pantalla : Dentro de 2 horas serán las  12 2 en punto
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto"); // pintar en pantalla : Dentro de 2 horas serán las  14 en punto


    }
}
