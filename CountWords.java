public class CountWords {
    public static void main(String[] args) {
        String s = "java is programming language";
        String a[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
