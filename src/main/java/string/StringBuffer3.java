package string;

public class StringBuffer3
{
    public static void main(String[] args)
    {
        StringBuffer sb =new StringBuffer("Nuray");
        sb.append(" Korganci");
        System.out.println(sb);
        //sb.deleteCharAt(3);
       // System.out.println(sb);
        sb.insert(0,"Java ");
        System.out.println(sb);
    }
}
