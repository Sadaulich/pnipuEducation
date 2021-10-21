import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Num13 {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";

        List<String> lines = Files.readAllLines(Paths.get(path1));
        System.out.println("Самая длинная строка номер: " + findMaxStr(lines));
    }

    public static int findMaxStr(List<String> lines) {
        int max = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(max).length() < lines.get(i).length()) {
                max = i;
            }
        }
        return max;
    }
}
