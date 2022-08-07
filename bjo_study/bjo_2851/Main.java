package bjo_2851;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mush = new int[10];
        int sum;		// 각 버섯별 총 점수
        int result;		// 최종 점수
        int eat = 1;	// 버섯순서 ++
        int compare1;	// 버섯 점수 비교 변수
        int compare2;	// 버섯 점수 비교 변수

        for(int i=0; i<mush.length; i++) {
            mush[i] = Integer.parseInt(br.readLine());
        }

        result = mush[0];

        for(int i=0; i<mush.length; i++) {
            sum = 0;
            if(eat == 10)	// 버섯이 총 10개이므로 10개일때 탈출
                break;

            /* 각 버섯별 총 점수
             *  첫번째 + 두번째
             *  첫번째 + 두번째 + 세번째
             *  첫번째 + 두번째 + 세번째 + 네번째 ...
             */
            for(int j=0; j<=eat; j++)
                sum += mush[j];

            // 점수가 100 => 탈출
            if(sum == 100) {
                result = sum;
                break;
            }

            // 버섯의 총 점수가 100보다 큰경우도 있으므로 절댓값으로 판단함
            compare1 = Math.abs(100 - result);
            compare2 = Math.abs(100 - sum);

            // 버섯 점수의 총 합이 100에 근사한 값 찾기
            if(compare1 >= compare2)
                result = sum;
            eat ++;
        }

        System.out.println(result);
    }
}
