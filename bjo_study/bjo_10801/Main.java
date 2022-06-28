package bjo_10801;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] A_arr = new int[10];
        int[] B_arr = new int[10];

        for (int i = 0; i < 10; i++) {
            A_arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            B_arr[i] = sc.nextInt();
        }
        int A_count = 0;
        int B_count = 0;
        for (int i = 0; i < 10; i++) {
            if (A_arr[i] > B_arr[i]) {
                A_count++;
            } else if (A_arr[i] < B_arr[i]) {
                B_count++;
            }
        }
        if (A_count > B_count) {
            System.out.println("A");
        } else if (A_count < B_count) {
            System.out.println("B");
        } else {
            System.out.println("D");
        }
    }
}
