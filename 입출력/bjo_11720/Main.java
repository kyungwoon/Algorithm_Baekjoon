package bjo_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String strInput = br.readLine();

		int sum = 0;

		for (int i = 0; i < T; i++) {
			sum += strInput.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}