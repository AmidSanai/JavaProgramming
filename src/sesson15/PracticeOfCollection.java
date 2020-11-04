package sesson15;

import java.util.HashMap;
import java.util.Map;

public class PracticeOfCollection {
    public static void main(String[] args) {
        Map<String, Integer> family = new HashMap<>();
        family.put("Youngest children", 13);
        family.put("Oldest children", 18);
        family.put("Mom", 44);
        family.put("Dad", 47);
        //Printing
        System.out.println(family);
    }
}
