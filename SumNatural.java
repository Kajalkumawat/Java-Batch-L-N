public class SumNatural {
    public int natural(int n) {
        if (n == 0) {
            return n;
        }
        int ans = n + natural(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        SumNatural s = new SumNatural();
        System.out.println(s.natural(5));
    }
}
