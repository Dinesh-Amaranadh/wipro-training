// Task 1: Jumping on the Clouds
import java.util.*;

public class JumpingOnClouds {
    public static int minimumJumps(int[] clouds) {
        int jumps = 0;
        int position = 0;

        while (position < clouds.length - 1) {
            if (position + 2 < clouds.length && clouds[position + 2] == 0) {
                position += 2;
            } else {
                position += 1;
            }
            jumps++;
        }

        return jumps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }
        System.out.println(minimumJumps(clouds));
        scanner.close();
    }
}