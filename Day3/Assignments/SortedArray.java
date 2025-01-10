//Task 4
import java.util.*;
public class SortedArray {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        
        boolean sortedArray = checkSorting(array);
        if(sortedArray){
            System.out.println("Array is sorted by default");
        }else{
            System.out.println("Array is not sorted");
        }
        scan.close();
    }
    
    public static boolean checkSorting(int [] array){
        for(int i =1;i< array.length;i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
}