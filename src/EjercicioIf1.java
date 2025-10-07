import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class EjercicioIf1 {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un crédito

        //1. Tienes más de 5 años de antigüedad en el banco e ingresos mensuales de más de
        // o más 2500€
        //2. Tienes una antigüedad entre 2 y 5 años, ingresos de más de 2000€ mensuales
        // y o tienes deudas pendientes
        //3. Tienes menos de 2 años de antigüedad, un ingreso de más de 3000€ mensuales
        // y no tienes deudas pendientes

        //V.E: antigüedad, ingresosMensuales, deudasPendientes
        //V.S: si eres elegible para que te den un crédito

        /**
         * //1. لديك خبرة في البنك لأكثر من 5 سنوات، ودخل شهري يزيد عن
         * // أو أكثر
         * //2. لديك خبرة تتراوح بين سنتين و5 سنوات، ودخل شهري يزيد عن 2000 يورو، ولا ديون مستحقة عليك
         * //3. لديك خبرة أقل من سنتين، ودخل شهري يزيد عن 3000 يورو، ولا ديون مستحقة عليك
         * //V.E: الأقدمية، الدخل الشهري، الديون المستحقة
         * //V.S: إذا كنت مؤهلاً للحصول على ائتمان
         */

        int antiguedad, ingresosMensuales ;
        char deudasPendientes1 ;
        boolean deudasPendientes = true;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Por favor Dime tú antigüedad: ");
        antiguedad = Sc.nextInt();
        System.out.println("---------------------------");

        System.out.println("Por Favor Dime tú ingresos Mensuales : ");
        ingresosMensuales = Sc.nextInt();
        System.out.println("-----------------------------");

        System.out.println("Por favor Dime tú deudas Pendientes Ejmplo (S o N): ");
        deudasPendientes1 = Sc.next().charAt(0);
        System.out.println("------------------------------");

        if ( deudasPendientes1 == 'n') {

            deudasPendientes = false;
        }

        if (antiguedad > 5 && ingresosMensuales >= 2500) {
            System.out.println("Usted califica para crédito");
        }else if((antiguedad == 2 || antiguedad >=5 ) && ingresosMensuales >= 2000 && deudasPendientes){
            System.out.println("Usted califica para crédito");
        } else if (antiguedad <= 2  && ingresosMensuales >= 3000 && deudasPendientes) {
            System.out.println("Usted califica para crédito");
        }else {
            System.out.println("No puedes coger califica para crédito");
        }


    }
}
