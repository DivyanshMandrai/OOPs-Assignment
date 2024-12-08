class MyClass {
    int x;

    public MyClass(int x) {
        this.x = x;
        System.out.println("This is a parameterized constructor. x = " + x);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10);
    }
}
