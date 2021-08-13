package lec_try_catch;

public class Program {
    public static void main(String[] args)  {
        int res=0;
        try{
            res = Calculator.add(3,-4);
            System.out.printf("add : %d\n", res);
            res = Calculator.sub(3,-4);
            System.out.printf("sub : %d\n", res);
        }
        catch(over1000 | under0 e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
        }
        finally{
            System.out.println("입력 값에 오류가 있습니다.");
        }        
        res = Calculator.mul(3,4);
        System.out.printf("mul : %d\n", res);
        res = Calculator.div(3,0);
        System.out.printf("div : %d\n", res);
        
    }
}
