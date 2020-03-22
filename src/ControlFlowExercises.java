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


        /* ********* FOR LOOP  **********/


//    Refactor the previous two exercises to use a for loop instead.

        for (int i = 5; i <= 15; i++){
            System.out.println(i);
        }
//
        for (int i = 2; i <= 100; i+=2){
            System.out.println(i);
        }
//
        for (int i = 100; i >= 5; i-=5){
            System.out.println(i);
        }


        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        for(long a = 2; a <= 1000000; a *= a){
//            System.out.println(a);
//        }


        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.


        for (int i = 0; i <= 100; i++){
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }



        /* ****************** TABLE OF POWERS ******************
         * Prompt the user to enter an integer.
         * Display a table of squares and cubes from 1 to the value entered.
         * Ask if the user wants to continue.
         * Assume that the user will enter valid data.
         * Only continue if the user agrees to.
         * */

    Scanner input = new Scanner(System.in);

    String userConfirm = "Y";

    while(userConfirm.equalsIgnoreCase("y")){
        System.out.println("What number would you like to go up to?");
        int num = Integer.parseInt(input.nextLine());


        System.out.println("Table for input number below:");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for(int counter = 1; counter <= num; counter++){
            System.out.printf("%-6d | %-7d | %d%n", counter, counter*counter, counter*counter*counter);
        }
        //the minus operator before the digits above shift the alignment of output to the left

        System.out.println("Would you like to test another number? Y/N");
        userConfirm = input.nextLine();

    }

    System.out.println("Exiting loop");


        /* ****************** Grades PROBLEM ******************
         *Convert given number grades into letter grades.
         *Prompt the user for a numerical grade from 0 to 100.
         *Display the corresponding letter grade.
         *Prompt the user to continue.
         *Assume that the user will enter valid integers for the grades.
         *The application should only continue if the user agrees to.
         *
         *Grade Ranges:
         ** A : 100 - 88
         ** B : 87 - 80
         ** C : 79 - 67
         ** D : 66 - 60
         ** F : 59 - 0
         */

//        boolean gradeContinue = true;
//        do{
//            System.out.println("Please enter a number grade");
//            int numericGrade = input.nextInt();
//
//            if(numericGrade >= 88){
//                System.out.println("A");
//            } else if ( numericGrade >= 80){
//                System.out.println("B");
//            } else if (numericGrade >= 67){
//                System.out.println("C");
//            } else if (numericGrade >= 60){
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//
//            System.out.println("Would you like to enter a new grade? (y/n)");
//            String userResponse = input.next();
//
//            if(!userResponse.equalsIgnoreCase("y")){
//                gradeContinue = false;
//            }
//
//        }while (gradeContinue);


    }
}