public class Ellapsecode {
    static void show(int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String... args) {
        show(1, 2, 3, 4, 5);
    }
}
