package sesson12;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        //making Task and Scanner
        //making an object of to do list class
        ToDoList list =  new ToDoList();
        Scanner scan = new Scanner(System.in);
        //the user is learning what to do :|
        System.out.println("1: for adding task");
        System.out.println("2 : for removing task");
        System.out.println("3: for check the task");
        System.out.println("4 : to see all tasks");
        System.out.println("5 : to see done tasks");
        System.out.println("6 : for checking your recycleBin");
        System.out.println("7 : for exiting");
        //the computer is asking for what to do
        System.out.println("----------------------------");
        boolean x = true;
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
                    int i = 1;
                    for (Task t : list.getTasks()) {
                        System.out.print(i++);
                        System.out.println("-" + t.toString());
                    }
                    System.out.println(list.getTasks());
                    int numberOfRemovedTask = scan.nextInt();
                    int numberOfRemovedTaskMinesOne = numberOfRemovedTask - 1;
                    list.removeTask(numberOfRemovedTaskMinesOne);
                    System.out.println("TASK REMOVED.");
                    break;
                case 3:
                    System.out.println("----------------------------");
                    System.out.println("Enter the number of the done task.");
                    int numberOfDoneTask = scan.nextInt();
                    list.isDone(numberOfDoneTask);
                    System.out.println("TASK CHECKED.");
                    break;
                case 4:
                    int ii = 1;
                    for (Task t : list.getTasks()) {
                        System.out.print(ii++);
                        System.out.println("-" + t.toString());
                    }
                    break;
                case 5:
                    System.out.println(list.getDoneTasks());
                    break;
                case 6:
                    System.out.println(list.getDeletedTasks());
                    break;
                case 7:
                    x = false;
            }
        } while (x);
    }
}
