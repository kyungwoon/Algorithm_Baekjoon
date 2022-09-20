package bjo_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 입력받을 수만큼 배열 생성
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 최소값 최대값을 구하기 위해 sort
		Arrays.sort(arr);

		System.out.println(arr[0] + " " + arr[arr.length - 1]);

	}

}
