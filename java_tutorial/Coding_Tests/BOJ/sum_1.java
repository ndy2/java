package Coding_Tests.BOJ;

import java.util.*;

public class sum_1 {
    public static int[] arr = new int[1001];
    public static int A,B;

    public static void input()
    {
		Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        sc.close();
    }

    public static void init_arr()
    {
        int cnt = 0;
        int num = 1;
        for(int i = 1  ; i<=1000 ; i++)
        {
            arr[i] = num;
            cnt++;
            if(cnt==num)
            {
                cnt = 0;
                num++;
            }
        }
    }

    public static void solve()
    {
        init_arr();
        int ans = 0;
        for(int i = A ; i <=B; i++)
            ans+=arr[i];
        System.out.print(ans);
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
