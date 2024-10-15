class A {
    void fun1() {
        int x = 1;
        System.out.println(x);
    }

    void fun2() {
        int x = 2;
        fun1();
        System.out.println(x);
    }

    void fun3() {
        int x = 3;
        fun2();
        System.out.println(x);
    }
}

public class Methodcall4 {
    public static void main(String[] args) {
        A p = new A();
        p.fun3();
    }
}
