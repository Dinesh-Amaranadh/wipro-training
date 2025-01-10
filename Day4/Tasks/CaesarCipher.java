package Day4.Tasks;

// Task 2: Caesar Cipher for String Encryption
import java.util.*;

public class CaesarCipher {
    public static String encrypt(String input, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    encrypted.append((char) ((c - 'a' + shift) % 26 + 'a'));
                } else if (Character.isUpperCase(c)) {
                    encrypted.append((char) ((c - 'A' + shift) % 26 + 'A'));
                }
            } else {
                encrypted.append(c);
            }
        }

        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int shift = scanner.nextInt();
        System.out.println(encrypt(input, shift));
        scanner.close();
    }
}
