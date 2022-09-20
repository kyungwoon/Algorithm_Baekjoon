package bjo_2442;

import java.util.Scanner;


public class Main{	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int line = 1; line <= N; line++) {
			for(int blank = 1; blank <= N-line; blank++) {
				System.out.print(" ");
			}
			for(int star = 1; star <= line*2-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}