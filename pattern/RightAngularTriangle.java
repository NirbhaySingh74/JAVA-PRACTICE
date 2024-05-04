package pattern;

import java.util.Scanner;

public class RightAngularTriangle {
    public static void RightAngularTriangl(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        RightAngularTriangl(n);
        sc.close();
    }
}
