class A {
    int a;

    A(int a) {
        this.a = a;
    }

    public int hashCode() { 
        return a;
    }
}

public class hashCodeMethod {
    public static void main(String[] args) {
        A p = new A(78);
        System.out.println(p.hashCode());
    }
}
