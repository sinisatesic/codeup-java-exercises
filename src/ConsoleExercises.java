import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

 //Copy this code into your main method:
        //double pi = 3.14159;

        //Write some Java code that uses the variable pi to output the following:

        //The value of pi is approximately 3.14.
        //Don't change the value of the variable;
        // instead, reference one of the links above and use System.out.format to accomplish this.

        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f%n",pi);

        //another approach but using System.out.format:

        System.out.format("The value of pi is approximately %.2f%n", pi);


  //SCANNER INSTANCE:

//Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//What happens if you input something that is not an integer? Answer: receive an error

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter an integer");
//
//        int userInt = input.nextInt();
//
//        System.out.println(userInt);



 //Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
        //What happens if you enter less than 3 words? Answer: it will keep cursor prompted and blinking awaiting third word/string input
        //What happens if you enter more than 3 words? Answer: it will only show first three, cut off fourth

//        System.out.println("Enter three words");
//
//        String firstWord = input.next();
//        String secondWord = input.next();
//        String thirdWord = input.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

//Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
// Then, display that sentence back to the user.

//do you capture all of the words? Answer: only with previous content commented out; this is because of nextLine() method after next() method. The next() method will return only first word

//        System.out.println("Enter a sentence");
//
//        String userSentence = input.nextLine();
//
//        System.out.println(userSentence);



//Calculate the perimeter and area of Codeup's classrooms.
//Prompt the user to enter values of length and width of a classroom at Codeup.
//Use the nextLine method to get user input and
// [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.
//
//Assume that the rooms are perfect rectangles.
//Assume that the user will enter valid numeric data for length and width.
//Display the area and perimeter of that classroom.
//
//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//Bonuses
//
//Accept decimal entries.
//Calculate the volume of the rooms in addition to the area and perimeter.
//The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):
//scanner.useDelimiter("\n");
//How does this change the way your program operates?
//Rewrite your classroom program to use nextInt method.
// If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.

//        System.out.println("What is length of classroom?");
//        String lengthInput = input.nextLine();
//        int length = Integer.parseInt(input.nextLine());

//        System.out.println("What is width of classroom?");
//        String widthInput = input.nextLine();
//        int width = Integer.parseInt(input.nextLine());
//
//        int area = length * width;
//        int perimeter = (2 * length) + (2 * width);
//
//        System.out.printf("Area of classroom is %d. Perimeter is %d", area, perimeter);

        //bonus

        System.out.println("What is length of classroom?");

        double length = Double.parseDouble(input.nextLine());

        System.out.println("What is width of classroom?");

        double width = Double.parseDouble(input.nextLine());

        double area = length * width;
        double perimeter = (2 * length) + (2 * width);

        System.out.printf("Area of classroom is %.0f. Perimeter is %.0f", area, perimeter);
//the .0 before each f indicates how many decimal places will output; here 0 decimal points will ouput after area and perimeter


    }
}
