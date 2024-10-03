class A {
    void show1() {
        int x = 1;
        System.out.println(x);
    }

    void show2() {
        int x = 2;
        show1();
        System.out.println(x);
    }

    void show3() {
        int x = 3;
        show2();
        System.out.println(x);
    }

    void show4() {
        int x = 4;
        show3();
        System.out.println(x);
    }
}

public class MethodCall1 {
    public static void main(String[] args) {
        A p=new A();
        p.show4();
    }
}
