package chapter_1_기본수학.bjo_1110_더하기사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
