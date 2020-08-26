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
        helloNum(peopleInPassage);
    }

    public static int helloNum(String peopleInPassage){
        int PINLength = peopleInPassage.length();
        char charPIN;
        int bigger = 0;
        int helloNumber;
        for (int i = 0; i <= PINLength; i++){
            charPIN = peopleInPassage.charAt(i);
            if (charPIN == '>'){
                bigger++;
            }
            else if (charPIN == '<'){
                if (bigger == 0){
                    continue;
                }
                else{
                   bigger++;
                }
            }
        }
        return bigger++;
    }
}