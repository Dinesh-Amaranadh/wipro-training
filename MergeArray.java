//Task 6
import java.util.*;
public class MergeArray{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int [] array1 = new int[n];
        for(int i=0;i<n;i++){
            array1[i] = scan.nextInt();
        }
        int [] array2 = new int[n];
        for(int i=0;i<m;i++){
            array2[i] = scan.nextInt();
        }
        int[] mergedArray = mergeSortedArrays(array1, array2);
        
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        scan.close();
    }
    
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        
        int[] mergedArray = new int[n1 + n2]; 

        int i = 0, j = 0, k = 0;

       
        while (i < n1 && j < n2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

       
        while (i < n1) {
            mergedArray[k++] = array1[i++];
        }

       
        while (j < n2) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;
    }
}