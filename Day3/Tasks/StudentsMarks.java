import java.util.*;
public class StudentsMarks
{
	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int [] marks = new int[5];
 		for(int i=0;i<marks.length;i++){
 		    marks[i] = scan.nextInt();
					
 		}
 		System.out.println("Marks obtained by 5 students are: ");
 		for(int i=0;i<marks.length;i++){
 		    System.out.print(marks[i]+" ");
	
 		}
		scan.close();
				
 	}
 }
		