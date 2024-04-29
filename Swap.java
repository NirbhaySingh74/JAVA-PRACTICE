public class Swap {
    public static void main(String[] args) {
        // swap with thitd variable
        int n = 10, m = 20;
        System.out.println("Before swapping:");
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        // int temp = n;
        // n = m;
        // m = temp;
        // System.out.println("\nAfter swapping:");
        // System.out.println("n = " + n);
        // System.out.println("m = " + m);

        // swap without using third variable
        n = n + m;
        m = n - m;
        n = n - m;
        System.out.println("\nAfter swapping:");
        System.out.println("n = " + n);
        System.out.println("m = " + m);
    }
}
