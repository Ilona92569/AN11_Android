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
        symbolCount(str, word, k);
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

    public static int[] symbolCount(StringBuffer str, int[] word, int k) {
        String strWord;
        do {
            strWord = new String(str.substring(0, str.indexOf(" ")));
            str.delete(0, str.indexOf(" ") + 1);
            if (strWord.length() > 0) {
                int kol = 0;
                char[] symbol = strWord.toCharArray();
                for (int i = 0; i < symbol.length; i++) {
                    for (int j = 0; j < strWord.length(); j++) {
                        if (symbol[i] == strWord.charAt(j)) {
                            kol++;
                        }
                    }
                    if (kol == 1) {
                        word[k]++;
                        kol = 0;
                    }
                }
                k++;
            }
        } while (str.length() > 0);
        return word;
    }
}
