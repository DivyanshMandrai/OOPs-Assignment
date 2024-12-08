class Demo {
    Demo() {
        System.out.println("0-argument constructor is called.");
    }
}

public class ZeroArgumentConstructor {
    public static void main(String[] args) {
        Demo obj = new Demo();  // Calls 0-argument constructor
    }
}
