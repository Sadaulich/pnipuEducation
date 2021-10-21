package Laba2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Reader;

public class Num7 {

    public static void main(String[] args) throws Exception {
        FileReader read_file1 = new FileReader("C:\\Users\\garip\\OneDrive\\Рабочий стол\\file1.txt");
        BufferedReader bufferedReader = new BufferedReader(read_file1);
        String line = bufferedReader.readLine();
        ArrayList<String> str = new ArrayList<>();

        while (line != null) {
            str.add(line);
            line = bufferedReader.readLine();
        }

        FileWriter write_file1 = new FileWriter("C:\\Users\\garip\\OneDrive\\Рабочий стол\\file1.txt");
        write_file1.write(str.get(1));
        write_file1.write(str.get(0));

        read_file1.close();
        write_file1.close();
    }
}