package bjo_15969;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int result = arr[arr.length - 1] - arr[0];
        System.out.println(result);
    }
}


