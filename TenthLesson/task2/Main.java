package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        StringBuffer text = new StringBuffer("в этому году очень красивая весна\n" +
                "когда смотришь на всё вокруг хочется плакать от счатья\n" +
                "цветы как будто вдыхали свежий воздух\n" +
                "а над ними кружили только что прилетившие птицы\n" +
                "да имеено в этом году весна лучше прошлой\n");
        System.out.println(text);
        Pattern pattern = Pattern.compile("[\\s\\n]");
        List<String> word = new ArrayList<String>(Arrays.asList(pattern.split(text, 0)));
        int[] wordCount = new int[word.size()];
        for (int i = 0; i < word.size(); i++) {
            for (int j = 0; j < word.size(); j++) {
                if (word.get(i).equals(word.get(j))) {
                    wordCount[i]++;
                }
            }
        }
        int[] indexArr = new int[wordCount.length];
        int max = wordCount[0];
        int index = 0;
        String wordMax = word.get(0);
        for (int j = 0; j < indexArr.length; j++) {
            for (int i = 0; i < wordCount.length; i++) {
                if (!wordMax.equals(word.get(i))) {
                    if (max <= wordCount[i]) {
                        wordMax = word.get(i);
                        max = wordCount[i];
                        index = i;
                    }
                }
            }
            indexArr[j] = index;
            for (int p = 0; p < wordCount.length; p++) {
                if (word.get(p).equals(wordMax)) {
                    wordCount[p] = 0;
                }
            }
            wordMax = word.get(0);
            max = wordCount[0];
            index = 0;
        }
        for (int i = 0; i < indexArr.length; i++) {
            System.out.print(word.get(indexArr[i]) + " ");
        }
    }
}
