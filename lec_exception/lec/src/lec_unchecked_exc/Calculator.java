package lec_unchecked_exc;

public class Calculator {
   
    //Static Method
    public static int add(int x, int y) {
        //결과의 합이 1000이 넘으면 안됨
        int res = x+y;
        if(res>1000)
            throw new over1000();
        if(res<0)
            throw new under0();
        return res;
    }

    public static int sub(int x, int y)  {
        //결과의 차가 1000이 넘으면 안됨
        int res = x-y;
        if(res>1000)
            throw new over1000();
        if(res<0)
            throw new under0();
        return res;
    }
    
    public static int mul(int x, int y) {
        return x*y;
    }

    //unched exception - divieded by zero
    public static int div(int x, int y)  {
        return x/y;
    }
}
