import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int x = sc.nextInt();
        System.out.println("Enter Second number");
        int y = sc.nextInt();
        System.out.println("Enter Third number");
        int z = sc.nextInt();
        int sum = x + y + z;
        System.out.println("The sum of first, seconds and third numbers are"+ sum);
    }
}
