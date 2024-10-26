import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();

        if (x <= 1) {
            System.out.println("Not prime");
            return;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime number");
    }
}
