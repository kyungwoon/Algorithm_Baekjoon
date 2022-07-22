package bjo_2857;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("FBI")) {
                System.out.print(i + 1 + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("HE GOT AWAY!");
        }
    }
}