package Tema6.tradicir;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class arabic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "src/Tema6/tradicir/article.txt";
        String outputFilePath = "src/Tema6/tradicir/translated.txt";

        System.out.println("=== برنامج الترجمة المباشرة الأوفلاين (Helsinki-NLP) ===");
        System.out.println("تأكد من وضع النص داخل ملف باسم: " + inputFilePath + " في مجلد المشروع.");
        System.out.println("1. الترجمة من الإسبانية إلى العربية");
        System.out.println("2. الترجمة من العربية إلى الإسبانية");
        System.out.print("اختر الرقم: ");
        int choice = scanner.nextInt();

        String direction = "";
        if (choice == 1) direction = "es-ar";
        else if (choice == 2) direction = "ar-es";
        else {
            System.out.println("خيار غير صحيح.");
            return;
        }

        try {
            // قراءة النص بالكامل من الملف
            Path path = Paths.get(inputFilePath);
            if (!Files.exists(path)) {
                System.out.println("الملف " + inputFilePath + " غير موجود! يرجى إنشاؤه ووضع النص فيه.");
                return;
            }
            String fullText = Files.readString(path, StandardCharsets.UTF_8);

            System.out.println("جاري ترجمة المقال... يرجى الانتظار...");
            String translatedText = translateText(fullText, direction);

            // حفظ النتيجة في ملف جديد
            Files.writeString(Paths.get(outputFilePath), translatedText, StandardCharsets.UTF_8);
            System.out.println("تمت الترجمة بنجاح! تم حفظ النتيجة في ملف: " + outputFilePath);

        } catch (Exception e) {
            System.out.println("حدث خطأ أثناء المعالجة أو الاتصال بالخادم.");
            e.printStackTrace();
        }
    }

    public static String translateText(String text, String direction) throws IOException, InterruptedException {
        String[] lines = text.split("\n");
        StringBuilder finalTranslation = new StringBuilder();
        HttpClient client = HttpClient.newHttpClient();

        for (String line : lines) {
            if (line.trim().isEmpty()) {
                finalTranslation.append("\n");
                continue;
            }

            // تجهيز الطلب بصيغة JSON تناسب خادم بايثون الجديد
            String safeText = line.replace("\\", "\\\\").replace("\"", "\\\"");
            String jsonBody = "{"
                    + "\"text\": \"" + safeText + "\","
                    + "\"direction\": \"" + direction + "\""
                    + "}";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://127.0.0.1:5000/translate"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonBody, StandardCharsets.UTF_8))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String jsonResponse = response.body();

            // استخراج النص بطريقة مبسطة
            String searchKey = "\"translatedText\":\"";
            int startIndex = jsonResponse.indexOf(searchKey);
            if (startIndex != -1) {
                startIndex += searchKey.length();
                int endIndex = jsonResponse.lastIndexOf("\"");
                String translatedLine = jsonResponse.substring(startIndex, endIndex);

                // معالجة فك التشفير للأحرف الخاصة (مثل Unicode)
                translatedLine = translatedLine.replace("\\n", "").replace("\\\"", "\"");

                finalTranslation.append(translatedLine).append("\n");
            } else {
                finalTranslation.append(line).append("\n");
            }
        }
        return finalTranslation.toString().trim();
    }
}