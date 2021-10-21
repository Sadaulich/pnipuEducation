import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Num9 {

    public static void main(String[] args) throws Exception {
        FileReader read_file1 = new FileReader("file1.txt");
        FileWriter write_file2 = new FileWriter("file2.txt");

        BufferedReader bufferedReader = new BufferedReader(read_file1);
        String line = bufferedReader.readLine();
        String fullLine = "";

        while (line != null) {
            fullLine += line;
            line = bufferedReader.readLine();
        }

        int i = 0;
        boolean minus_x = false;

        StringBuilder stringBuilder = new StringBuilder(fullLine);
        for (char c : fullLine.toCharArray()) {

            if (c == '-' && !minus_x) {
                stringBuilder.setCharAt(i, '0');
                minus_x = true;
            } else if (c == ' ') {
                minus_x = false;
            } else if (minus_x) {
                stringBuilder.deleteCharAt(i);
                i--;
            }
            i++;
        }

        write_file2.write(stringBuilder.toString());

        read_file1.close();
        write_file2.close();
    }
}