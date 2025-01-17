# PIJ-Lab-Assignment-1



## Overview
This program implements a menu-driven calculator in Java, divided into three files: `Main.java`, `UserInput.java`, and `Calculator.java`.

---

## File Descriptions and Functions

### 1. **Main.java**
- Entry point of the program.
- Displays the calculation menu and handles user choices.
- Invokes methods from `Calculator` and `UserInput` classes.

### 2. **UserInput.java**
- Handles all user input operations.
- **Functions:**
  - `int[] userInput()`: Accepts two numbers and returns them as an array.
  - `int singleNumberInput()`: Accepts a single number for calculations like Fibonacci sequence.
  - `int[] arrayInput()`: Accepts an array of numbers for array-based operations.
  - `int getCalculationChoice()`: Displays the menu and returns the user's selected operation.

### 3. **Calculator.java**
- Performs calculations and operations.
- **Functions:**
  - `int addition(int[] numbers)`: Adds two numbers.
  - `int subtraction(int[] numbers)`: Subtracts the second number from the first.
  - `int multiplication(int[] numbers)`: Multiplies two numbers.
  - `int division(int[] numbers)`: Divides the first number by the second, with error handling for division by zero.
  - `void fibonacci(int n)`: Generates and displays the Fibonacci sequence up to `n` terms.
  - `int sumOfArray(int[] array)`: Calculates the sum of an array.
  - `double meanOfArray(int[] array)`: Calculates the mean of an array.