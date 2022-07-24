package bjo_10102;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int A = 0;
        int B = 0;
        String result = sc.next();

        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == 'A') {
                A++;
            } else if (result.charAt(i) == 'B') {
                B++;
            }
        }
        if (A > B) {
            System.out.println("A");
        } else if (B > A) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}