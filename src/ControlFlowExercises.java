import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args){

        //loops

        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }


        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);


//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        float i = 2;
//        do {
//            System.out.println(i);
//            i = i * i;
//            System.out.println(i);
//        } while(i < 1000000);


//        float i = 2;
//        do{
//            String str = String.format("%.0f", i);
//            i = i * i;
//            System.out.println(str);
//        } while(i < 1000000);


        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.


//        for (int i = 0; i <= 100; i++){
//            if (i % 15 == 0) System.out.println("FizzBuzz");
//            else if (i % 3 == 0) System.out.println("Fizz");
//            else if (i % 5 == 0) System.out.println("Buzz");
//            else System.out.println(i);
//        }



        //Convert given number grades into letter grades.
        //
        //Prompt the user for a numerical grade from 0 to 100.
        //Display the corresponding letter grade.
        //Prompt the user to continue.
        //Assume that the user will enter valid integers for the grades.
        //The application should only continue if the user agrees to.
        //Grade Ranges:
        //
        //A : 100 - 88
        //B : 87 - 80
        //C : 79 - 67
        //D : 66 - 60
        //F : 59 - 0

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerical grade from 0 to 100");
        int userAnswer = input.nextInt();
        System.out.println(userAnswer);

        System.out.println("Do do you wish to continue? [y/n]");
        String userInput = input.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");
        System.out.println(confirmation);



    }
}
