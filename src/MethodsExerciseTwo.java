import java.util.Scanner;

public class MethodsExerciseTwo {

    public static void main(String[] args){


        int a = 5;
        int b = 7;

        System.out.println(addition(a, b));
        //can also do with below approach:
        int additionAnswer = addition(a, b);
        System.out.println(additionAnswer);


        System.out.println(subtraction(b, a));

        System.out.println(multiplication(a, b));

        System.out.println(division(a, b));

        System.out.println(modulus(a, b));
    } //end of main method


    //these methods below are still in class MethodsExerciseTwo but outside of main method

    //Create a class named MethodsExercises. Inside of your class, write code to create the specified methods.
    // Test your code by creating a main method and calling each of the methods you've created.
    //
    //Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition
    //Subtraction
    //Multiplication
    //Division
    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.
    //
    //Food for thought: What happens if we try to divide by zero? What should happen?
public static int addition(int x, int y){
    return x + y;
}

public static int subtraction(int x, int y){
        return x - y;
}

public static int multiplication(int x, int y){
        return x * y;
}

public static double division(double x, double y){
        return x / y;
}

public static double modulus(double x, double y){
        return x % y;
}

//Create a method that validates what user input is in a certain range
//
//The method signature should look like this:
//
//
//public static int getInteger(int min, int max);
//and is used like this:
//
//
//System.out.print("Enter a number between 1 and 10: ");
//int userInput = getInteger(1, 10);
//If the input is invalid, prompt the user again.
//
//Hint: recursion might be helpful here!

public static int getInteger(int min, int max){
Scanner userInput = new Scanner(System.in);
int number = userInput.nextInt();
if (number >= min && number <= max) return number;
else System.out.println("out of range");
return getInteger(1, 10);
}

}

