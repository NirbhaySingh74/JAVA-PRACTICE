import java.util.Scanner;

public class Armstrong {
    public static void findArmstrongNumbers(int lower, int upper) {
        int sum = 0;
        for (int number = lower; number <= upper; number++) {
            if (isArmstrong(number)) {
                System.out.println(number);
                sum = sum + 1;
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int numOfDigits = String.valueOf(num).length();
        while (num > 0) {
            int digit = num % 10;
            // System.out.println(digit);
            sum += Math.pow(digit, numOfDigits);
            num /= 10;
            // System.out.println(num);
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int lowerLimit = sc.nextInt();

        System.out.print("Enter the upper limit of the range: ");
        int upperLimit = sc.nextInt();

        System.out.println("Armstrong numbers between " + lowerLimit + " and " + upperLimit + ":");
        findArmstrongNumbers(lowerLimit, upperLimit);
        sc.close();
    }
}
