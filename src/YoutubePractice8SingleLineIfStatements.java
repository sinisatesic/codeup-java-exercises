public class YoutubePractice8SingleLineIfStatements {

    /*
        Relational Operators for Conditional Expressions:
        < Less than
        <= Less than or equal to
        > Greater than
        >= Greater than or equal to
        == Equal
        != Not equal to

        ( = is assignment operator, while == is relational operator)

        if(condition is true){
            then execute body of code
            }
    */

    public static void main(String[] args){

        int x,y;
        x = 3;
        y = 4;

        if(x < y){
            System.out.println("wazzuuuup");
        }

        if(x == y) System.out.println("x is equal to da y"); //won't run

        //also can be :
        // if (x < y) System.out.println("wazzuuuup"); THIS DOESN'T WORK FOR BLOCK CODE - more than one line of code to be executed

        double a,b,c;

        a = 3.45;
        b = 4.25;
        c = 3.45;

        if(a == c) System.out.println("a is equal to c");
        if(b >= a) System.out.println("b is greater or equal to a");
        if(a != b) System.out.println("a is not equal to b");
        if(a != c) System.out.println("a is not equal to c");


        //1.
        /*
        Jenny is 14 years old, Danny is 6 years old, and Claire is 6 years old.
        Write a program that uses the IF statements to output the following text:

        if Jenny is older than Danny, then output "Jenny is older than Danny."
        If Danny is older than Jenny, then output "Danny is older than Jenny."
        If Danny is the same age as Jenny, then ouput "Danny is the same age as Jenny."
        If Danny is the same age as Claire, then output "Danny is the same age as Claire."
         */


        int jenny = 14;
        int danny = 6;
        int claire = 6;

        if(jenny > danny) System.out.println("Jenny is older than Danny.");
        if(danny > jenny) System.out.println("Danny is older than Jenny.");
        if(danny == jenny) System.out.println("Danny is the same age as Jenny.");
        if(danny == claire) System.out.println("Danny is the same age as Claire.");

        //2.
        /*

        Car 1 has mileage 86000. Car 2 har mileage 101000.

        Write a program that uses IF statements to evaluate the output the following:

        If Car 1 mileage is less than or equal to car 2, then output, "Car 1 mileage is less than or equal to car 2"
        If Car 2 has mileage of 101000, then output "Car 2 has mileage of 101000."
        If Car 2 has mileage less than car 1, then output "I will eat my foot if this prints"
         */

        int car1 = 86000;
        int car2 = 101000;

        if(car1 <= car2) System.out.println("\nCar 1 mileage is less than or equal to car 2");
        if(car2 == 101000) System.out.println("Car 2 has mileage of 101000");
        if(car2 < car1) System.out.println("Eatin foot if true");
    }
}
