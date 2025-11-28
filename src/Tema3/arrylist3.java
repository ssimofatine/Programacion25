package Tema3;

public class arrylist3 {
    public static double[] SimoHaji(double[] simoo, double simo){

        double[] simoo1 = new double[simoo.length];

        for (int i = 0; i < simoo.length ; i++) {
            simoo1[i] = simoo[i] * simo;
        }

        return simoo1;
    }

    public static void imprimirArray(double [] nuevoVector) {
        for (int i = 0; i < nuevoVector.length; i++) {
            System.out.println(nuevoVector[i]);
        }
    }

    static void main(String[] args) {

        double[] simoo = {33.5, 35.9, 30.1, 28.7, 29.9, 30.0};
        double[] nuevoVector = SimoHaji(simoo, 4);
        imprimirArray(nuevoVector);


    }
}
