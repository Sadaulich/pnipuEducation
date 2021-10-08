import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Arrays;

public class Num1Writer extends Thread{
    private String[] text;
    private long startTime;
    private String dstFile;

    public Num1Writer(String[] text, long startTime, String dstFile) {
        this.text = text;
        this.startTime = startTime;
        this.dstFile = dstFile;
    }

    @Override
    public void run() {
        File file = new File(dstFile);
        try(FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for(String str : text) {
                bufferedWriter.write(str);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Duration: " + (System.currentTimeMillis() - startTime));
    }
}
