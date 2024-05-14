public class HandlesException {
    // Method to divide two numbers
    public static double divide(int num1, int num2) throws ArithmeticException {
        // Check if the divisor is zero
        if (num2 == 0) {
            // Throw ArithmeticException if division by zero occurs
            throw new ArithmeticException("Error: Division by zero");
        }
        // Perform division and return the result
        return (double) num1 / num2;
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            // Attempt division
            double result = divide(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch ArithmeticException if division by zero occurs
            System.out.println(e.getMessage());
        }
    }
}
