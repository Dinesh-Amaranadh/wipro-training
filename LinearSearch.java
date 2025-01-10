//Task 2
import java.util.*;
public class LinearSearch{
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        
        int elementToSearch = scan.nextInt();
        
        boolean present = linaerSearch(array,elementToSearch);
        
        if(present){
            System.out.println("Element is available");
        }else{
            System.out.println("Element is not available");
        }
        scan.close();
    }
    
    public static boolean linaerSearch(int[] array, int element){
        for(int i=0;i<array.length;i++){
            int currentElement = array[i];
            if(currentElement == element){
                return true;
            }
        }
        return false;
    }
}