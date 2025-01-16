class Main{

	public static void main(String args[]){

		
		int[] numbers;
		UserInput input = new UserInput();
	
		numbers = input.userInput();

		
		Calculator cal = new Calculator();
		System.out.println("Sum is : "+ cal.addition(numbers));

		System.out.println("Difference is : "+cal.substraction(numbers));
	
	}

}