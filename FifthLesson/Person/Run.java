import jacket.AdidasJacket;
import pants.NikePants;
import shoes.NikeShoes;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdidasJacket adidasJacket = new AdidasJacket();
        NikePants nikePants = new NikePants();
        NikeShoes nikeShoes = new NikeShoes();
        Person Ilona = new Person("Ilona", adidasJacket, nikePants, nikeShoes);
        int task;
        do {
            System.out.println("Select task:");
            System.out.println("1-Get dressed");
            System.out.println("2-Undress");
            System.out.println("3-Exit");
            while (!sc.hasNextInt()) {
                System.out.println("Again");
                sc.next();
            }
            task = sc.nextInt();
            switch (task) {
                case 1:
                    Ilona.getDressed();
                    break;
                case 2:
                    Ilona.undress();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("There is no such task");
            }
        } while (task != 3);
    }
}
