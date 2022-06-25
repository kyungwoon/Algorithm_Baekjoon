package bjo_2711;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            String str = sc.next();

            System.out.println(str.substring(0, A - 1) + str.substring(A, str.length()));
        }

    }
}