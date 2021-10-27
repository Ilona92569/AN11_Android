import start.RusSpace;
import start.Shuttle;
import start.SpaceX;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int task;
        do {
            System.out.println("Choose a company:");
            System.out.println("1-Shuttle launch");
            System.out.println("2-SpaceX launch");
            System.out.println("3-RUSspace launch");
            System.out.println("4-Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }

            task = sc.nextInt();
            switch (task) {
                case 1:
                    Shuttle shuttle = new Shuttle();
                    Spaceport.launch(shuttle);
                    break;
                case 2:
                    SpaceX spaceX = new SpaceX();
                    Spaceport.launch(spaceX);
                    break;
                case 3:
                    RusSpace rusSpace = new RusSpace();
                    Spaceport.launch(rusSpace);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("There is no such company");
            }
        } while (task != 4);
    }
}

