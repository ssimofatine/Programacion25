package EjerciciosDeIntroducciónAlaProgramación;

public class Ejercicio16 {
    public static void main(String[] args) {
        /**
         *16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
         * que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
         * para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm.
         */

        // forma de calcular volumen es ===> volumen = area * altura
        // area ===> PI * diametro * diametro
        double diametro, area, altura, volumen, PI;
        diametro = 15.5;
        altura = 42.4;

        PI = Math.PI;
        area = PI * Math.pow(diametro, 2);
        System.out.println("el área de un cilindro: " + area);
        System.out.println("-----------------------");
        volumen = area * altura;
        System.out.println("el volumen de un cilindro: " + volumen);

    }

}
