package Tema3.Examen1;

public class test3 {
    final static int MAX_T = 200;
    final static int CARAS = 8;

    public static int gen() {
        return (int) (Math.random() * CARAS) + 1;
    }

    public static double porPC(int[] a) {
        int c = 0;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                c++;
            }
        }

        return ((double) c / (a.length - 1)) * 100;
    }

    public static int[] carasNS(int[] a) {

        int[] cont = new int[CARAS + 1];

        for (int i = 0; i < a.length; i++) {
            cont[a[i]]++;
        }

        int nS = 0;
        for (int i = 1; i <= CARAS; i++) {
            if (cont[i] == 0) {
                nS++;
            }
        }

        int[] r = new int[nS]; // r: resultado
        int j = 0;

        for (int i = 1; i <= CARAS; i++) {
            if (cont[i] == 0) {
                r[j] = i;
                j++;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        int[] a = new int[MAX_T];

        int[] cont = new int[CARAS + 1];

        double s = 0;
        double med;

        for (int i = 0; i < MAX_T; i++) {
            int num = gen();
            a[i] = num;
            cont[num]++;
            s += num;
        }

        int maxV = 0;

        System.out.println("--- التكرارات ---");
        for (int i = 1; i <= CARAS; i++) {
            System.out.println("الوجه " + i + ": " + cont[i] + " مرات.");
            if (cont[i] > maxV) {
                maxV = cont[i];
            }
        }

        System.out.println("\n--- الوجه الأكثر تكراراً ---");
        for (int i = 1; i <= CARAS; i++) {
            if (cont[i] == maxV) {
                System.out.println("الوجه " + i + " تكرر " + maxV + " مرات.");
            }
        }

        med = s / MAX_T;
        System.out.println("\n--- الإحصائيات العامة ---");
        System.out.printf("المتوسط الحسابي للنتائج: %.2f\n", med);

        double pC = porPC(a);
        System.out.printf("نسبة الأزواج المتتالية المتشابهة: %.2f%%\n", pC);

        int[] nS = carasNS(a);

        System.out.print("الأوجه التي لم تظهر: [");
        for (int i = 0; i < nS.length; i++) {
            System.out.print(nS[i] + (i < nS.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
