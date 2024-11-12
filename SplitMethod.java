public class SplitMethod {
    public static void main(String[] args) {
        String s = "java is programming language";
        String a[] = s.split(" ");
        System.out.println(a[2]);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
