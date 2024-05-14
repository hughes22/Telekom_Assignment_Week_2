import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter length and breadth
        double length = 0;
        double breadth = 0;

        // Exception handling to ensure valid input
        try {
            System.out.print("Enter length of the rectangle: ");
            length = scanner.nextDouble();

            System.out.print("Enter breadth of the rectangle: ");
            breadth = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numeric values for length and breadth.");
            // Exit the program if input is not numeric
            System.exit(1);
        } finally {
            // Close the scanner
            scanner.close();
        }

        // Create an object of the Area class with provided length and breadth
        Area rectangle = new Area(length, breadth);

        // Calculate and print the area of the rectangle
        double area = rectangle.returnArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
