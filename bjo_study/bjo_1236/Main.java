package bjo_1236;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 행
        int M = sc.nextInt(); // 열
        int row = 0;
        int col = 0;
        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        // 행에 필요한 경비수
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                row++;
            }
        }
        // 열에 필요한 경비수
        for (int i = 0; i < M; i++) {
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (map[j][i] == 'X') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                col++;
            }
        }
        // 행과 열중에 더 많이 필요한 경비 수
        System.out.println(Math.max(row, col));
    }
}



