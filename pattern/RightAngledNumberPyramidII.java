package pattern;

import java.util.Scanner;

public class RightAngledNumberPyramidII {
    public static void RightAngleNumberPyramidII(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        RightAngleNumberPyramidII(n);
    }
}
