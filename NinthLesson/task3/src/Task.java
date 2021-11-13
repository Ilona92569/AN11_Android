import java.util.regex.Pattern;

public class Task {
    public static boolean task(String offer, String badText) {
        Pattern patternWord = Pattern.compile("[ ]");
        String[] word = patternWord.split(offer, 0);
        String[] badWord = patternWord.split(badText, 0);
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < badWord.length; j++) {
                if (word[i].equals(badWord[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}
