package sesson12;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        //making Task and Scanner
        //making an object of to do list class
        ToDoList list =  new ToDoList();
        Scanner scan = new Scanner(System.in);
        //the user is learning what to do :|
        System.out.println("1: for adding task");
        System.out.println("2 : for removing task");
        System.out.println("3: for deleting task");
        System.out.println("4: for check the task");
        System.out.println("5 : to see all tasks");
        System.out.println("6 : to see done task tasks");
        System.out.println("7 : to see deleted tasks");
        System.out.println("8 : for checking your recycleBin");
        System.out.println("0: for exiting");
        //the computer is asking for what to do
        System.out.println("----------------------------");
        do {
            System.out.println("Enter the number.");
            int number = scan.nextInt();
            scan.nextLine();
            switch (number) {
                case 1:
                    Task task = new Task();
                    System.out.println("Now enter your Task.");
                    String desc = scan.nextLine();
                    task.setNameOfTask(desc);
                    list.addTask(task);
                    System.out.println("[" + desc + "]");
                    break;
                case 2:
                    System.out.println("----------------------------");
                    System.out.println("Enter the number of the Task");
                    System.out.println(list.getTasks());
                    int numberOfRemovedTask = scan.nextInt();
                    list.removeTask(numberOfRemovedTask);
                    System.out.println("REMOVING YOUR TASK...");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("TASK REMOVED");
                    break;
            }
        } while (true);
    }
}