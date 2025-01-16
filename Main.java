// Name : Vidish Ketankumar Mistry
// PRN : 23070126146 
// Batch  : B3 




// Main program for the Calculator
class Main {

    public static void main(String[] args) {
        // Create UserInput instance to handle input
        UserInput input = new UserInput();

        // Let user select calculation type
        int choice = input.getCalculationChoice();

        Calculator cal = new Calculator();

        switch (choice) {
            case 1:
                // Addition
                int[] numbers = input.userInput();
                System.out.println("Sum is: " + cal.addition(numbers));
                break;

            case 2:
                // Subtraction
                numbers = input.userInput();
                System.out.println("Difference is: " + cal.subtraction(numbers));
                break;

            case 3:
                // Multiplication
                numbers = input.userInput();
                System.out.println("Product is: " + cal.multiplication(numbers));
                break;

            case 4:
                // Division
                numbers = input.userInput();
                System.out.println("Quotient is: " + cal.division(numbers));
                break;

            case 5:
                // Fibonacci Sequence
                int n = input.singleNumberInput();
                System.out.println("Fibonacci sequence: ");
                cal.fibonacci(n);
                break;

            case 6:
                // Sum of Array
                int[] array = input.arrayInput();
                System.out.println("Sum of array: " + cal.sumOfArray(array));
                break;

            case 7:
                // Mean of Array
                array = input.arrayInput();
                System.out.println("Mean of array: " + cal.meanOfArray(array));
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}