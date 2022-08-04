package bjo_9625;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[] aArr = new int[45];    // A의 개수
        int[] bArr = new int[45];    // B의 개수
        aArr[0] = 0;
        aArr[1] = 1;
        bArr[0] = 1;
        bArr[1] = 1;

        for (int i = 2; i < 45; i++) {
            aArr[i] = aArr[i - 2] + aArr[i - 1];
            bArr[i] = bArr[i - 2] + bArr[i - 1];
        }
        System.out.println(aArr[K - 1] + " " + bArr[K - 1]);
    }
}
