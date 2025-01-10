
import java.util.*;

public class DisplayMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[5];
        marks[1] = new int[10];
        marks[2] = new int[15];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of classroom " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks obtained in classroom " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println(marks[i][j]);
            }
            System.out.println();
        }
		scan.close();
    }
}
