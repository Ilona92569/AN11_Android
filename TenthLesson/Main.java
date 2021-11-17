package task6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.add("25");
        set1.add("2");
        set1.add("4");
        set1.add("69");
        set1.add("18");
        //
        set2.add("25");
        set2.add("8");
        set2.add("13");
        set2.add("268");
        set2.add("69");
        Set<String> setUnion = union(set1, set2);
        show(setUnion);
        System.out.println();
        Set<String> setIntersect = intersect(set1, set2);
        show(setIntersect);
    }

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> setUnion = new HashSet<>();
        setUnion.addAll(set1);
        setUnion.addAll(set2);
        return setUnion;
    }

    public static Set<String> intersect(Set<String> set1, Set<String> set2) {
        Set<String> setIntersect = new HashSet<>();
        setIntersect.addAll(set1);
        setIntersect.retainAll(set2);
        return setIntersect;
    }

    public static void show(Set<String> setUnion) {
        for (String str :
                setUnion) {
            System.out.println(str);
        }
    }
}
