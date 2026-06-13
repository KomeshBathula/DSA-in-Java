package Practice;

class A {
    static {
        System.out.println("Static block of A");
    }
}
class B {
    public static void main(String[] args) {
        System.out.println("Main method of B");
        A a = new A();
    }
}