import java.util.*;

class UserInput{


	//return int datatype array

	int[] userInput(){

		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[2];

		System.out.println("Enter First Number : ");
		numbers[0] = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		numbers[1] = scan.nextInt();


		return numbers;
		
		
	}



	// Returns a single number (e.g., for Fibonacci sequence)
    int singleNumberInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        return scan.nextInt();
    }


	// Returns an array of numbers for operations like sum of array and mean
    int[] arrayInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }


    // Displays menu and gets the user's choice for calculation
    int getCalculationChoice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");

        System.out.println("Select a calculation : ");
        return scan.nextInt();
  
  
    }


}


