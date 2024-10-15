public class Recurssion3 {
    public static void printn(int n, int k) {
        if (n == 0) {
            return;
        }
        printn(n - 1, k);
        System.out.println(n * k);
    }

    public static void main(String[] args) {
        printn(10, 2);
    }
}
