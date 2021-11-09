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
        char symbol3 = str.charAt(3);
        char symbol0 = str.charAt(0);
        String str2 = str.replace(symbol3, symbol0);
        System.out.println(str2);
    }
}
