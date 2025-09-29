public class EjercicioOperadoresLogicos {
    public static void main(String[] args) {

        final int numClasesAnio = 120;
        int numClasesAsiste = 101;
        int praticasEntregadas= 4;
        boolean autorizacionEspicial = false;
        boolean presentarElExamenFinal;
        int numClasesAnio1;

        // condicion para presentarse a examen finall
        // asistido al menos al 80% de las clases y ha entregado más de 3 practicas
        // O tiene una autorozacion espicail para presentarse

        // escribe la expresion logical , piensa el resultado , e imprimelo

        numClasesAnio1 = (80 * numClasesAnio) / 100;

        presentarElExamenFinal = (numClasesAsiste >= numClasesAnio1 && praticasEntregadas > 3) || autorizacionEspicial;

        System.out.println("Puede presentarse al examen final : " + presentarElExamenFinal);

    }
}
