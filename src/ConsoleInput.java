import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        System.out.println("Hello! Please, enter number: ");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        System.out.println(userNumber);
    }
}
