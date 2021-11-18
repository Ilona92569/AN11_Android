package task3;

import java.util.regex.Pattern;

public class MyThreadWord implements Runnable{
    public String badText;
    String offer;
    public boolean bad;

    public MyThreadWord(String badText, String offer) {
        this.badText = badText;
        this.offer = offer;
        bad = false;
    }

    @Override
    synchronized public void run() {
        Pattern patternWord = Pattern.compile("[ ]");
        String[] word = patternWord.split(offer, 0);
        String[] badWord = patternWord.split(badText, 0);
        for (int i = 0, j= word.length-1; i < word.length/2; i++, j--) {
            MyThreadWordOne myThreadWordOne = new MyThreadWordOne(badWord, word[j]);
            myThreadWordOne.run();
            if(myThreadWordOne.bad){
                bad=true;
            }
            MyThreadWordTwo myThreadWordTwo = new MyThreadWordTwo(badWord, word[j]);
            myThreadWordTwo.run();
            if(myThreadWordTwo.bad){
                bad=true;
            }
        }
    }
}
