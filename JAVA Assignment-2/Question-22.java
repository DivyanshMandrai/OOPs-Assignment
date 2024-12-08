class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
            if (result < 0) {
                throw new CustomArithmeticException("Custom exception: Negative result");
            }
        } catch (ArithmeticException | CustomArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
