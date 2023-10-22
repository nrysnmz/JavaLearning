package arrayList;
import java.util.*;

public class Demo6 {
    public static void main(String[] args) {
        Comparator<String> byLength = new Comparator<String>() {
            public int compare(String a, String b) {
                return a.length() - b.length();
            }
        };
        List<String> fruit= new ArrayList<>();
        fruit.add("Watermelon");
        fruit.add("Melon");
        fruit.add("Banana");
        fruit.add("Pear");

        System.out.println("The original list without sorting.");
        System.out.println(fruit);

        Collections.sort(fruit, byLength);
        System.out.println("The same list after sorting the String by length.");
        System.out.println(fruit);

    }
}
