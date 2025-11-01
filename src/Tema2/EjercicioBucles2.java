package Tema2;

public class EjercicioBucles2 {
    public static void main(String[] args) {

        // lenza dos dados (1-6) mientras sean diferents..
        // cuenta les veces que has tenido que tirar  los dados hasta que han salido iguales

        int terada1, terada2;
        int contador = 0;

        do {
            terada1 = (int) (Math.random()*(6 -1 +1) +1);
            terada2 = (int) (Math.random()*(6 -1 +1) +1);
            System.out.println("Terada: " + terada1 + " Y " + terada2);

            contador++;
        }while (terada1 != terada2);

        System.out.println("contador : " + contador);



    }
}
