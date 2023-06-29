import java.rmi.Naming;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        try {
            // Look up from the RMI registry using the name "server"
            Calculator c = (Calculator) Naming.lookup("server");

            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Invoke remote methods on the Calculator object
            System.out.println("Addition: " + c.add(num1, num2));

            System.out.println("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            num2 = scanner.nextInt();

            System.out.println("Subtraction: " + c.sub(num1, num2));

            System.out.println("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            num2 = scanner.nextInt();

            System.out.println("Multiplication: " + c.mul(num1, num2));

            System.out.println("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            num2 = scanner.nextInt();

            System.out.println("Division: " + c.div(num1, num2));

            // Close the Scanner
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
