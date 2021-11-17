package task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line:");
        String string = sc.nextLine();
        Pattern pattern = Pattern.compile("[ ]");
        List<String> list = new ArrayList<>(Arrays.asList(pattern.split(string, 0)));
        List<String> listNew = new ArrayList<>();
        int reruns = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    reruns++;
                    //System.out.println(reruns);
                }
            }
            if (reruns == 0) {
                listNew.add(list.get(i));
            }
            reruns = 0;
        }
        for (String number :
                listNew) {
            System.out.print(number + " ");
        }
    }
}
