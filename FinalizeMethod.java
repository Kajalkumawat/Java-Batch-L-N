class A {
    public void finalize() {
        System.out.println("call");
    }
}

public class FinalizeMethod {
    public static void main(String[] args) {
        A s1 = new A();
        A s2 = new A();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
