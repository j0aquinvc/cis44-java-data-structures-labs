import java.util.Scanner;

public class calculator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("--- Simple Calculator ---");
        System.out.println("Enter a number, an operator (+, -, *, /), or 'C' to clear, or 'X' to exit");
        
        double currentDisplay = 0;
        boolean isFirstInput = true;
        
        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("X")) {
                System.out.println("Exiting calculator.");
                break;
            }

            if (input.equalsIgnoreCase("C")) {
                currentDisplay = 0;
                isFirstInput = true;
                System.out.println(currentDisplay);
                continue;
            }
            if (isFirstInput) {
                currentDisplay = Double.parseDouble(input);
                isFirstInput = false;
                System.out.println(currentDisplay);
            } else {
                char operator = input.charAt(0);

                double nextNumber = scanner.nextDouble();

                switch (operator) {
                    case '+':
                        currentDisplay = currentDisplay + nextNumber;
                        break;
                    case '-':
                        currentDisplay = currentDisplay - nextNumber;
                        break;
                    case '*':
                        currentDisplay = currentDisplay * nextNumber;
                        break;
                    case '/':
                        if (nextNumber != 0) {
                            currentDisplay = currentDisplay / nextNumber;
                        } else {
                            System.out.println("Error: Division by zero.");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator.");
                        continue;
                }
                System.out.println(currentDisplay);
            }
            }
        }
    }
}
        
