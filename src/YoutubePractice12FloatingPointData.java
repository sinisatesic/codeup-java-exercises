public class YoutubePractice12FloatingPointData {

    /*
    floating point data types

    float: 32-bits
    double: 64-bits

     */
    public static void main(String[] args){

        double num1 = 74.33;
        float num2 = 76.54125125f; //f at end of number treats it as float; double is default
    //floats can only hold 5 decimal points

        System.out.println(num2);


        double answer;

        answer = Math.sqrt(num1);
        System.out.println(answer);


        // 1.
        /*
        The Java Math class contains a method called pow(x, y).
        This method takes the number "x" and raises it to the
        power "y". X and y are double floating point numbers, and
        the method returns a double floating point number as the answer

        Write a program that computes teh following:
        1.25^1
        1.25^2
        1.25^3 and so on

        format the output as:

        1.25 raised to the power of <power> is equal to <answer>.
        Increment the exponent from 1 to 20
         */
        double x = 1.25;
        int y;

        for (y = 1; y <= 20; y++){
            double powerOf = Math.pow(x, y); //you can explicitly cast here to a float (in front of Math.pow) if you want less decimal points
            System.out.println(x + " raised to the power of " + y + " is equal to " + powerOf);
        }



    }
}
