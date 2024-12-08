import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers to find HCF:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("The HCF is: " + a);
    }
}
