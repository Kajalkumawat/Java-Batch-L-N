public class Recurssion4 {
    // even number :
    public static void even(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 == 0) {
            System.out.println(n);
        }
        even(n - 1);
    }

    public static void main(String[] args) {
        even(5);
    }
}
