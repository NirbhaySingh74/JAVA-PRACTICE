package Array;

public class AddTwoMatrix {
    public static void AddTwomatrix(int arr1[][], int arr2[][]) {

        int ans[][] = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                ans[i][j] = arr1[i][j] + arr2[i][j];

            }
        }
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr1[][] = {
                { 1, 2 },
                { 2, 3 }
        };
        int arr2[][] = {
                { 2, 3 },
                { 3, 4 }
        };
        AddTwomatrix(arr1, arr2);
    }
}
