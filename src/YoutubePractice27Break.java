import java.util.Scanner;

public class YoutubePractice27Break {

    public static void main(String[] args)

//        int i;
//
//        for(i=1; i<=10;i++){
//            if (i == 7) break; //if you put break below next println(), it will count to 7 rather than 6 and then break from loop
//            System.out.println("Looper iteration at: " + i);
//
//        }
//        System.out.println("Out of loop now, done");

        /*
        1.

        Write a program that asks a user to enter their favorite letter of the alphabet.
        Use a for loop to with a break statement to loop through all letters A - Z,
         searching for a match for what the user input as their answer.

        Then, display to the user what number that letter corresponds to.

        Example: if the user types in "A", then output:
        "Your favorite letter is "A', which is letter number 1.
        If the user types in "Y", then output:
        Your favorite letter is Y, which is letter number 25.
         */

       throws java.io.IOException{
           char input; //this will hold the letter the user selected
           int i;       // this is used in the for loop
           char letterTest = 'A';   //we will compare user input against a letter of alphabet

           System.out.println("Enter fav letter");
           input = (char) System.in.read(); //reads user's selected letter

           for(i = 1; i <= 26; i++){ //loop through each letter of alphabet, since char is represented by number
               if(input == letterTest) //if user input equals to current letter
                   break;   //break out of loop when it hits letter user selected
                   letterTest++; //increments from A to Z (1 to 26)
           }
           System.out.println("Fav letter is " + input + " which is number " + i);

    }
}
