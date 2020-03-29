public class YoutubePractice18LogicalOps {

    /*
    &&  Logical AND     "A and B"
    ||  Logical OR      "A or B"
    !   Logical NOT     "Invert State"
    ^   Logical XOR     "A or B but not both"   (exclusive OR: A or B, but not both. Regular or can accepts true/false on both))
     */
    public static void main(String[] args){

        int a;
        boolean b;

        a = 10;
        b = true;

        if(a == 10) System.out.println("Success");
        if(a != 10) System.out.println("Will not show in console");
        if((a == 10) && (b == true)) System.out.println("both true");
        if((a == 7) || (b == true)) System.out.println("one is true");
        if((a == 10) ^ (b == true)) System.out.println("will not print since both true");
        if((a == 7) ^ (b == true)) System.out.println("will print because one is true");

        //for &&, you can have more than two conditions


        /*
        1.
        Create a variable named "age" and assign a value of 30 to it.
        If the age lies between 25 and 35, output the following:

        Your age is between 25 and 35

        If the age lies between 45 and 55, output the following:

        Your age is between 45 and 55

        Change the age to 50 and re-run the program.
         */

        int age = 50;
        if((age >= 25) && (age <= 35)){
            System.out.println("Your age is between 25 and 35");
        } else if ((age >= 45) && (age <= 55)){
            System.out.println("Your age is between 45 and 55");
        }
    }
}
