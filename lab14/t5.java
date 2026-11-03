import java.io.*;
import java.nio.charset.StandardCharsets;

public class t5 {
    public static void main(String[] args) {
        String fname = "t5.txt";
        int[] nums = {12, 55, 78, 3, 100, 49, 51, -7, 82, 60};

        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(fname), StandardCharsets.UTF_8))) {
            for (int x : nums) {
                bw.write(Integer.toString(x));
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int count = 0;
        System.out.print("Числа в файле: ");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fname), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                int x = Integer.parseInt(line);
                System.out.print(x + " ");
                if (x > 50) count++;
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
        System.out.println("\nКоличество чисел > 50: " + count);
    }
}