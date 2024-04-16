import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting length from user
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Accepting breadth from user
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculating area
        double area = length * breadth;

        // Calculating perimeter
        double perimeter = 2 * (length + breadth);

        // Displaying results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}
