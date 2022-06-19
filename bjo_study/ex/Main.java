package ex;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;

        for (int i = 0; i < T; i++) {
            int[] arr = new int[2];
            for (int j = 0; j < 2; j++) {
                arr[j] = sc.nextInt();
            }
            if (arr[0] > 0 && arr[1] > 0) {
                Q1++;
            } else if (arr[0] < 0 && arr[1] > 0) {
                Q2++;
            }
            if (arr[0] < 0 && arr[1] < 0) {
                Q3++;
            }
            if (arr[0] > 0 && arr[1] < 0) {
                Q4++;
            } else if (arr[0] == 0 || arr[1] == 0) {
                AXIS++;
            }
        }


        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        System.out.println("Q3: " + Q3);
        System.out.println("Q4: " + Q4);
        System.out.println("AXIS: " + AXIS);
    }
}

