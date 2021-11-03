import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer str = new StringBuffer("lll pop ewfja ppp 5464 1212 2222 l ");
        StringBuffer strnew = new StringBuffer(str);
        System.out.println(strnew);
        StringBuffer str2;
        int[] word = new int[10];
        int k = 0;
        do {
            str2 = new StringBuffer(str.substring(0, str.indexOf(" ")));
            str.delete(0, str.indexOf(" ") + 1);
            if (str2.length() > 0) {
                int kol = 0;
                int symbol = str2.charAt(0);
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) == symbol) {
                        kol++;
                    }
                }
                word[k] = kol;
                str2.delete(0, str2.indexOf(" ") + 1);
                k++;
            }
        } while (str.length() > 0);
        int max = word[0];
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] > max) {
                max = word[i];
                index = i;
            }
        }
        for (int i = 0; i < index; i++) {
            strnew.delete(0, strnew.indexOf(" ") + 1);
        }
        StringBuffer strword = new StringBuffer(strnew.substring(0, strnew.indexOf(" ")));
        System.out.println(strword);
    }
}
