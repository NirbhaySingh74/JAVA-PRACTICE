
import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int num) {
        int facSum = 1;
        for (int i = 1; i <= num; i++) {
            facSum *= i;
        }
        return facSum;
    }

    public static int findFactorialWithRecursion(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * findFactorialWithRecursion(num - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = findFactorial(num);
        int result2 = findFactorialWithRecursion(num);
        System.out.println("Factorial of " + num + " is: " + result);
        System.out.println("Factorial of " + num + " is: " + result2);
    }
}
