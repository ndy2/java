package Coding_Tests.Codility;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.lang.Math;

class Solution {
	public static void main(String[] args) {
        System.out.println(solution(2147483647)) ;
		System.out.println(solution(2)) ;
        System.out.println(solution(4)) ;

	}


    public static int solution(int N) {
        // write your code in Java SE 8

        int combo = 0;
        int ans = -1;
        int r;
		boolean turn_on = false;
        while(true)
        {
            r = N%2;
            N/=2;
			// System.out.printf("%d %d\n", r,N );

			if(r==1) turn_on = true;
			if(turn_on){
				if(r==0) combo++;
				else combo = 0;
				ans = Math.max(ans,combo);
			}
			if(N==0)
				break;
        }
		return ans;
    }
	
}