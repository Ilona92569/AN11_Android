public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("дед летел на юг .мадам ищи потоп .комок счастья .на дороге радар .");
        System.out.println(str);
        StringBuffer str2;
        int[] word = new int[10];
        int k = 0;
        do {
            str2 = new StringBuffer(str.substring(0, str.indexOf(".")));
            str.delete(0, str.indexOf(".") + 1);
            if (str2.length() > 0) {
                do {
                    if (str2.indexOf(" ") > -1) {
                        int kol = 0;
                        String str3 = str2.substring(0, str2.indexOf(" "));
                        for (int i = 0, j = str3.length() - 1; i < str3.length() && j >= 0; i++, j--) {
                            if (str3.charAt(i) == str3.charAt(j)) {
                                kol++;
                            }
                        }
                        if (kol == str3.length()) {
                            word[k] += 1;
                        }
                    }
                    str2.delete(0, str2.indexOf(" ") + 1);
                } while (str2.indexOf(" ") >= 0);
                k++;
            }
        } while (str.length() > 0);
        int max = word[0];
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i] > max) {
                max = word[i];
                index++;
            }
        }
        System.out.println("Предложение " + (index + 1));
    }
}
