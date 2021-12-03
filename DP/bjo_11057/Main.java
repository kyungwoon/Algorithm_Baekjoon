package bjo_11057;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long[][] dp = new long[N + 1][10];
		for (int i = 0; i <= 9; i++) {
			dp[1][i] = 1;
		}

		for (int i = 2; i <= N; i++) { // 2부터 N까지 반복
			for (int j = 0; j <= 9; j++) { // dp[N][0~9까지]
				for (int k = j; k <= 9; k++) { // j부터 9까지 더해준다
					dp[i][j] += dp[i - 1][k] % 10007;
				}
			}
		}

		// N자리의 전체 합
		long result = 0;
		for (int i = 0; i <= 9; i++) {
			result += dp[N][i];

		}
		System.out.println(result % 10007);

	}

}
