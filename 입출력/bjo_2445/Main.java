package bjo_2445;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) { // 상단 별
            for (int j = 0; j < i; j++) { // 상단 좌측 별
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (N - i); k++) { // 상단 사이 공백
                System.out.print(" ");
            }
            for (int h = 1; h <= i; h++) { // 상단 우측 별
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) { // 하단 별
            for (int j = i; j < N; j++) { //하단 왼쪽 별
                System.out.print("*");
            }
            for (int k = 0; k < 2 * i; k++) { // 하단 사이 공백
                System.out.print(" ");
            }
            for (int h = i; h < N; h++) { // 하단 우측 별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
