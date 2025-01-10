//Task 3
import java.util.*;
public class SecondLargest{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        int largest = array[0];
        int secondLargest = array[0];
        
         for (int num : array) {
            if (num > largest) {
                secondLargest = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;      // Update second largest if num is between largest and second largest
            }
        }
        
        System.out.println(secondLargest);
        scan.close();
        
    }
}