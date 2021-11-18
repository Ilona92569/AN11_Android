package task3;

import java.io.*;
import java.util.Arrays;

public class Utils {
    public static String readFile(String file) {
        char[] buf = new char[5000];
        try (Reader reader = new BufferedReader(new FileReader(file))) {
            int c;
            while ((c = reader.read(buf)) > 0) {
                if (c < 5000) {
                    buf = Arrays.copyOf(buf, c);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return String.copyValueOf(buf);
    }
}
