package bjo_2526;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        int P = sc.nextInt();
        int num = N;
        int result = 0;

        while (true) {
            list.add(num);
            num = (num * N) % P;
            if (list.contains(num)) {
                result = list.indexOf(num);
                break;
            }
        }
        System.out.println(list.size() - result);
    }
}
