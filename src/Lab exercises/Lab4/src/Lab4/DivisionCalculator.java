package Lab4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        while(true) {
            try {
                System.out.println("Enter a divident (integer): ");
                a = sc.nextInt();
                System.out.println("Enter a divisor (integer), or -1 if you want to end the program: ");
                b = sc.nextInt();
                if (b == -1) {
                    System.out.println("Operation terminated!");
                    break;
                }
                int result = a / b;
                System.out.printf("Result: %d%n", result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: there is input which is not an integer! ");
                sc.nextLine();
            } finally {
                System.out.println("Operation done!");
            }

        }
        sc.close();
    }

}
