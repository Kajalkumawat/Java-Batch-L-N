public class Table {
    public static void table(int n, int k) {
        if (n == 0) {
            return;
        }
        table(n - 1, k);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        table(10, 2);
    }
}
