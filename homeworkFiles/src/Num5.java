import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Num5 {
    static List<String> lines = new ArrayList<>();
    static String path1 = "C:\\Users\\Facer\\Desktop\\f.txt";
    static int indexSymbolInStr = 0;
    static int countEvenNumbers = 0;

    public static void main(String[] args) throws IOException {
        lines = Files.readAllLines(Paths.get(path1));
        lines.forEach(line -> {
            indexSymbolInStr = 0;
            while (indexSymbolInStr < line.length()) {
                if (Character.compare('-', line.charAt(indexSymbolInStr)) == 0) {
                    indexSymbolInStr++;
                    skipNumber(line);
                }
                if (indexSymbolInStr < line.length() && Character.isDigit(line.charAt(indexSymbolInStr))) {
                    checkNumber(line);
                }
                indexSymbolInStr++;
            }
        });
        System.out.println("Вывод: " + countEvenNumbers);
    }

    public static void skipNumber(String str) {
        while (indexSymbolInStr < str.length() && Character.isDigit(str.charAt(indexSymbolInStr))) {
            indexSymbolInStr++;
        }
    }

    public static void checkNumber(String str) {
        while(indexSymbolInStr < str.length() && Character.isDigit(str.charAt(indexSymbolInStr))) {
            if (indexSymbolInStr + 1 < str.length()) {
                if (Character.compare(' ', str.charAt(indexSymbolInStr + 1)) == 0 && checkEven(str.charAt(indexSymbolInStr))) {
                    countEvenNumbers++;
                }
            } else {
                if (checkEven(str.charAt(indexSymbolInStr))) {
                    countEvenNumbers++;
                }
            }
            indexSymbolInStr++;
        }
    }

    public static boolean checkEven(char ch) {
        return "02468".contains(Character.toString(ch));
    }
}
