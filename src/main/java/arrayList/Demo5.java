package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {     //If you want to sort the numbers according to their last digit in other words if you want to specify your own logic, you have to pass an
                if(i%10>j%10)                               //"OBJECT of a COMPARATOR
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(63);
        nums.add(95);
        nums.add(48);
        nums.add(81);

        Collections.sort(nums,com);

        System.out.println(nums);
    }
}
