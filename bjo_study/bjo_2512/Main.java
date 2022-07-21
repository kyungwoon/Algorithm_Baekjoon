package bjo_2512;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int A_count = 0;
        int B_count = 0;
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (A[i] > B[i]) {
                A_count += 3;
            } else if (A[i] < B[i]) {
                B_count += 3;
            } else if (A[i] == B[i]) {
                A_count += 1;
                B_count += 1;
            }
        }
        System.out.println(A_count + " " + B_count);

        if (A_count > B_count) {
            System.out.println("A");
        } else if (B_count > A_count) {
            System.out.println("B");
        } else if ((A_count == B_count)) {
            boolean round = true;
            for (int i = 9; i >= 0; i--) {
                if (A[i] > B[i]) {
                    System.out.println("A");
                    round = false;
                    break;
                } else if (B[i] > A[i]) {
                    System.out.println("B");
                    round = false;
                    break;
                }
            }
            if (round) {
                System.out.println("D");
            }
        }
    }
}

