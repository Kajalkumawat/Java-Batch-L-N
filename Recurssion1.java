public class Recurssion1 {
    public static void printn(int n) {
        if (n == 0) {
            return;
        }
        printn(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printn(5);
    }
}
