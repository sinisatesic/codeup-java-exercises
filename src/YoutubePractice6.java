public class YoutubePractice6 {
//1.
    /*A back yard has dimensions along its border of 20, 18, 17, 24 feet.
    Write a program that stores these lengths in variables and calculates the
    perimeter around the border of the yard. Display the output as:

    The perimeter of the yard is <<calculated answer>> feet.
     */

    public static void main(String[] args){

        int firstBorder = 20;
        int secondBorder = 18;
        int thirdBorder = 17;
        int fourthBorder = 24;

        int perimeter = firstBorder + secondBorder + thirdBorder + fourthBorder;

        System.out.println("The perimeter of the yard is " + perimeter + " feet.");


        //2.
        /* A rectangular wall has dimensions 23ft x 12ft. Write a program to
        calculate the area of the wall and display the result as:

        The area of the wall is <<calculated answer>> square feet.
         */

        int wallWidth = 23;
        int wallHeight = 12;

        int area = wallHeight * wallWidth;

        System.out.println("The area of the wall is " + area + " square feet");


        //3.
        /* A sailboat sail is triangular and has height of 14ft. The lengths of the
        base of the flag is 6 ft. The formula for the area of a triangle is:

        Area = base*height/2

        Write a program that calculates the area of this sail and display the result.
         */

        int height = 14;
        int base = 6;

        int areaOfSail = (base * height) / 2;
        //keep in mind this would not show full answer if there were decimals, Jah feel?
        System.out.println("\tThe area of this sail is " + areaOfSail + " square feet.");
    }
}
