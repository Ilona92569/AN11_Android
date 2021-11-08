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
        String[] word= pattern.split(text, 0);
        int[] wordCount=new int[word.length];
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if(word[i].equals(word[j])){
                    wordCount[i]++;
                }
            }
        }
        int[] indexArr= new int[wordCount.length];
        int max= wordCount[0];
        int index=0;
        StringBuffer wordMax = new StringBuffer(word[0]);
        for (int j = 0; j < indexArr.length; j++) {
            for (int i = 0; i < wordCount.length; i++) {
                if (!wordMax.toString().equals(word[i])) {
                    if (max <= wordCount[i]) {
                        wordMax.replace(0, wordMax.length(), word[i]);
                        max = wordCount[i];
                        index = i;
                    }
                }
            }
            indexArr[j]= index;
            for (int p = 0; p < wordCount.length; p++) {
                if(word[p].equals(wordMax.toString())) {
                    wordCount[p] = 0;
                }
            }
            wordMax.replace(0, wordMax.length(), word[0]);
            max= wordCount[0];
            index=0;
        }
        for (int i = 0; i < indexArr.length; i++) {
            System.out.print(word[indexArr[i]]+" ");
        }
    }
}
