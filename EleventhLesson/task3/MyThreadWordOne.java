package task3;

public class MyThreadWordOne implements Runnable {
    public String[] badWord;
    public String word;
    public boolean bad;

    public MyThreadWordOne(String[] badWord, String word) {
        this.badWord = badWord;
        this.word = word;
        bad = false;
    }

    @Override
    public void run() {
        for (int j = 0; j < badWord.length; j++) {
            if (word.equals(badWord[j])) {
                bad = true;
            }
        }
    }
}

