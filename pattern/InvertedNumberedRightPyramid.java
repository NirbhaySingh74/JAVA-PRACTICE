package pattern;

import java.util.Scanner;

public class InvertedNumberedRightPyramid {
    public static void InvertedNumberedRightPyrami(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        InvertedNumberedRightPyrami(n);
    }
}
