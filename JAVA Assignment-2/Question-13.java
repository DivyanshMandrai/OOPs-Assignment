class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Labrador extends Dog {
    void sound() {
        System.out.println("Labrador barks loudly");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Labrador lab = new Labrador();
        lab.sound();  // Output: Labrador barks loudly
    }
}