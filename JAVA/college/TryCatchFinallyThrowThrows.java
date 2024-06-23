// Custom exception class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class TryCatchFinallyThrowThrows {

    // A method that throws an exception if the input is negative
    static void processNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            // Throw a custom exception if the input is negative
            throw new NegativeNumberException("Negative numbers not allowed");
        } else {
            System.out.println("Input is: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            // Attempt to call the method with a negative number
            processNumber(-5);
        } catch (NegativeNumberException e) {
            // Catch and handle the custom exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in this block will always be executed, regardless of whether an exception occurred or not
            System.out.println("Finally block executed");
        }

        // Continue with the rest of the program
        System.out.println("Program continues after exception handling");
    }
}
