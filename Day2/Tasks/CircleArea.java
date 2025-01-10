import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is: %.2f\n", area);
        scanner.close();
    }
}
