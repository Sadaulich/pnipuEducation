import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Num1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Facer\\Desktop\\a.txt";
        String string = "Hello";
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> {
                if (line.contains(string)) {
                    System.out.println(line);
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
