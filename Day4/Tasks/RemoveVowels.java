package Day4.Tasks;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            if (!vowels.contains(String.valueOf(input.charAt(i)))) {
                result.append(input.charAt(i));
            }
        }

        System.out.println("String after removing vowels: " + result);
        sc.close();
    }
}
