package lamdaExpression;

interface H {
    int add(int i, int j);
}

public class MultipleVariable {
    public static void main(String[] args) {
//        H obj = (int i, int j) ->                              //You can use return with a LAMBDA EXPRESSION.The code here itself is long.
//        {return  i+j;};
//                int result= obj.add(8,9);
//        System.out.println(result);
        H obj = (i, j) -> i + j;                                      //You can even use this code.This includes return(i+j) but we do not need to write it here.The code up is also correct
        int result = obj.add(8, 9);                              //but long.
        System.out.println(result);
    }
}

