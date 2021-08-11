package Coding_Tests.BOJ;

import java.util.*;

public class train {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ans = 0;
        int cur = 0;
        int in,out;
        for(int r = 0 ; r < 10 ; r++)
        {
            out = sc.nextInt();
            in = sc.nextInt();
            cur -=out;
            cur +=in;
            ans = Math.max(cur, ans);
            
        }
        System.out.print(ans);
        sc.close();
    }
}
