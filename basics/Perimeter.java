import java.util.Scanner;

public class Perimeter {
    public static int calcPerimeter(int length, int breadth) {
        int calcPerim = 2 * (length + breadth);
        return calcPerim;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length");
        int length = sc.nextInt();
        System.out.println("Enter Breadth");
        int breadth = sc.nextInt();
        int result = calcPerimeter(length, breadth);
        System.out.println("perimeter of " + length + " and " + breadth + " = " + result);
    }
}
