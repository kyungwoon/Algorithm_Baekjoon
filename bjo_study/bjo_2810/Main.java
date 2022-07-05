package bjo_2810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int count = 1;

        for (int i = 0; i < T; i++) {
            if (str.charAt(i) == 'S') {
                count++;
            } else if (str.charAt(i) == 'L') {
                count++;
                i++;
            }
        }
        if (count > T) {
            System.out.println(T);
        } else {
            System.out.println(count);
        }

    }
}