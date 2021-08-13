package lec_exc;

public class Program {
    public static void main(String[] args) throws over1000, under0 {
        // Calculator calc = new Calculator(3,4);
        //Instance Method
        // calc.add();

        int res;
        //Static Method
        res = Calculator.add(3,-4);
        System.out.printf("add : %d\n", res);
        res = Calculator.sub(3,4);
        System.out.printf("sub : %d\n", res);
        res = Calculator.mul(3,4);
        System.out.printf("mul : %d\n", res);
        res = Calculator.div(3,4);
        System.out.printf("div : %d\n", res);
        
    }
}
