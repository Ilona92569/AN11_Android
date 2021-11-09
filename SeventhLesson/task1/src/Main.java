import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.println("Enter string:");
            str = sc.nextLine();
        } while (str.length() < 0);
        System.out.println(str);
        int indexA = str.indexOf("A");
        int indexB = str.lastIndexOf("B");
        if (indexA > 0 || indexB > 0) {
            String str2 = str.substring(0, indexA);
            String str3 = str2 + str.substring(indexB + 1, str.length());
            System.out.println(str3);
        } else {
            System.out.println("Character 'A' or character 'B' not in the string)");
        }
    }
}
