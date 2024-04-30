import java.util.Scanner;

public class FindLeapyear {

    public static boolean isLeapyear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
        System.out.println(isLeapyear(year));
        sc.close();
    }
}
