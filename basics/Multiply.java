import java.util.Scanner;

public class Multiply {
    public static float MultTwoNum(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        // float f1 = 1.5f;
        // float f2 = 2.0f;
        // float mul = f1 * f2;
        // System.out.println("The product is = " + mul);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float firstNum = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float secondtNum = sc.nextFloat();
        float ans = MultTwoNum(firstNum, secondtNum);
        System.out.printf("Multiply of two float number is : %.2f\n", ans);
        sc.close();
    }
}
