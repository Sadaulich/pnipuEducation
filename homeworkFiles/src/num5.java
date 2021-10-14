import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class num5 {
    static String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";
    static String path2 = "C:\\Users\\Facer\\Desktop\\b.txt";
    static String path3 = "C:\\Users\\Facer\\Desktop\\c.txt";

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path1));
            lines.addAll(Files.readAllLines(Paths.get(path2)));
            Files.write(Paths.get(path3), lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
