package Day8;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        while(true){
        System.out.println("Welcome to Task Manager: ");
        System.out.println("1. Add a Task ");
        System.out.println("2. View All Task ");
        System.out.println("3. Remove a Task ");
        System.out.println("0. Exit ");
        System.out.println("Enter you choice: ");


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==0){
            System.out.println("Exiting the application...");
            break;
        }
        switch (choice) {
            case 1:
                System.out.println("Please add your Task here: ");
                sc.next();
                String task = sc.nextLine();
                toDoList.add(task);
                System.out.println("Task added sucessfully");
                break;
            case 2:
                
                if(toDoList.size()==0){
                    System.out.println("Your list is empty. Please add some tasks.");
                    break;
                }
                System.out.println("Here are your all pending tasks: ");
                int i=0;
                for(String viewTask : toDoList){
                    System.out.println((i+1) +" : "+ viewTask);
                    i++;
                }
                break;
            case 3:
                System.out.println("Please enter the task No: ");
                int taskNo = sc.nextInt();
                toDoList.remove(taskNo-1);
                System.out.println("Task removed sucessfully");
                break;
            
            default:
                System.out.println("Invalid choice! Please Enter valid Choice:");
                break;
        }
        

        }
        System.out.println("Good Bye!");
        
    }
}
