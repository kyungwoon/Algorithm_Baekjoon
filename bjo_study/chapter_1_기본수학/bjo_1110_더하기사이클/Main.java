package chapter_1_기본수학.bjo_1110_더하기사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1. 주어진 값을 십의 자리, 일의 자리를 각각 구하고 더해준다.
    2. temp값을 (1번에서 구한 일의 자리) +(합의 일의 자리)로 초기화 해준다.
    3. 반복문으로 1,2번을 반복하면서  temp값과 최초 주어진 N값과 동일할 때까지 반복
 */

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int temp = N;

        while (true) {
            int left = temp / 10;
            int right = temp % 10;
            int sum = left + right;

            temp = (right * 10) + (sum % 10);
            count++;

            if (temp == N) {
                break;
            }
        }
        System.out.println(count);
    }
}
