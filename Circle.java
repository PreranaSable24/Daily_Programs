import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculating area
        double area = Math.PI * radius * radius;

        // Calculating circumference
        double circumference = 2 * Math.PI * radius;

        // Displaying results
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}
