import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class num2 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Facer\\Desktop\\a.txt";
        StringBuilder builder = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "";
            do {
                if (line == null) break;
                line = br.readLine();
                builder.append(line);
            } while (line != null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (builder.isEmpty()) {
            System.out.println("Пусто");
        } else {
            System.out.println(maxSymbol(builder.toString()));
        }
    }

    public static char maxSymbol(String text) {
        char ch, answer = 'a';
        int max = 0;
        while (!text.equals("")) {
            ch = text.charAt(0);
            int temp = 0;
            for (int i = 0; i < text.length(); i++) {
                if (ch == text.charAt(i)) {
                    temp++;
                }
            }
            if (max < temp) {
                max = temp;
                answer = ch;
            }
            text = text.replace(Character.toString(ch), "");
        }
        return answer;
    }
}
