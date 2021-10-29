package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greeter english = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Hello. How are you doing?");
            }
        };
        Greeter russian = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Здравствуйте. Как ваши дела?");
            }
        };
        Greeter german = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Guten Tag. Wie geht es ihnen?");
            }
        };
        Greeter belarusian = new Greeter() {
            @Override
            public void wish() {
                System.out.println("Дзень добры. Як вашы справы?");
            }
        };
        int task;
        do {
            System.out.println("Select a tack:");
            System.out.println("1-Greeting in english");
            System.out.println("2-Greeting in russian");
            System.out.println("3-Greeting in german");
            System.out.println("4-Greeting in belarusian");
            System.out.println("5-Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    english.wish();
                    break;
                case 2:
                    russian.wish();
                    break;
                case 3:
                    german.wish();
                    break;
                case 4:
                    belarusian.wish();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("There is no such tack number");
            }
        } while (task != 5);
    }
}
