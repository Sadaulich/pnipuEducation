import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Num12 {
    static String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";
    static String path2 = "C:\\Users\\Facer\\Desktop\\b.txt";
    static String path3 = "C:\\Users\\Facer\\Desktop\\d.txt";

    public static void main(String[] args) throws IOException {
        List<String> lines1 = Files.readAllLines(Paths.get(path2));

        File file3 = new File(path3);
        file3.getName();

        Files.copy(Paths.get(path2), Paths.get(path1), StandardCopyOption.REPLACE_EXISTING);
        Files.write(Paths.get(path1), lines1);
    }
}
