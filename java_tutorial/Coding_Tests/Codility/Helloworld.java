package Coding_Tests.Codility;

import java.util.Scanner;

public class Helloworld{	
	public static int N;
	public static int M;
	public static int[][] map;


	public static void input(){

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		sc.nextLine();
		for(int r = 0 ; r < N ; r++)
		{
			String line = sc.nextLine();
			for(int c = 0 ;c < M ; c++)
				map[r][c] = line.charAt(c)-'A';
		}
		
		sc.close();
	}
 
	public static void solve()
	{
		
	}

    public static void main(String[] args) {
        input();
		solve();
	}

	
}