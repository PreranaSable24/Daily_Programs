import java.util.Scanner;

public class ArithmeticOperator_switchcase_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Displaying options to the user
        System.out.println("Choose an arithmetic operator:");
        System.out.println("1: Addition (+)");
        System.out.println("2: Subtraction (-)");
        System.out.println("3: Multiplication (*)");
        System.out.println("4: Division (/)");
        System.out.println("5: Modulus (%)");

        // Accepting choice from user
        int choice = scanner.nextInt();

        // Variables to hold operands
        double operand1, operand2;

        // Accepting operands from user
        System.out.print("Enter first operand: ");
        operand1 = scanner.nextDouble();
        System.out.print("Enter second operand: ");
        operand2 = scanner.nextDouble();

        // Using switch case to perform arithmetic operation based on choice
        double result;
        switch (choice) {
            case 1:
                result = operand1 + operand2;
                System.out.println("Result: " + result);
                break;
            case 2:
                result = operand1 - operand2;
                System.out.println("Result: " + result);
                break;
            case 3:
                result = operand1 * operand2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            case 5:
                if (operand2 != 0) {
                    result = operand1 % operand2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Modulus by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
