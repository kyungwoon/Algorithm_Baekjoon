package bjo_17608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stick = new int[N];

        for (int i = 0; i < N; i++) {
            stick[i] = Integer.parseInt(br.readLine());
        }

        int count = 1;
        int max_stick = stick[stick.length - 1];

        for (int i = 1; i < stick.length; i++) {
            if (max_stick < stick[stick.length - i - 1]) {
                count++;
                max_stick = stick[stick.length - i - 1];
            }
        }
        System.out.println(count);
    }
}
