public class TwoDArray {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }

    }
}
