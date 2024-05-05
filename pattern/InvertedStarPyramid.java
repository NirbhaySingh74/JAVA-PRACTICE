package pattern;

import java.util.Scanner;

public class InvertedStarPyramid {
    public static void InvertStarPyrmid(int n) {
        for (int i = n; i <= n; i--) {
            // for the space
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            // for the star
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            // for the space
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        InvertStarPyrmid(n);
    }
}
