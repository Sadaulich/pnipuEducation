import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Num4 {
    static String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";
    static String path2 = "C:\\Users\\Facer\\Desktop\\b.txt";

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader br1 = new BufferedReader(new FileReader(path1));
             BufferedReader br2 = new BufferedReader(new FileReader(path2))) {
            int stringCounter = 1;
            for (; ; ) {
                String line1 = br1.readLine();
                String line2 = br2.readLine();
                if (line1 == null && line2 == null) {
                    break;
                }
                if (line1 == null && line2 != null) {
                    System.out.println("Строка: " + stringCounter);
                    return;
                }
                int compare = compareString(line1, line2);
                if (compare != -1) {
                    System.out.println("Строка: " + stringCounter);
                    System.out.println("Символ: " + compare);
                    return;
                }
                stringCounter++;
            }
            System.out.println("Файлы равны.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static int compareString(String str1, String str2) {
        if (str1.length() == str2.length()) {
            int doCom = doCompareString(str1, str2, str2.length());
            return str1.length() == doCom ? -1 : doCom;
        } else {
            return str1.length() > str2.length() ? doCompareString(str1, str2, str2.length())
                    : doCompareString(str1, str2, str1.length());
        }
    }

    public static int doCompareString(String str1, String str2, int length) {
        for (int i = 0; i < length; i++) {
            if (Character.compare(str1.charAt(i), str2.charAt(i)) != 0) {
                return i;
            }
        }
        return length;
    }
}
