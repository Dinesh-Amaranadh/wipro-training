package Day4.Assignments;

import java.util.Scanner;

public class ConsecutiveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        char previousChar = '\0';

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != previousChar) {
                result.append(currentChar);
            }
            previousChar = currentChar;
        }

        System.out.println("String after removing consecutive duplicates: " + result);
        sc.close();
    }
}
