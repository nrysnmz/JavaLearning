package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();                //"List" support repeated values.
        nums.add(5);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        nums.add(9);

//        System.out.println(nums.indexOf(5));
//        System.out.println(nums.get(2));
        for (Object n : nums)
        {
            int num = (Integer) n;
            System.out.println(num * 2);

        }
    }
}
