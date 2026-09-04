import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double num1 = 0;
            double result = 0;
            boolean isFirstRun = true;
            boolean keepRunning = true;

            while (keepRunning) {
                if (isFirstRun) {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    isFirstRun = false;
                } else {
                    System.out.print("Use previous result (" + result + ") as first number? (y/n): ");
                    char choice = scanner.next().charAt(0);

                    if (choice == 'y' || choice == 'Y') {
                        num1 = result;
                    } else {
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                    }
                    }
                 
                 System.out.print("Enter an operator (+, -, *, /): ");
                 char operator = scanner.next().charAt(0);

                 System.out.print("Enter second number: ");
                 double num2 = scanner.nextDouble();

                 switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                        } else {
                            System.out.println("Undefined");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        isFirstRun = true;
                        break;
                 }
                 
                 System.out.println();

                 System.out.print("Do you want to perform another calculation? (y/n): ");
                 char goAgain = scanner.next().charAt(0);
                 if (goAgain == 'n' || goAgain == 'N') {
                    keepRunning = false;
                    System.out.println("Bye!");
                 }
                }
           
            
            }
    }   
}
