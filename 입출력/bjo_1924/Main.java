package bjo_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int inputMonth = Integer.parseInt(st.nextToken());
		int inputDay = Integer.parseInt(st.nextToken());

		int[] monthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

		int allDay = 0;
		for (int i = 0; i < inputMonth - 1; i++) {
			allDay += monthDay[i];
		}

		allDay += inputDay;

		System.out.println(week[allDay % 7]);

	}

}
