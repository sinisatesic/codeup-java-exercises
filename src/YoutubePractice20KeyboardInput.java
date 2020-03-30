public class YoutubePractice20KeyboardInput {

    public static void main(String[] args)
//        throws java.io.IOException { //part of Java's error handling
//
//        char input;
//
//        System.out.println("Enter single character from keyboard, then press Enter: ");
//
//        input = (char) System.in.read(); //system reads input as int, so casting to char is required
//
//        if (input == '1'){ //single quote has to be applied to indicate char type
//            System.out.println("You selected 1");
//        } else {
//            System.out.println("You selected something other than 1");
//        }


        /*
        1.

        Create a true/false question.
        Out the following:

        "The capital of the United States is D.C.: True or False"

        if the user enters 'T', then output, "Correct"
        If user answers 'F', output "Incorrect"
         */

//        throws java.io.IOException{
//            char input;
//            System.out.println("The capital of the US is D.C.: True or False");
//
//            input = (char) System.in.read();
//
//            if(input == 'T' || input == 't'){
//                System.out.println("Correct");
//            } else if (input == 'F' || input == 'f'){
//                System.out.println("Incorrect");
//            }

        /*
        2.

        Create a "Guess the letter" game. Have the user input a letter between A and Z.

        Output" "I'm thinking of a letter between A and Z"
        "Guess my letter: "

        If they guess 'W' or 'w', then output "Correct"
        If they guess any other letter, output "Incorrect"
         */

//        throws java.io.IOException{
//            char input;
//            System.out.println("Thinking of a letter between A and Z. Guess the letter:");
//
//            input = (char) System.in.read();
//
//            if(input == 'W' || input == 'w'){
//                System.out.println("Correct");
//            } else {
//                System.out.println("Incorrect");
//            }


        /*
        3.

        Write a program to have the user type in a lowercase character and convert it to uppercase.

        Output: "Type in any lowercase letter: "

        Subtract 32 to the lowercase character to change it into upper case.
        Output the following:

        "You typed in the letter: <lowercase character>"
        "The uppercase version is: <uppercase character>"
         */

        throws java.io.IOException{
            char input;
            System.out.println("Type in lowercase letter:");

            input = (char) System.in.read();
            System.out.println("You typed in the letter: " + input);
            System.out.println("The uppercase version is: " + (input-=32));


    }
}
