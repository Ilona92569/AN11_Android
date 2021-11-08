public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("дед летел на юг .мадам ищи потоп .комок счастья .на дороге радар .");
        System.out.println(str);
        int[] word = new int[100];
        int k = 0;
        wordCount(str, word, k);
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

    public static int[] wordCount(StringBuffer string, int[] word, int k) {
        do {
            StringBuffer offer;
            offer = new StringBuffer(string.substring(0, string.indexOf(".")));
            string.delete(0, string.indexOf(".") + 1);
            if (offer.length() > 0) {
                do {
                    if (offer.indexOf(" ") > -1) {
                        seachForPalindromes(offer, word, k);
                    }
                    offer.delete(0, offer.indexOf(" ") + 1);
                } while (offer.indexOf(" ") >= 0);
                k++;
            }
        } while (string.length() > 0);
        return word;
    }

    public static int[] seachForPalindromes(StringBuffer offer, int[] word, int k) {
        int kol = 0;
        String strWord = offer.substring(0, offer.indexOf(" "));
        for (int i = 0, j = strWord.length() - 1; i < strWord.length() && j >= 0; i++, j--) {
            if (strWord.charAt(i) == strWord.charAt(j)) {
                kol++;
            }
        }
        if (kol == strWord.length()) {
            word[k] += 1;
        }
        return word;
    }
}
