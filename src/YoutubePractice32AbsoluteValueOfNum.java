public class YoutubePractice32AbsoluteValueOfNum {

    public static void main(String[] args){
        //methods in Math class:
        //https://docs.oracle.com/javase/7/docs/api/

        double num1 = -2.54;

        double answer = Math.abs(num1);

        System.out.println("Absolute value of " + num1 + " is " + answer);

        //can also work with int value type but only if no decimals

        int num2 = -7;

        System.out.println(Math.abs(num2)); //will print 7
    }
}
