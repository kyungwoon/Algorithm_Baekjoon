package bjo_2979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;
        int max = 0;
        int[] arr = new int[101];

        for (int i = 0; i < 3; i++) {
            int start = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine());
            min = Math.min(min, start);
            max = Math.max(max, end);
            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }
        for (int i = min; i < max; i++) {
            if (arr[i] == 1) {
                sum += arr[i] * A;
            } else if (arr[i] == 2) {
                sum += arr[i] * B;
            } else if (arr[i] == 3) {
                sum += arr[i] * C;
            }
        }
        System.out.println(sum);
    }
}
