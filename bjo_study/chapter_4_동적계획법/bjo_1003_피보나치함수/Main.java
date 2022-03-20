package chapter_4_동적계획법.bjo_1003_피보나치함수;

/*
* N번째 피보나치 수를 구하는 C++ 함수 *
====================================================================
    int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
====================================================================

    1. 피보나치 / 0, 1, 1, 2, 3, 5, 8, 13 , 21....
    2. fibonacci(3) = fibonacci(2) + fibonacci(1)
       fibonacci(3) = fibonacci(1) + fibonacci(0) + fibonacci(1)
                        1 / 1           0 / 0           1 / 1    => 1 + 1 = 2
    2. 0.25초라는 시간 제한이 있기에 메모이제이션 사용
       fibonacci(4) = fibonacci(3) + fibonacci(2)

    3. 점화식
        dp[3][0] = dp[2][0] + dp[1][0];
        dp[3][1] = dp[2][1] + dp[1][1];


        dp[i][0] = dp[i-1][0] + dp[i-2][0];
        dp[i][1] = dp[i-1][1] + dp[i-2][1];

 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        dp[0][0] = 1;
        dp[0][1] = 0;    // N=0 일 때의 0과 1의 갯수
        dp[1][0] = 0;
        dp[1][1] = 1;   // N=1 일 때의 0과 1의 갯수

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append('\n');
//            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
        System.out.println(sb);
    }

    static Integer[] fibonacci(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibonacci(N - 1)[0] + fibonacci(N - 2)[0];
            dp[N][1] = fibonacci(N - 1)[1] + fibonacci(N - 2)[1];
        }
        return dp[N];

    }

}
