import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
        sc.close();
    }
}
