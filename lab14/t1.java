import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class t1 {
    public void ReadFile(String fname) {
        File file = new File(fname);

        System.out.printf("\nБайт %d",file.length());
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String data= br.readAllAsString();
            System.out.printf("\nДанные файла: %s", data);
        } catch (Exception e) {
           System.out.printf("\nОшибка %s",e.getMessage());
        }
    }

    public void main() {
        String path = "D:\\Java\\Лр14\\t1.txt";
        ReadFile(path);
    }
}
