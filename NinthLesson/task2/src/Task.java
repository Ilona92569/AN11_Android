import java.util.regex.Pattern;

public class Task {
    public static boolean word(String offer) {
        Pattern pattern = Pattern.compile("[, ]");
        String[] strNew = pattern.split(offer, 0);
        if (strNew.length > 2 && strNew.length < 6) {
            return true;
        }
        return false;
    }

    public static boolean palindrome(String offer) {
        Pattern pattern = Pattern.compile("[, ]");
        String[] word = pattern.split(offer, 0);
        int kol = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > 1) {
                for (int j = 0, p = word[i].length() - 1; j < word[i].length() && p >= 0; j++, p--) {
                    char start = word[i].charAt(j);
                    char end = word[i].charAt(p);
                    if (Character.toLowerCase(start) == Character.toLowerCase(end)) {
                        kol++;
                    }
                }
                if (kol == word[i].length()) {
                    return true;
                }
                kol = 0;
            }
        }
        return false;
    }
}
