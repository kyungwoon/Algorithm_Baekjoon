package bjo_10991;

//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//			int N = sc.nextInt();
//
//			for(int i = 0; i < N; i++) {
//				for(int j = 1; j < N-i; j++) {
//					System.out.print(" ");
//				}for(int k = 0; k < i+1; k++) {
//					System.out.print("* ");
//				}
//				System.out.println();
//			}
//	}
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = i; j < N; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                if (k % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
