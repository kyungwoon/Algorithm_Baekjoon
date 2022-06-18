import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("x에서 : ");
        int x = sc.nextInt();

        System.out.print("y까지 : ");
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= y - i; j++) {
                System.out.print(" ");

            }
            for (int k = i; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        System.out.println("x에서 :" + x);
//        System.out.println("y까지 :" + y);
//
//        for (int i = x; i <= y; i++) {
//            for (int j = 1; j <= y - i; j++) {
//                System.out.print(" ");
//
//            }
//            for (int k = x; k > 0; k--) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//    }
//}