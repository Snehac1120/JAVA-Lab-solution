interface A {
    int c= 10;
    void methodA();
}

interface A1 extends A {
    int c1= 20;
    void methodA1();
}

interface A2 extends A {
    int c2 = 30;
    void methodA2();
}

interface A12 extends A1, A2 {
    int c12 = 40;
    void methodA12();
}

class B implements A12 {

    @Override
    public void methodA() {
        System.out.println("methodA:c=" +c);
    }

    @Override
    public void methodA1() {
        System.out.println("methodA1:c1=" +c1);
    }

    @Override
    public void methodA2() {
        System.out.println("methodA2:c2=" +c2);
    }

    @Override
    public void methodA12() {
        System.out.println("methodA12:c12=" +c12);
    }
}

public class lab11a1 {
    public static void main(String[] args) {

        B obj = new B();

        obj.methodA();
        obj.methodA1();
        obj.methodA2();
        obj.methodA12();

    }
}
