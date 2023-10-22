package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IndexValueWithList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();    // List supports index value.We use "List" instead of "Collection" if we want to work with index value.
        nums.add(8);
        nums.add(9);
        nums.add(3);
        nums.add(6);

        System.out.println(nums.indexOf(9));

        System.out.println(nums.get(2));
//        for (Object n : nums) {
//            int num = (Integer) n;
//            System.out.println(num * 2);
//        }
    }
}
