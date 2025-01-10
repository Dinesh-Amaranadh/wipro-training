import java.util.*;

public class PresentMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // No of schools
        int[][][] marks = new int[2][][];

        // No of classrooms in a school
        marks[0] = new int[3][];
        marks[1] = new int[2][];

        // No of students in a classroom in school 1
        marks[0][0] = new int[3];
        marks[0][1] = new int[2];
        marks[0][2] = new int[4];

        // No of students in a classroom in school 2
        marks[1][0] = new int[2];
        marks[1][1] = new int[4];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the school " + (i + 1) + " details: ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter marks for classroom " + (j + 1) + ":");
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.print("Enter mark for student " + (k + 1) + ": ");
                    marks[i][j][k] = scan.nextInt();
                }
            }
            System.out.println("-------------------------");
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("School " + (i + 1) + " details: ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Student details in classroom " + (j + 1));
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("Student " + (k + 1) + ": " + marks[i][j][k]);
                }
            }
            System.out.println("-------------------------");
        }
		scan.close();
    }
}