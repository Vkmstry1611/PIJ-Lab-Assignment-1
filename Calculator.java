class Calculator{


	int addition(int[] numbers){
		

		int sum = numbers[0] + numbers[1];
	
		return sum;


	}


	int subtraction(int [] numbers){
		

		int sum = numbers[0] - numbers[1];
		
		return sum;


	}


	int multiplication(int numbers[]){
		


		int sum = numbers[0] * numbers[1];
		
		return sum;


	}


	int division(int[] numbers) {
        
		
		if (numbers[1] == 0) {
            System.out.println(" Division by zero is invalid");
            return 0;
        }
        
		
		return numbers[0] / numbers[1];
    }


	// Generates Fibonacci sequence up to n terms
    void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Calculates the sum of an array
    int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Calculates the mean of an array
    double meanOfArray(int[] array) {
        int sum = sumOfArray(array);
        return (double) sum / array.length;
    }
}


