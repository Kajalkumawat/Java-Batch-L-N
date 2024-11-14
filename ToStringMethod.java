class A {
    int a;

    A(int a) { 
        this.a = a;
    }

    // int convert string
    public String toString() {
        return a + "";
    }
} 

public class ToStringMethod {
    public static void main(String[] args) {
        A p = new A(78);
        System.out.println(p.toString());
    }
}
