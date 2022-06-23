package bjo_1919;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();

        int[] arr = new int[26];

        for (int i = 0; i < A.length(); i++) {
            arr[A.charAt(i) - 'a']++;
        }
        for (int j = 0; j < B.length(); j++) {
            arr[B.charAt(j) - 'a']--;
        }

        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            sum += Math.abs(arr[k]);
        }
        System.out.println(sum);
    }
}

