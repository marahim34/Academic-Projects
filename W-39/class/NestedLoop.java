public class NestedLoop {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ---> ");
            for (int j = 0; j < n; j++) {
                System.out.printf(" %d ", j);
            }
            System.out.println();
        }
    }
}
