import java.util.Scanner;

public class EvenOrOdd {
    public static String evenOdd(int num) {
        if (num % 2 == 0)
            return "Even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String ans = evenOdd(n);
        System.out.println("Number is : " + ans);
        sc.close();
    }
}
