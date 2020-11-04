package sesson15;

import java.util.ArrayList;
import java.util.List;

public class PracticeOfArrayList {

    public static void main(String[] args) {
        //Out list
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("yellow");
        colors.add("Green");
        colors.add("Blue");
        //Print them out
        int i = 1;
        int i1 = 0;
        do {
            System.out.print(i++);
            System.out.print("-");
            System.out.println(colors.get(i1++));
        }while (i <= colors.size());

    }
}
