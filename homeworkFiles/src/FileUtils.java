import java.io.File;

public class FileUtils {

    public static long calculateFolderSize(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            long size = 0;
            File[] files = file.listFiles();
            if (files == null) {
                return 0;
            }
            for (File f : files) {
                size += calculateFolderSize(f.toString());
            }
            return size;
        }
        return file.length();
    }

    public static String formatSize(long b) {
        double size = (double) b;
        String sizeName = "байт";
        if (size >= 1024) {
            size /= 1024;
            sizeName = "Кб";
            if (size >= 1024) {
                size /= 1024;
                sizeName = "Мб";
            }
            if (size >= 1024) {
                size /= 1024;
                sizeName = "Гб";
            }
        }
        String result = String.format("%.2f", size);
        return result + " " + sizeName;
    }
}
