import java.util.Scanner;

public class SimpleInterest {
    public static int calculateSI(int p, int t, int r) {
        int SI = (p * r * t) / 100;
        return SI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount : ");
        int p = sc.nextInt();
        System.out.println("Enter Time : ");
        int t = sc.nextInt();
        System.out.println("Enter rate : ");
        int r = sc.nextInt();
        int si = calculateSI(p, t, r);
        System.out.println(
                "simple interest of principal amount " + p + " time " + t + " and rate " + r + " is " + si + " rupees");
        sc.close();
    }
}
