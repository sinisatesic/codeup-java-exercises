import java.util.Scanner; //importing scanner class

public class YoutubePractice22Scanner {

    public static void main(String[] args){
//        Scanner keyboardInput = new Scanner(System.in); //every time using scanner class, need to have this syntax
//
//        int test;
//        double doubleNumber;
//        int hasNext = 0;
//
//        System.out.println("Enter any integer");
//        test = keyboardInput.nextInt(); //method from scanner class
//
//        System.out.println("You entered: " + test);
//
//        System.out.println("Enter another integer\n");
//        test = keyboardInput.nextInt();
//
//        System.out.println("Second integer entered is " + test);
//
//        System.out.println("Enter a decimal number: ");
//        doubleNumber = keyboardInput.nextDouble();
//
//        System.out.println("Decimal number entered is " + doubleNumber); //double will also take in int as input but will print it with .0 after the int
//
//        System.out.println("Enter int to test next number: ");
//        if(keyboardInput.hasNextDouble() == true) hasNext = keyboardInput.nextInt();


        /*
        1.

        Write a program that asks the user to input their age.
        Based on the input, calculate how old they will be in 14 more years.

        Output the result as follows:

        "You are now [current age] years old.
        In 14 years, you will be [answer] years old."
         */

//        Scanner userInput = new Scanner(System.in);
//        int userAge;
//
//        System.out.println("Input your age");
//        userAge = userInput.nextInt();
//
//        System.out.println("You are now " + userAge + " years old");
//        System.out.println("In 14 years, you will be " + (userAge + 14) + " years old");


        /*
        Write a program to ask the user to input the radius of a circle as a decimal number.
        Calculate the area of the circle using the formula:

        A = Pi*r*r

        Output in the following way:

        "The radius of the circle is [radius] meters.
        The area of the circle is [answer] square meters."
         */

//        Scanner userInput = new Scanner(System.in);
//        double inputRadius;
//        System.out.println("Input the radius of a circle as decimal:");
//        inputRadius = userInput.nextDouble();
//
//        System.out.println("The radius of the circle is " + inputRadius + " meters");
//        System.out.println("The area of the circle is " + (Math.PI * inputRadius * inputRadius) + " square meters.");


        /*
        3.

        Write a program to read in the two lengths of the sides of a rectangle as follows:

        Enter the length of the rectangle:
        Enter the width of the rectangle:

        Using these inputs, calculate the perimeter of the rectangle and its area.

        Output as follows:

        The perimeter of this rectangle is : [answer]
        The area of this rectangle is: [answer]
         */


        Scanner userInputLength = new Scanner(System.in);
        Scanner userInputWidth = new Scanner(System.in);

        double length;
        double width;

        System.out.println("Enter the length of the rectangle:");
        length = userInputLength.nextDouble();
        System.out.println("Enter the width of the rectangle");
        width = userInputWidth.nextDouble();

        System.out.println("The perimeter of this rectangle is: " + ((length * 2) + (width * 2)));
        System.out.println("The area of this rectangle is: " + (length * width));
    }
}
