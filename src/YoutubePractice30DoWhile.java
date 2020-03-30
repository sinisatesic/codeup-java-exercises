import java.util.Scanner;

public class YoutubePractice30DoWhile {

    public static void main(String[] args){
//         int i = 1;
//
//         do {
//             System.out.println("Do while variable is: " + i);
//             i++;
//         } while(i >= 15); // will still print body once, because it does so regardless of condition


        /*
        1.

        Write a program that asks the user to guess a number between
        1 and 20. The "correct" number is 17. If 17 is not entered,
        the program says the wrong guess was entered, and tells
        user if the guess was too low or too high.
        If 17 was entered, the program tells user they're correct.

        Wrap the relevant code inside of a do-while loop so that the user
        can continue to place guesses without re-running the program.
        Use the Scanner class to read in the numeric keyboard entry.
         */

        Scanner userInput = new Scanner(System.in);
        int numGuessed;
        System.out.println("Guess number between 1 and 20");
        do{
            numGuessed = userInput.nextInt();

            if(numGuessed == 17) {
                System.out.println("Correct, bai");
            }else {
                System.out.println("Guess again");
                if(numGuessed < 17){
                    System.out.println("too low, go higher");
                } else {
                    System.out.println("too high, go lower");
                }
        }


        } while (numGuessed != 17);


    }
}
