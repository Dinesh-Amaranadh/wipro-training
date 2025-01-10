import java.util.*;
public class Student
{
 	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);
 		int [][][]marks = new int[2][3][5];
 		for(int i=0;i<marks.length;i++){
 		    for(int j=0;j<marks[i].length;j++){
 		        for(int k=0;k<marks[i][j].length;k++){
 		            marks[i][j][k] = scan.nextInt();
 		        }
		         
 		    }
		   
		    
 		}
 		for(int k=0;k<marks.length;k++){
 		    System.out.println("School  "+k+1+" Details : ");
		
		
 		for(int i=0;i<marks[i].length;i++){
 		    System.out.println("Marks obtained by 5 students in class "+i+1+" are : ");
 		    for(int j=0;j<marks[i][j].length;j++){
 		    System.out.print(marks[i][j]+" ");
		    
 		}
 		System.out.println();
 		}
 		System.out.println("-----------------------------------------");
 		}
		scan.close();
 	}
 }
