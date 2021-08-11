package Coding_Tests.BOJ;

import java.util.*;

public class represent {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> num2cnt = new HashMap<>();
        int cur;
        int sum = 0;
        cur = sc.nextInt();

        int repr=cur;
        for(int r = 0 ; r < 9 ; r++)
        {
            sum +=cur;
            if(!num2cnt.containsKey(cur))
                num2cnt.put(cur,1);
            else 
                num2cnt.replace(cur, num2cnt.get(cur)+1);
            if(num2cnt.get(repr) < num2cnt.get(cur))
                repr = cur;
            cur = sc.nextInt();
        }
        sum +=cur;

        System.out.println(sum/10);
        System.out.println(repr);
        
        sc.close();
    }
}
