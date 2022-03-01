package chapter_1_기본수학.bjo_2893_설탕배달;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
1. 최대한 5kg으로 운반 해야한다.
2. 5로 나누어 떨어질때 / 5로 나누어서 나머지가 1고 또는 3일때 / 5로 나누어서 나머지가 2 또는 4일때
3. 4와 7일때는 운반 불가
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        if (N == 4 || N == 7) {
            cnt = -1;
        } else if (N % 5 == 0) {
            cnt = N / 5;

        } else if (N % 5 == 1 || N % 5 == 3) {
            cnt = (N / 5) + 1;

        } else if (N % 5 == 2 || N % 5 == 4) {
            cnt = (N / 5) + 2;
        }
        System.out.println(cnt);
    }
}


        /* 다른 풀이
        while (true) {
            if (N % 5 == 0) {
                System.out.println(N/5 + cnt);
                break;

            } else if (N < 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            cnt++;
        }
         */





