//Task 1
//deleteElement(array, 3);
import java.util.*;
public class DeleteElement{
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scan.nextInt();
        }
        
        int indexToDelete = scan.nextInt();
        
        System.out.println("Elements before deleting : ");
        for(int i=0;i<n;i++){
           System.out.println(array[i]+" ");
        }
        array = deleteElement(array, indexToDelete);
        
         System.out.println("Elements After deleting : ");
        for(int i=0;i<n-1;i++){
           System.out.println(array[i]+" ");
        }
        scan.close();
        
    }
    
    public static int[] deleteElement(int[] array,int index){
        
         if (index < 0 || index >= array.length) {
            System.out.println("Invalid index");
            return array;
        }

        int newArray[] = new int[array.length-1];
        
        for(int i =0;i<index;i++){
            newArray[i] =array[i];
        }
        
        for(int i=index+1;i<array.length;i++){
            newArray[i-1] = array[i];
        }
        return newArray;
        
    }
}