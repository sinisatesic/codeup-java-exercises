public class YoutubePractice19ShorthandArithmetic {


    /*
    x = x + y       x += y
    x = x -y        x -= y
    x = x * y       x *= y
    x = x / y       x /= y
     */
    public static void main(String[] args){
        int x = 2, y = 3;

        x -= y; // -1
        x /= y; //this will print 0 because vars are ints; would be different if they're doubles

        System.out.println("new value of x = " + x);

        /*
        1.

        Create a variable "num" that increments from 1 to 15.
        Using a for loop, output the following. You will need
        to create variables a, b, c, d to HOLD the answers in the table below. Use shorthand
        arithmetic assignments everywhere that you can. Below are just column "headers"

        num     a=num+2     b=num-2     c=num*2     d=num/2

         */

        int num;


        System.out.println("num \t a=num+2 \t b=num-2 \t c=num*2 \t d=num/2");//this only "heading" for "table" that will print below
            for(num = 1; num <= 15; num++){
                int a = num, b = num, c = num; //each iteration of num in this loop gets stored in these variables (HOLD^)
                double d = num; //same here but double instead of int
                a+=2;   //starting here is numbers 1-15 in loop being manipulated with operators
                b-=2;
                c*=2;
                d/=2;

                System.out.println(num + "\t\t\t" + a + "\t\t\t" + b + "\t\t\t" + c + "\t\t\t" + d); //prints a, b, c, and d after manipulation
            }
    }
}
