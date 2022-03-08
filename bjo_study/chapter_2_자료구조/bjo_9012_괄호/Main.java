package chapter_2_자료구조.bjo_9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    1. 여는 괄호가 나오면 스택에 push
    2. 닫는 괄호가 나오면 스택에 값이 있다면 pop / 비어있다면 push하고 반복문 종료
    3. 최종, 스택이 비어있는지, 남았는지 확인 후 "YES" , "NO"출력
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String vps = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < vps.length(); j++) {
                if (vps.charAt(j) == '(') {
                    stack.push(vps.charAt(j));
                } else {
                    if (!stack.empty()) {
                        stack.pop();
                    } else {
                        stack.push(vps.charAt(j));
                        break;
                    }
                }
            }
            if (stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

}