public class Num1 {
    static String path = "C:\\Users\\Facer\\Desktop\\test.txt";

    public static void main(String[] args) {
        String str = "popo@1241;',askl14890f;:f915k";

        String[] text = new String[100000000];
        for (int i = 0; i < 100000000; i++) {
            text[i] = str;
        }
        long startTime = System.currentTimeMillis();

        // 2 thread
        /*String[] text1 = new String[text.length / 2];
        System.arraycopy(text, 0, text1, 0, text1.length);
        Num1Writer t1 = new Num1Writer(text1, System.currentTimeMillis(), path);
        t1.start();

        String[] text2 = new String[text.length / 2];
        System.arraycopy(text, text.length / 2, text2, 0, text2.length);
        Num1Writer t2 = new Num1Writer(text2, System.currentTimeMillis(), path);
        t2.start();*/

         // 4 thread
        /*
        String[] text1 = new String[text.length / 4];
        System.arraycopy(text, 0, text1, 0, text1.length);
        Num1Writer t1 = new Num1Writer(text1, System.currentTimeMillis(), path);
        t1.start();

        String[] text2 = new String[text.length / 4];
        System.arraycopy(text, text.length / 4, text2, 0, text2.length);
        Num1Writer t2 = new Num1Writer(text2, System.currentTimeMillis(), path);
        t2.start();

        String[] text3 = new String[text.length / 4];
        System.arraycopy(text, text.length / 2, text3, 0, text3.length);
        Num1Writer t3 = new Num1Writer(text3, System.currentTimeMillis(), path);
        t3.start();

        String[] text4 = new String[text.length / 4];
        System.arraycopy(text, text.length * 3 / 4, text4, 0, text4.length);
        Num1Writer t4 = new Num1Writer(text4, System.currentTimeMillis(), path);
        t4.start();
         */

        String[] text1 = new String[text.length / 8];
        System.arraycopy(text, 0, text1, 0, text1.length);
        Num1Writer t1 = new Num1Writer(text1, System.currentTimeMillis(), path);
        t1.start();

        String[] text2 = new String[text.length / 8];
        System.arraycopy(text, text.length / 8, text2, 0, text2.length);
        Num1Writer t2 = new Num1Writer(text2, System.currentTimeMillis(), path);
        t2.start();

        String[] text3 = new String[text.length / 8];
        System.arraycopy(text, text.length / 4, text3, 0, text3.length);
        Num1Writer t3 = new Num1Writer(text3, System.currentTimeMillis(), path);
        t3.start();

        String[] text4 = new String[text.length / 8];
        System.arraycopy(text, text.length * 3 / 4, text4, 0, text4.length);
        Num1Writer t4 = new Num1Writer(text4, System.currentTimeMillis(), path);
        t4.start();

        String[] text5 = new String[text.length / 8];
        System.arraycopy(text, text.length / 2, text5, 0, text5.length);
        Num1Writer t5 = new Num1Writer(text5, System.currentTimeMillis(), path);
        t5.start();

        String[] text6 = new String[text.length / 8];
        System.arraycopy(text, text.length / 4, text6, 0, text6.length);
        Num1Writer t6 = new Num1Writer(text6, System.currentTimeMillis(), path);
        t6.start();

        String[] text7 = new String[text.length / 8];
        System.arraycopy(text, text.length / 2, text7, 0, text7.length);
        Num1Writer t7 = new Num1Writer(text7, System.currentTimeMillis(), path);
        t7.start();

        String[] text8 = new String[text.length / 8];
        System.arraycopy(text, text.length * 3 / 4, text8, 0, text8.length);
        Num1Writer t8 = new Num1Writer(text8, System.currentTimeMillis(), path);
        t8.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("SDuration: " + (System.currentTimeMillis() - startTime));
    }

    /* 2 thread
    Duration: 5947
        4 thread
    Duration: 4080
        8 thread
    Duration: 4583
     */
}
