package chapter_2_정수론_조합론_그리디_브루트포.bjo_11050_이항계수;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    1. 아항계수? 주어진 크기의 (순서 없는) 조합의 가짓수
    2. N과 K가 주어질때 N! / K! * (N-K)!
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        System.out.println(factorial(N) / (factorial(K) * factorial(N - K)));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}
