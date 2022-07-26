package bjo_1568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = 1;
        int count = 0;

        while (N != 0) {
            N -= K;
            K++;
            count++;
            if (N < K) {
                K = 1;
            }
        }
        System.out.println(count);
    }
}
