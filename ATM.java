import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PIN = 1234;
        int tries = 0;
        final int MAX_TRIES = 3;
        int inputPin;
        boolean success = false;

        do {
            System.out.print("Enter your PIN: ");
            inputPin = scanner.nextInt();
            tries++;

            if (inputPin == PIN) {
                success = true;
                System.out.println("Access Granted!");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        } while (tries < MAX_TRIES);

        if (!success) {
            System.out.println("Too many attempts. Account locked.");
        }

        scanner.close();
    }
}
