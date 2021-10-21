import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Num10 {
    static String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path1));

        System.out.println("Строк начинающихся и заканчивающихся на один и тот же символ: " + beginEndOneSymbol(lines));
    }

    public static int beginEndOneSymbol(List<String> lines) {
        int linesCount = 0;
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (Character.compare(line.charAt(0), line.charAt(line.length() - 1)) == 0) {
                linesCount++;
            }
        }
        return linesCount;
    }
}
