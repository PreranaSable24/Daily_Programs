import java.util.Scanner;

public class AssignmentOperator_switchcase_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting values from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Displaying options to the user
        System.out.println("Choose an assignment operator:");
        System.out.println("1: += (Add and Assign)");
        System.out.println("2: -= (Subtract and Assign)");
        System.out.println("3: *= (Multiply and Assign)");
        System.out.println("4: /= (Divide and Assign)");
        System.out.println("5: %= (Modulus and Assign)");

        // Accepting choice from user
        int choice = scanner.nextInt();


        // Using switch case to perform operation based on choice
        switch (choice) {
            case 1:
                num1 += num2;
                System.out.println("Result after +=: " + num1);
                break;
            case 2:
                num1 -= num2;
                System.out.println("Result after -=: " + num1);
                break;
            case 3:
                num1 *= num2;
                System.out.println("Result after *=: " + num1);
                break;
            case 4:
                num1 /= num2;
                System.out.println("Result after /=: " + num1);
                break;
            case 5:
                num1 %= num2;
                System.out.println("Result after %=: " + num1);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
