import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first integer: ");
        int num1 = sc.nextInt();
        System.out.print("second integer: ");
        int num2 = sc.nextInt();
        System.out.print("third integer: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println(average);
        sc.close();
    }
}
