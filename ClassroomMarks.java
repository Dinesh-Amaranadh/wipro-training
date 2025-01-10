import java.util.*;
public class ClassroomMarks
{
	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int [][]marks = new int[3][5];
 		for(int i=0;i<marks.length;i++){
 		    for(int j=0;j<marks[i].length;j++){
 		         marks[i][j] = scan.nextInt();
 		    }
				   
					
 		}
				
 		for(int i=0;i<marks.length;i++){
 		    System.out.println("Marks obtained by 5 students in class "+i+1+" are : ");
 		    for(int j=0;j<marks[i].length;j++){
 		    System.out.print(marks[i][j]+" ");
			
 		}
 		System.out.println();
 		}
		scan.close();
				
			
	
 	}
 }
		