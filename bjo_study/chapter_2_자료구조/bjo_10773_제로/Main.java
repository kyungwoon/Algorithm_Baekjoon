package chapter_2_자료구조.bjo_10773_제로;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < K; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number == 0) {
                st.pop();
            }else {
                st.push(number);
            }
        }
        int sum = 0;
        for(int result : st) {
            sum += result;
        }
        System.out.println(sum);
    }
}
