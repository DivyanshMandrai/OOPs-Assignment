class Student {
    String name;
    int age;

    // Constructor with 'this' keyword to refer to current object's variables
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        student.display();
    }
}
