package pattern;

import java.util.Scanner;

public class RightTriangleStar {
    public static void printRightTrangleStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N  :");
        int n = sc.nextInt();
        printRightTrangleStar(n);
        sc.close();
    }
}
