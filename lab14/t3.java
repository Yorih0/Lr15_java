import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class t3 {
    public static void main(String[] args) {
        String f = "f3.txt", g = "g3.txt", h = "h3.txt";
        Random rnd = new Random();

        try (BufferedWriter bwF = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(f), StandardCharsets.UTF_8));
             BufferedWriter bwG = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(g), StandardCharsets.UTF_8));
             BufferedWriter bwH = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(h), StandardCharsets.UTF_8))) {

            System.out.print("Исходный файл f: ");
            for (int i = 0; i < 20; i++) {
                int x = rnd.nextInt(101);
                bwF.write(Integer.toString(x));
                bwF.newLine();
                System.out.print(x + " ");

                if (x % 3 == 1) {
                    bwG.write(Integer.toString(x));
                    bwG.newLine();
                } else {
                    bwH.write(Integer.toString(x));
                    bwH.newLine();
                }
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        System.out.println("\nФайл g (x % 3 == 1):  " + readAll(g));
        System.out.println("Файл h (остальные):   " + readAll(h));
    }

    private static List<String> readAll(String fname) {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fname), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) result.add(line.trim());
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        return result;
    }
}