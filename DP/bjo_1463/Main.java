package bjo_1463;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// index는 1부터 시작하기에 +1
		int[] dp = new int[N + 1];

		/*
		 * 0과 1일때는 연산이 필요하지 않으므로 0 
		 * 배열 생성 시 배열값은 기본 0으로 초기화 되므로 별도 초기화 하지 않겠다. 
		 * dp[0] = 0;
		 * dp[1] = 0;
		 */

		for (int i = 2; i <= N; i++) {
			// n이 나누어떨어지는 것과 관계없이 N-1을 우선 dp[i]에 넣어둔다.(연산을 하므로 +1)
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0)
				dp[i] = Math.min(dp[i / 2] + 1, dp[i]);
			if (i % 3 == 0)
				dp[i] = Math.min(dp[i / 3] + 1, dp[i]);
		}
		System.out.println(dp[N]);

	}

}
