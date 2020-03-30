import java.util.Scanner;

public class YoutubePractice23IfElseDecisions {

    public static void main(String[] args){

        int score = 95;

        if(score >= 90){
            System.out.println("You got 90 or above ");
            System.out.println("noice");
        } else {
            System.out.println("You got below 90");
            System.out.println("Gotta keep on keeping on!");
        }

        /*

        Write a program that asks the user to enter a guess for your age.
        If the user types in the correct answer, display a message saying
        that they were correct. If not, show a message saying that their
        guess was wrong. Use your actual age in this program.
         */

        Scanner userInputAge = new Scanner(System.in);
        int age = 0;
        int myAge = 28;
        System.out.println("Guess da age");
        age = userInputAge.nextInt();

        if(age == myAge){
            System.out.println("Yarp");
        } else {
            System.out.println("Narp");
        }
    }
}
