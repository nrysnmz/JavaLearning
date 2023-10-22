package arrayList;

import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class Demo3 {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(58);
        nums.add(29);
        nums.add(14);
        nums.add(42);

        Iterator<Integer> values = nums.iterator();

        while (values.hasNext())
            System.out.println(values.next());


//            for (int n : nums){
//                System.out.println(n);
//            }
    }
}


