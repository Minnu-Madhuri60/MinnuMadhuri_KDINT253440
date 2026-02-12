// import java.util.Scanner;

// public class Calculator {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.println("=== Simple Calculator ===");

//         // Taking input
//         System.out.print("Enter first number: ");
//         double num1 = sc.nextDouble();

//         System.out.print("Enter second number: ");
//         double num2 = sc.nextDouble();

//         System.out.println("\nChoose Operation:");
//         System.out.println("1. Addition (+)");
//         System.out.println("2. Subtraction (-)");
//         System.out.println("3. Multiplication (*)");
//         System.out.println("4. Division (/)");

//         System.out.print("Enter choice (1/2/3/4): ");
//         int choice = sc.nextInt();

//         // Using if-else
//         if (choice == 1) {
//             System.out.println("Result: " + (num1 + num2));
//         } 
//         else if (choice == 2) {
//             System.out.println("Result: " + (num1 - num2));
//         } 
//         else if (choice == 3) {
//             System.out.println("Result: " + (num1 * num2));
//         } 
//         else if (choice == 4) {
//             if (num2 != 0) {
//                 System.out.println("Result: " + (num1 / num2));
//             } else {
//                 System.out.println("Error! Division by zero is not allowed.");
//             }
//         } 
//         else {
//             System.out.println("Invalid choice!");
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;

// Interface
interface CalculatorOperations {
    void add(double a, double b);
    void subtract(double a, double b);
    void multiply(double a, double b);
    void divide(double a, double b);
}

// Class implementing interface
class CalculatorImpl implements CalculatorOperations {

    public void add(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(double a, double b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(double a, double b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }
}

// Main class
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorOperations calc = new CalculatorImpl();

        System.out.println("=== Simple Calculator (Using Interface) ===");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults:");

        calc.add(num1, num2);
        calc.subtract(num1, num2);
        calc.multiply(num1, num2);
        calc.divide(num1, num2);

        sc.close();
    }
}
