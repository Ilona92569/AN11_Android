import java.util.Scanner;

public class Third11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите колличество учеников");
        while (!sc.hasNextInt()) {
            System.out.println("Ещё раз");
            sc.next();
        }
        int n = sc.nextInt();
        String[][] arr = new String[n + 1][5];
        for (int i = 1; i < n + 1; i++) {
            arr[i][0] = String.valueOf(i);
        }
        arr[0][0] = "Номер";
        arr[0][1] = "ФИО";
        arr[0][2] = "1";
        arr[0][3] = "2";
        arr[0][4] = "3";

        for (int i = 1; i < n + 1; i++) {
            System.out.println("Введите имя ученика");
            arr[i][1] = cs.nextLine();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("Введите 1 если хотите изменить что-то в журнале. Введите  для выхода из редактирования.");
        String z;
        do {
            System.out.println("Введите операцию: ");
            z = cs.nextLine();
            switch (z) {
                case "1":
                    System.out.println("Введите имя ученика");
                    String m = cs.nextLine();
                    System.out.println("Введите день");
                    String p = cs.nextLine();
                    int pl = 0;
                    for (int i = 0; i < 5; i++) {
                        if (arr[0][i].equals(p)) {
                            pl = i;
                            break;
                        }
                    }
                    for (int i = 0; i <= n; i++) {
                        if (arr[i][1].equals(m)) {
                            System.out.println("Введите + или -");
                            arr[i][pl] = cs.nextLine();
                        }
                    }
                    break;
                case "exit":
                    for (int i = 0; i <= n; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
            }
        } while (!z.equals("exit"));
    }
}

