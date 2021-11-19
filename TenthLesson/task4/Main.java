package task4;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        heavyBoxSet.add(new HeavyBox(123, 0));
        heavyBoxSet.add(new HeavyBox(122, 2));
        heavyBoxSet.add(new HeavyBox(1, 3));
        heavyBoxSet.add(new HeavyBox(654, 5));
        heavyBoxSet.add(new HeavyBox(235, 1));
        for (HeavyBox heavyBox :
                heavyBoxSet) {
            System.out.println(heavyBox);
        }
    }
}
