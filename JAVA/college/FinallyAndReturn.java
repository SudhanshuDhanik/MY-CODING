public class FinallyAndReturn {
        public static void main(String[] args) {
            System.out.println(divideAndPrintResult(10, 2)); // Output: Result: 5
            System.out.println(divideAndPrintResult(10, 0)); // Output: Cannot divide by zero
        }
    
        public static int divideAndPrintResult(int numerator, int denominator) {
            try {
                int result = numerator / denominator;
                System.out.println("Result: " + result);
                return result;
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
                return -1; // Return some default value or handle the exception
            } finally {
                System.out.println("Finally block executed");
            }
        }
    }
    

