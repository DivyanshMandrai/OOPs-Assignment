class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            String country = "Germany";
            if (!country.equals("India")) {
                throw new NoMatchFoundException("No match found for country " + country);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
