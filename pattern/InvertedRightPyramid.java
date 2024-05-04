package pattern;

import java.util.Scanner;

public class InvertedRightPyramid {
    public static void InvertedRightPyrmid(int n) {
        for (int i = n; i >= 1; i--) {
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
        InvertedRightPyrmid(n);
    }
}
