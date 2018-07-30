package clientSide;

import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        String str;
        while (true) {
            str = scanner.nextLine();
            if (str == "/end") {
                client.sendMsg("/end");
                break;
            } else {
                client.sendMsg(str);
            }
        }

    }
}
