import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        char[] buf = new char[256];
        try (FileReader reader = new FileReader("E:\\JetBrains\\AN11_Android\\NinthLesson\\task1\\Task1.txt")) {
           int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        String str = String.copyValueOf(buf);
        Pattern pattern = Pattern.compile("\\n");
        String[] strNew = pattern.split(str, 0);
        int kol = 0;
        int k = 0;
        int[] index = new int[4];
        for (int i = 0; i < strNew.length; i++) {
            for (int j = 0, p = strNew[i].length() - 2; j < strNew[i].length() && p >= 0; j++, p--) {
                char start = strNew[i].charAt(j);
                char end = strNew[i].charAt(p);
                if (Character.toLowerCase(start) == Character.toLowerCase(end)) {
                    kol++;
                }
            }
            if (kol == strNew[i].length() - 1) {
                index[k] = i;
                k++;
            }
            kol = 0;
        }
        try (FileWriter writer = new FileWriter("E:\\JetBrains\\AN11_Android\\NinthLesson\\task1\\Task1New.txt")) {
            for (int i = 0; i < index.length; i++) {
                writer.write(strNew[index[i]]);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
