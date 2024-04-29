import java.util.Scanner;

public class FindLargest {
    public static void findLargestNum(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greater number");
        } else if (b > c) {
            System.out.println("B is greater number");
        } else {
            System.out.println("C is greater number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = sc.nextInt();
        System.out.println("Enter second number");
        int secondNum = sc.nextInt();
        System.out.println("Enter Third number");
        int thirdNum = sc.nextInt();
        findLargestNum(firstNum, secondNum, thirdNum);
        sc.close();
    }
}
