import java.util.Arrays;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String file = "E:\\JetBrains\\AN11_Android\\NinthLesson\\task3\\Text.txt";
        String fileBad = "E:\\JetBrains\\AN11_Android\\NinthLesson\\task3\\BadWord.txt";
        String text = Utils.readFile(file);
        String badText = Utils.readFile(fileBad);
        Pattern patternOffer = Pattern.compile("[\\n]");
        String[] offer = patternOffer.split(text, 0);
        String[] badOffer = new String[0];
        int k = 0;
        for (int i = 0; i < offer.length; i++) {
            if (Task.task(offer[i], badText)) {
                if (k > badOffer.length - 1) {
                    badOffer = Arrays.copyOf(badOffer, badOffer.length + 1);
                }
                badOffer[k] = offer[i];
                k++;
            }
        }

        if (badOffer.length > 0) {
            int kol = badOffer.length;
            System.out.println(kol + " предложения, такие как: ");
            for (int i = 0; i < badOffer.length; i++) {
                System.out.println(badOffer[i]);
            }
            System.out.println("Подлежат исправлению на цензуру");
        } else {
            System.out.println("Текст прошёл проверку");
        }
    }
}
