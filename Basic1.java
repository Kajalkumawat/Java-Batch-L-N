public class Basic1 {
    public static void main(String[] args) {
        String s = "java";
        // string convert into char
        char a[] = s.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}
