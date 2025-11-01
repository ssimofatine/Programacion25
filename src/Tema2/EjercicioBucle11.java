package Tema2;

public class EjercicioBucle11 {
    public static void main(String[] args) {
        //Hay dos romanos Cubitus y Humerus en la frontera germana aburridos
        //Juegan a los dados y se determina quien gana.
        //Cada jugador tiene 2 dados de seis caras
        //Gana el jugador que sume más sus dos dados
        //Juegan 10 rondas
        //Quién gana más rondas?

        //V.E.: tiradaC1, tiradaC2, tiradaH1, tiradaH2
        //      sumaC, sumaH
        //      contRondasGC, contRondasGH


        int tiradaC1, tiradaC2, tiradaH1, tiradaH2;

        int sumaC = 0, sumaH = 0;

        int  contRondasGC = 0, contRondasGH = 0;

        for (int i = 1; i <= 10 ; i++) {



            for (int j = 1; j <= 4 ; j++) {
                tiradaC1 = (int) (Math.random()*(6 -1 + 1) + 1);
                tiradaC2 = (int) (Math.random()*(6 -1 + 1) + 1);
                tiradaH1 = (int) (Math.random()*(6 -1 + 1) + 1);
                tiradaH2 = (int) (Math.random()*(6 -1 + 1) + 1);

                contRondasGC = tiradaC1 + tiradaC2;
                contRondasGH = tiradaH1 + tiradaH2;
                System.out.println("----------");
                System.out.println("Total Cubitus:  " + contRondasGC);
                System.out.println("Total Humerus:  " + contRondasGH);
                if ( contRondasGC > contRondasGH){
                    System.out.println("Cubitus gana");
                    sumaC++;
                }else {
                    System.out.println("Humerus gana");
                    sumaH++;
                }


            }



        }

        System.out.println("------------------------------");
        System.out.println("final jeugo :");
        if (sumaC > sumaH){
            System.out.println("Cubitus gana "+ sumaC);
        }else {
            System.out.println("Humerus gana "+ sumaC);
        }


    }
}
