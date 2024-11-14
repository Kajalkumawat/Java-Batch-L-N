public class Typecasting1 {
    public static void main(String[] args) {
        String s = "1234";
        // string convert wc
        Integer i = Integer.parseInt(s);

        // wc convert pd :automatically convert
        int d = i;
        System.out.println(d);

        String s1 = "64.67";
        // float
        Float f = Float.parseFloat(s1);

        float f1 = f;
        System.out.println(f1);
    }
}
