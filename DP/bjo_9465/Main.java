package bjo_9465;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());

			int[][] dp = new int[2][n + 1];

			for (int j = 0; j < 2; j++) {
				String[] str = br.readLine().split(" ");
				for (int k = 1; k <= n; k++) {
					dp[j][k] = Integer.parseInt(str[k - 1]);
				}
			}

			for (int k = 2; k <= n; k++) {
				dp[0][k] = Math.max(dp[1][k - 1], dp[1][k - 2]) + dp[0][k];
				dp[1][k] = Math.max(dp[0][k - 1], dp[0][k - 2]) + dp[1][k];
			}

			System.out.println(Math.max(dp[0][n], dp[1][n]));

		}

	}

}