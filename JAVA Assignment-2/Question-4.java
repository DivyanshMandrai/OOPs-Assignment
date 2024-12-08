class MyClass {
    MyClass() {
        System.out.println("This is the no-argument constructor.");
    }

    MyClass(int x) {
        System.out.println("This is the parameterized constructor with value: " + x);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(10);
    }
}
