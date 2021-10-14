import java.io.BufferedReader;
import java.io.FileReader;

public class Num3 {
    String path = "C:\\Users\\Facer\\Desktop\\a.txt";
    StringBuilder builder = new StringBuilder();
    String string = "ab";

    public static void main(String[] args) {
        String path = "C:\\Users\\Facer\\Desktop\\a.txt";
        StringBuilder builder = new StringBuilder();
        String string = "ab";
        int countStr = 0;
        int countStrSym = 0;

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            do {
                line = br.readLine();
                if (line != null && line.contains(string)) {
                    countStr++;
                    builder.append(line);
                    countStrSym += containsSymbol(line, string);
                }
            } while (line != null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Кол-во строк содержащих данную последовательность: " + countStr);
        System.out.println("Кол-во строк содержащих все данные символы: " + countStr);
    }

    public static int containsSymbol(String line, String symbols) {
        for (int i = 0; i < symbols.length(); i++) {
            if (!line.contains(Character.toString(symbols.charAt(i)))) {
                return 0;
            };
        }
        return 1;
    }
}
