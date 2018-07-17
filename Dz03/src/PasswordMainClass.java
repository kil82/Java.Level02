import java.util.Scanner;

public class PasswordMainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Password is good " + checkPassowrd(password));
    }

    public static boolean checkPassowrd(String password) {
        if (password.length() >= 8 && password.matches("^|.+[0-9].+") && password.matches("^|.+[a-z].+") && password.matches("^|.+[A-Z].+")) return true;
        return false;
    }
}
