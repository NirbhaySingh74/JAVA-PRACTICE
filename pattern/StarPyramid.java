package pattern;

import java.util.Scanner;

public class StarPyramid {
    public static void StarPyrmid(int n) {
        for (int i = 1; i <= n; i++) {
            // for the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for the star
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            // for the space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        StarPyrmid(n);
        sc.close();
    }
}
