import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of first and seconds numbers are"+ sum);
    }
}
