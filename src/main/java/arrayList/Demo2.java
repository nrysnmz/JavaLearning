package arrayList;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();   //"Set" does not let execute the same value twice."4" is executed once.It is a collection of a unique value.You CAN'T have index value.
        nums.add(5);
        nums.add(2);
        nums.add(1);
        nums.add(4);

        for (int n : nums){

            System.out.println(n);
        }
    }
}
