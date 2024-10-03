public class NaturalPrintNumber {
    public static void printn(int n) {
        // recurssive work
        if (n == 0) {
            return;
        }
        // return :it is terminate the method (just neche valey method ko rok deta hai)
        printn(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        printn(5);
    }
}
