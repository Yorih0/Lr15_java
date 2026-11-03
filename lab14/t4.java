import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        String fname = "t4.txt";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 14 значений роста (см):");

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fname), StandardCharsets.UTF_8))) {
            for (int i = 0; i < 14; i++) {
                System.out.printf("Рост %d: ", i + 1);
                double r = sc.nextDouble();
                bw.write(Double.toString(r));
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fname), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                sum += Double.parseDouble(line);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            System.out.printf("Средний рост: %.2f см (по %d значениям)%n", sum / count, count);
        }
    }
}