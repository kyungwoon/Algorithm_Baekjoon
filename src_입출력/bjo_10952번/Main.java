package bjo_10952번;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), ",");

			int firstInput = Integer.parseInt(st.nextToken());
			int secondInput = Integer.parseInt(st.nextToken());
			
			System.out.println(firstInput + secondInput);
		}
	}

}
