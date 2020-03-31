import java.util.Scanner;

public class YoutubePractice41MethodParametersReturningValues {

    public static void main(String[] args) {
        //methods can be thought of as a box; you pass
        //numbers or perimeters into the box and it does something (calculation or function)
        //then it returns value(s)/result back to whatever called it

//        int num1 = 7;
//        int num2 = 7;
//
//        int firstAnswer = multiplyNum(num1); //here, variable num1 is called into multiplyNum method below, so body executes 11 * 7
//        System.out.println("The result is: " + firstAnswer);
//        System.out.println("The result is " + multiplyNum(num1)); //this is same as above println
//        System.out.println("When we multiply num1 by 7, we get: " + firstAnswer);
//
//        int secondAnswer = addNumbers(num1, num2);
//        System.out.println("\nWhen we add num1 and num2, we get: " + secondAnswer);
//
//        boolean thirdAnswer = equalNumbers(num1, num2);
//        System.out.println("Are num1 and num2 equal?: " + thirdAnswer);


        //exercise 1:
//        Scanner userIntOne = new Scanner(System.in);
//        int firstUserAnswer;
//        System.out.println("Separately input two integers from 1 to 100");
//        firstUserAnswer = userIntOne.nextInt();
//        Scanner userIntTwo = new Scanner(System.in); //don't even need new scanner, can re-use initial one
//        int secondUserAnswer;
//        System.out.println("Now input second integer:");
//        secondUserAnswer = userIntTwo.nextInt();
//
//        int exerciseAnswer;
//
//        exerciseAnswer = whichIsLarger(firstUserAnswer, secondUserAnswer);
//        System.out.println("You entered: " + firstUserAnswer + " and " + secondUserAnswer);
//        System.out.println("Larger (or equal) number is " + exerciseAnswer);

        //exercise 2:
        Scanner grades = new Scanner(System.in);
        double firstGradeInput;
        System.out.println("Separately input three grades from 1 to 100");
        firstGradeInput = grades.nextDouble();
        double secondGradeInput;
        System.out.println("Input second grade: ");
        secondGradeInput = grades.nextDouble();
        double thirdGradeInput;
        System.out.println("Input third grade: ");
        thirdGradeInput = grades.nextDouble();

        double gradesAnswer;

        gradesAnswer = averageOfGrades(firstGradeInput, secondGradeInput, thirdGradeInput);
        System.out.println("\nThe 3 grades you inserted are : " + firstGradeInput + ", " + secondGradeInput + " and " + thirdGradeInput);
        System.out.println("\nThe average of these grades is " + gradesAnswer);


    }

    //IMPORTANT: below method has 1 parameter, so in main method, 1 parameter is passed
//    public static int multiplyNum(int a){ //returning int value, not void (returns nothing)
//        return a * 7; //answer is local variable here
//
//
//    }
//
//    public static int addNumbers(int x, int y){ //expects two parameters
//        return x + y;
//
//    }
//
//    public static boolean equalNumbers(int r, int t){
//        if(r == t) return true;
//        else return false;
//    }

    /*
    1.
    In the main method, ask the user to separately input two integers from 1 to 100.
    Store the user input into variables. Create a method that will take as parameters
    these two values and determine which one is the larger number. The method will
    then return the larger of the two numbers and display the answer to the user.
     */

//    public static int whichIsLarger(int a, int b){
//        if(a >= b) return a;
//        else return b;
//    }

    /*
    2.
    In the main method, ask the user to separately input three grades from 0 to 100.
    Since these are grades they should be stored as double values. Create a method
    that will take as parameters these 3 grades and average them (add them up and
    divide by 3). The method then returns the answer to the main method and the answer
    is displayed to the user.
     */

    public static double averageOfGrades(double a, double b, double c){
        return (a + b + c) / 3;
    }
}
