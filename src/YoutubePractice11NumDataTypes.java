public class YoutubePractice11NumDataTypes {
    /*
    byte    8-bits      -128 to 127
    short   16-bit      -32768 to 32767
    int     32-bits     -2,147,483, 648 to 2, 147, 483, 647
    long    64-bits     -9,223,372,036,854,775,808 to 9,223, 372, 036, 854, 775, 807
     */
    public static void main(String[] args){
        byte byteVariable = -100;
        short shortVariable = -2000;
        int intVariable = 100000;
        long longVariable = 50000012341243L; //the L at end here treats the integer as long data type, thus allowing it to run

        System.out.println(longVariable);
        longVariable = longVariable + 1;
        System.out.println(longVariable);


        // 1.
        /*
        Lightspeed is 186,282 miles per second. Write a program to calculate how far a lightbeam will travel after 300
        minutes and output the result to the screen. Note that the answer
        will need to be held in a long variable.
         */

        long lightspeed = 186282; //this needs to be long instead of int
        long lightBeamTravel = lightspeed * 300 * 60;
        System.out.println("A lightbeam will travel " + lightBeamTravel + " miles in 300 minutes");

//        can also complete as below:

        long distance;
        int minutes = 300;

        distance = 186282L * minutes * 60; //300 mph PER SECOND, thus times 60 is needed

        System.out.println("The distance traveled is " + distance + " miles");
    }

}
