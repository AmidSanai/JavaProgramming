package sesson12;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //making Task and Scanner
        Task task = new Task();
        Scanner scan = new Scanner(System.in);
        //the user is learning what to do :|
        System.out.println("a : for adding task");
        System.out.println("r : for removing task");
        System.out.println("d : for deleting task");
        System.out.println("c : for check the task");
        System.out.println("sa : to see all tasks");
        System.out.println("sd : to see done task tasks");
        System.out.println("sde : to see deleted tasks");
        System.out.println("cr : for checking your recycleBin");
        System.out.println("e : for exiting");
        //the computer is asking for what to do
        String answer = scan.nextLine();
        switch (answer){
            case "a":

        }
    }
}
