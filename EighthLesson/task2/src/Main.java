import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checkLogin(final String login) {
        String regex = "[A-Za-z0-9_]+";
        if (login.length() > 20 || !Pattern.matches(regex, login)) {
            final WrongLoginException exception = new WrongLoginException("Wrong login");
            try {
                throw exception;
            } catch (WrongLoginException ex) {
                ex.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static boolean checkPassword(final String password, final String confirmPassword) {
        String regex = "[A-Za-z0-9_]+";
        if (password.length() > 20 || !password.equals(confirmPassword) || !Pattern.matches(regex, password)) {
            final WrongPasswordException exception = new WrongPasswordException("Wrong password");
            try {
                throw exception;
            } catch (WrongPasswordException ex) {
                ex.printStackTrace();
            } finally {
                return false;
            }
        }
        return true;
    }

    public static boolean examination(final String login, final String password, final String confirmPassword) {
        if (checkLogin(login)) {
            if (checkPassword(password, confirmPassword)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login");
        String login = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("Repeat password");
        String confirmPassword = sc.nextLine();
        System.out.println(examination(login, password, confirmPassword));
    }
}
