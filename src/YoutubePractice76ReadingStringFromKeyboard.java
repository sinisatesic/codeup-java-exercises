import java.util.Scanner;

public class YoutubePractice76ReadingStringFromKeyboard {

    public static void main(String[] args) {
        String str = "";
        //holding what is input in
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        str = input.nextLine();

        System.out.println(str);

        /*
        Exercise 1.
        Use the scanner method to read a string in from the keyboard.
        Then, convert the string to uppercase and display the new
        string back to the screen.
         */
        String stringTwo = "";
        System.out.println("Sentence braj:");
        stringTwo = input.nextLine();

        System.out.println(stringTwo.toUpperCase());
    }
}
