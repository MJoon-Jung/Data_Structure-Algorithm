package BAEKJOON;

import java.util.Scanner;

//BEAKJOON Problem 15990
public class PlusOneTwoThree5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int [][]dp = new int [100001][4];
	
		dp[1][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
		
		for(int i = 4; i < dp.length; i++) {
			dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
			dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
			dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
		}

		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int answer = (dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009;
			sb.append(answer + "\n");
		}
		
		System.out.println(sb);
	}
}
