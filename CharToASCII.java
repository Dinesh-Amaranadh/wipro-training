import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);

        int asciiValue = (int) character;
        System.out.println(asciiValue);
        sc.close();
    }
}
