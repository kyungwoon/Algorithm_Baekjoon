package bjo_2846;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int result = 0;
        int [] arr = new int [N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] < arr[i]) {
                sum += arr[i] - arr[i-1];
            }else {
                result = Math.max(result, sum);
                sum = 0;
            }
        }
        result = Math.max(result, sum);
        System.out.println(result);

    }
}
