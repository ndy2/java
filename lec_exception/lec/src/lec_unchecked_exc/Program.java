package lec_unchecked_exc;

public class Program {
    public static void main(String[] args)  {
        int res=0;
        
        // try{
        res = Calculator.add(3,10003);
        System.out.printf("add : %d\n", res);
        res = Calculator.sub(3,-4);
        System.out.printf("sub : %d\n", res);
        // }

        res = Calculator.mul(3,4);
        System.out.printf("mul : %d\n", res);
        res = Calculator.div(3,4);
        System.out.printf("div : %d\n", res);
        
    }
}
