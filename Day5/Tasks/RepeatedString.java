package Day5.Tasks;

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        long n = scan.nextInt();
        scan.close();
        long result = countingRepeatedString(s, n);

       
        System.out.println(result);
    }

    public static long countingRepeatedString(String s, long n) {
        
        long countAInS = s.chars().filter(c -> c == 'a').count();
        long fullRepeats = n / s.length();
        long remainder = n % s.length();
        long totalA = fullRepeats * countAInS;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalA++;
            }
        }

        return totalA;
    }
}

