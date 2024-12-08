import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

        System.out.println("Enter temperature in Fahrenheit:");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
    }
}