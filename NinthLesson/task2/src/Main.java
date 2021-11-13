import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String file = "E:\\JetBrains\\AN11_Android\\NinthLesson\\task2\\Task2.txt";
        String fileNew = "E:\\JetBrains\\AN11_Android\\NinthLesson\\task2\\Task2New.txt";
        String text = Utils.readFile(file);
        Pattern pattern = Pattern.compile("[.?]");
        String[] textNew = pattern.split(text, 0);
        String[] str = new String[2];
        int k = 0;
        for (int i = 0; i < textNew.length; i++) {
            if (Task.palindrome(textNew[i]) || Task.word(textNew[i])) {
                if (k > str.length - 1) {
                    str = Arrays.copyOf(str, str.length + 1);
                }
                str[k] = textNew[i];
                k++;
            }
        }
        Utils.writerFile(fileNew, str);
    }
}
