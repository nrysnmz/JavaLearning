public class ArrayOfObject
{
    public static void main(String[] args)
    {
        int nums[]= new int[8];
        nums[0]=4;
        nums[1]=5;
        nums[2]=2;
        nums[3]=7;
        for (int i=0;i<nums.length;i++)      //nums.length (this helps you not to make mistake about the size of the array.it automatically makes the arrays indicated in here:new int[6]
        {
            System.out.println(nums[i]);
        }

    }
}
