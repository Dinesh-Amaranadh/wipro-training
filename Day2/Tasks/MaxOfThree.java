import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first integer: ");
        int a = sc.nextInt();
        System.out.print("second integer: ");
        int b = sc.nextInt();
        System.out.print("third integer: ");
        int c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("Max = "+max);
        sc.close();
    }
}
