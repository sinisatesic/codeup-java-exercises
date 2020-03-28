public class YoutubePractice7 {
    // double is a 64 bits value type and can hold numbers with decimal points
    public static void main(String[] args){

        double inches, centimeters;

        int number1;
        double number2;

        inches = 12.7;

        centimeters = inches * 2.54;

        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");


        number1 = 12/5;
        number2 = 12.0/5.0;

        System.out.println(number1);
        System.out.println(number2);


        //1.
        /* Write a program to convert 34.0 degrees celcius to farenheit,
        then print the result on the screen.

        The equation for the conversion is:
        farenheit = (9/5) * celcius + 32
         */

        double celcius = 34.0;
        double farenheit = (9.0/5.0) * celcius + 32.0;

        System.out.println("34.0 celcius converted to farenheit is " + farenheit + " degrees");


        //2.
        /* Write a program to convert 10.5 feet and convert it to meters.
        There are 0.305 meters per foot.
         */

        double feet = 10.5;
        double meters = feet * 0.305;

        System.out.println("10.5 feet equates to " + meters + " meters.");
    }
}
