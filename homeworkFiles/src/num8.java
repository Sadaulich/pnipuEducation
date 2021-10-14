import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class num8 {
    public static void main(String[] args) throws IOException {
        try (Scanner input = new Scanner(new File("C:\\Users\\Facer\\Desktop\\a.txt"))) {
            List<String> inputText = new ArrayList();
            while (input.hasNextLine()) {
                inputText.add(input.nextLine());
            }
            inputText.sort(String::compareTo);
            for (String str : inputText) {
                System.out.println(str);
            }
        }
    }
}
