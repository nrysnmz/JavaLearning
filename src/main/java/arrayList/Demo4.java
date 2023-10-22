package arrayList;
import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Mike", 98);                             //"Map" is not following the sequence.
        students.put("Adam", 37);
        students.put("Sue", 83);                                  //"Keys" are unique.Here the key is "Sue". Keys are set.Values "83" are list.   set + list =map
        students.put("Paul", 76);
        System.out.println(students);
        System.out.println(students.get("Paul"));                       //If you want to fetch a particular student you can use this method."students.get("Paul")"

        System.out.println(students.keySet());

        for (String name : students.keySet())
        {
            System.out.println(name+ " : " + students.get(name));
        }
    }
}

