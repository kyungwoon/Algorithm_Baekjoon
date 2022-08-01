package bjo_10103;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int A_sum = 100;
        int B_sum = 100;

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());

            if (A > B) {
                B_sum -= A;
            } else if (A < B) {
                A_sum -= B;
            } else if (A == B) {
                continue;
            }
        }

        System.out.println(A_sum);
        System.out.println(B_sum);
    }
}
