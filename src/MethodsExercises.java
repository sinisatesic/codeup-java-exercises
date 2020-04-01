import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {

    public static void main(String[] args){

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


        //all below is stored in main method above
        int a=3;
        int b=4;
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a/b);
        int answerAddition;
        answerAddition = addition(a, b);
        System.out.println(answerAddition);


        int answerSubtraction;
        answerSubtraction = subtraction(a, b);
        System.out.println(answerSubtraction);

        int answerMultiplication;
        answerMultiplication = multiplication(a, b);
        System.out.println(answerMultiplication);


        double answerDividing;
        answerDividing = dividing(a, b);
        System.out.println(answerDividing);

        int answerModulus;
        answerModulus = modulus(a, b);
        System.out.println(answerModulus);
    }

    //all below are custom methods which call to variables in main method

        public static int addition(int x, int y){
            int answer = x + y;

            return answer;
        }


        public static int subtraction(int x, int y){
            int answer = x - y;

            return answer;
        }


        public static int multiplication(int x, int y){
            int answer = x * y;

            return answer;
        }


        public static double dividing(int x, int y){
            double answer = y/x;

            return answer;
        }


        public static int modulus(int x, int y){
            int answer = x % y;

            return answer;
        }


         //Create a method that validates that user input is in a certain range
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

    public static int validInput(int min, int max){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input >= min && input <= max) return input;
        System.out.println("Try again!");
        return validInput(1,10);
    }


    //Calculate the factorial of a number.
    //
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    //
    //
    //1! = 1               = 1
    //2! = 1 x 2           = 2
    //3! = 1 x 2 x 3       = 6
    //4! = 1 x 2 x 3 x 4   = 24

    public static void askForNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int input = validInput(1,10);
        System.out.println("Would you like to continue?");
        if(scan.nextLine().equals("yes"))
            System.out.println(input +"! = " + getFactorials(6));
        else System.out.println("GoodBye.");
    }




    public static long getFactorials(int num){
        if(num == 1) return 1L;
        return (long)num * getFactorials(num -1);
    }

    //Bonus
    //
    //Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
    //Use recursion to implement the factorial.

    public static long findTheHighestFactorial(int num){
        String stringAnswer = String.valueOf(getFactorials(num));
        String max = String.valueOf(Long.MAX_VALUE);

        if(stringAnswer.length() > max.length()) return 0;
        return 1L + findTheHighestFactorial(++num) ;
    }
    //method overload below
    public static long findTheHighestFactorial(){
        return findTheHighestFactorial(1);
    }


    //Create an application that simulates dice rolling.
    //
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void rollTheDice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scan.nextInt();
//        clear
        scan.nextLine();
        System.out.println("Ready to Roll? (Y/N)");
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("Y")){
            Random randomRoll = new Random();
            int rolled = randomRoll.nextInt(sides + 1);
            System.out.println("Your number is: " + rolled);
            return;
        }
        System.out.println("GoodBye.");
        return;

    }
}
