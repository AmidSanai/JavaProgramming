package practice;

import java.util.Scanner;

public class Passage {

    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //asking for drawing
        System.out.println("Draw the people who are walking through the passage.");
        System.out.println("e.g = --->---<");
        System.out.println("<&> for person who is walking and - for distance between people.");
        //string of passage
        String peopleInPassage = scan.nextLine();
        System.out.println(helloNum(peopleInPassage));
    }

    public static int helloNum(String peopleInPassage){
        int pipLength = peopleInPassage.length();
        char charPIP;
        int bigger = 0;
        int oneSideHello = 0;
        int twoSideHello = 0;
        for (int i = 0; i < pipLength; i++){
            charPIP = peopleInPassage.charAt(i);
            if (charPIP == '>'){
                bigger += 2;
            }
            else if (charPIP == '<'){
                oneSideHello = oneSideHello + bigger;
            }
        }
        twoSideHello = oneSideHello;
        return twoSideHello;
    }
}