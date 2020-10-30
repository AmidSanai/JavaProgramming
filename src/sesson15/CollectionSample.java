package sesson15;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        //All of this are Collection's
        //Set's
        Set<String> testSet = new HashSet<>();
        testSet.add("Erfan");
        testSet.add("Mostafa");
        testSet.add("Amid");
        System.out.println(testSet.contains("Amid"));
        System.out.println(testSet.remove("Amid"));
        System.out.println(testSet.removeAll(testSet));
        System.out.println(testSet);
        //List's
        List<String> testList = new ArrayList<>();
        testList.add("Erfan");
        testList.add("Erfan");
        testList.add("Mostafa");
        testList.add("Amid");
        testList.add("Mostafa");
        testList.add("Mostafa");
        testList.add("Erfan");
        testList.add("Erfan");
        //...
        testList.add(3, "Soroush");
        //Pay attention on S int CollectionS
        Collections.sort(testList);
        Collections.swap(testList, 3, 5);
        System.out.println(testList);
        System.out.println(testList.indexOf("Amid"));

        Set<String> testSetNew = new HashSet<>(testList);
        System.out.println(testSetNew);
        //Map
        Map<String, String> address = new HashMap<>();
        address.put("Erfan", "Town1");
        address.put("Amid", "Town2");
        address.put("Mostafa", "Town3");
        address.put("Soroush", "Town4");
        System.out.println(address);
    }
}
