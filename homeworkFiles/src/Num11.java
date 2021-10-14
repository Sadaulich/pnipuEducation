import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;

public class Num11 {
    static String path1 = "C:\\Users\\Facer\\Desktop\\a.txt";
    static String path2 = "C:\\Users\\Facer\\Desktop\\b.txt";
    static String path3 = "C:\\Users\\Facer\\Desktop\\d.txt";

    public static void main(String[] args) {
        long a = FileUtils.calculateFolderSize(path1);
        long b = FileUtils.calculateFolderSize(path2);
        long c = FileUtils.calculateFolderSize(path3);

        try {
            if (a > c && a > b) {
                if (b > c) {
                    Files.copy(Paths.get(path3), Paths.get(path1), StandardCopyOption.REPLACE_EXISTING);
                } else {
                    Files.copy(Paths.get(path2), Paths.get(path1), StandardCopyOption.REPLACE_EXISTING);
                }
            }
            if (b > c && b > a) {
                if (a > c) {
                    Files.copy(Paths.get(path3), Paths.get(path2), StandardCopyOption.REPLACE_EXISTING);
                } else {
                    Files.copy(Paths.get(path1), Paths.get(path2), StandardCopyOption.REPLACE_EXISTING);
                }
            }
            if (c > a && c > b) {
                if (a > b) {
                    Files.copy(Paths.get(path2), Paths.get(path3), StandardCopyOption.REPLACE_EXISTING);
                } else {
                    Files.copy(Paths.get(path1), Paths.get(path3), StandardCopyOption.REPLACE_EXISTING);
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
