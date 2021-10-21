import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.lang.*;

public class Num1 {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\kryld\\Desktop\\slova.txt";
        List<String> lines = Files.readAllLines(Paths.get(path1));
        int sym_1 = 0;
        int sym_2 = 0;
        int sym_3 = 0;
        int sym_4 = 0;
        int sym_5 = 0;

        int s = lines.size();
        for (int i = 0; i < s; i++)
        {
            int k = lines.get(i).length();
            if (k == 1)
            {
                sym_1 = sym_1 + k;
            }
            if (k == 2)
            {
                sym_2 = sym_2 + k;
            }
            if (k == 3)
            {
                sym_3 = sym_3 + k;
            }
            if (k == 4)
            {
                sym_4 = sym_4 + k;
            }
            if (k == 5) {
                sym_5 = sym_5 + k;
            }
        }
        System.out.println(sym_1);
        System.out.println(sym_2/2);
        System.out.println(sym_3/3);
        System.out.println(sym_4/4);
        System.out.println(sym_5/5);


    }
}