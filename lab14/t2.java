import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        String fname = "f2.txt";
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 10 целых чисел:");

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fname), StandardCharsets.UTF_8))) {
            for (int i = 0; i < 10; i++) {
                System.out.printf("Число %d: ", i + 1);
                int x = sc.nextInt();
                bw.write(Integer.toString(x));
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int sum = 0;
        System.out.print("\nЧисла из файла: ");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fname), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                int x = Integer.parseInt(line);
                System.out.print(x + " ");
                if (x > 0) sum += x;
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nСумма положительных: " + sum);
    }
}