package bjo_11557;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int max = 0;
            String max_name = "";
            for (int j = 0; j < N; j++) {
                String str = sc.next();
                int amount = sc.nextInt();
                if (amount > max) {
                    max = amount;
                    max_name = str;
                }

            }
            System.out.println(max_name);
        }
    }
}

