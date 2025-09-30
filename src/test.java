import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(">>> حساب الدرجة النهائية <<<");

        // 1. إدخال الدرجات الجزئية الثلاثة (Partial Grades)
        System.out.print("أدخل الدرجة الجزئية الأولى (P1): ");
        double p1 = s.nextDouble();
        System.out.print("أدخل الدرجة الجزئية الثانية (P2): ");
        double p2 = s.nextDouble();
        System.out.print("أدخل الدرجة الجزئية الثالثة (P3): ");
        double p3 = s.nextDouble();

        // 2. إدخال درجة الامتحان النهائي (Final Exam)
        System.out.print("أدخل درجة الامتحان النهائي (FE): ");
        double fe = s.nextDouble();

        // 3. إدخال درجة العمل النهائي (Final Project)
        System.out.print("أدخل درجة العمل النهائي (FP): ");
        double fp = s.nextDouble();

        s.close();

        // ======================================================
        // خطوة الحساب

        // أ. حساب المتوسط الحسابي للدرجات الجزئية (55% من المجموع)
        // يتم حساب المتوسط أولاً ثم ضربه في وزنه (0.55)
        double averagePartials = (p1 + p2 + p3) / 3.0;
        double partialWeight = averagePartials * 0.55;

        // ب. حساب وزن الامتحان النهائي (30% من المجموع)
        double finalExamWeight = fe * 0.30;

        // ج. حساب وزن العمل النهائي (15% من المجموع)
        double finalProjectWeight = fp * 0.15;

        // د. الدرجة النهائية = مجموع الأوزان الثلاثة
        double finalGrade = partialWeight + finalExamWeight + finalProjectWeight;

        // ======================================================
        // عرض النتيجة
        System.out.println("\n--- النتائج ---");
        System.out.printf("متوسط الدرجات الجزئية (P1, P2, P3): %.2f\n", averagePartials);
        System.out.printf("الدرجة النهائية للطالب هي: %.2f\n", finalGrade);
    }
}