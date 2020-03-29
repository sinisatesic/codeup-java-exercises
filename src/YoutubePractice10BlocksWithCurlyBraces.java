public class YoutubePractice10BlocksWithCurlyBraces {

    public static void main(String[] args){
        int i;
        int square;
        int cubed;

        for(i = 1; i <= 10; i++){
            square = i * i;
            cubed = i * i * i;
            System.out.println("i is equal to " + i + ", and i squared is equal to " + square + "\n");
            System.out.println("\ti cubed is " + cubed + "\n");
        }

        int a = 4;

        if(a == 4){
            a = a + 5;
            System.out.println("a was equal to 4, but now it's " + a);
        }

        if(a == 10){
            a = a + 10;
            System.out.println("a was equal to 10, now it's " + a);
        }
    //1.
    /*
    Assign a variable called "age" the value of 35;
    Using if-else statements, do the following:

    If the age is greater than or equal to 30,
    then output the following using separate println() statements:

        I'm greater than 30 years

    If the age is less than 30 then output:

        I'm less age than 30 years

        run this program at following ages: 35, 25, 30.
     */

        int age = 35;
        age = 25;
        age = 30;
        if(age >= 30){
            System.out.println("I'm greater than 30 years");
        } else {
            System.out.println("I'm less age than 30 years");
        }



        //2.
        /*
        Write  a program that converts inches to feet. Start at 1 inch and continue
        int he pattern 1 inch, 2 inches, 3 inches, 4 inches ... 20 inches. The output
        should look like:

        1 inches is equal to <answer> feet.
        2 inches is equal to <answer> feet.
        3 inches is equal to <answer> feet.
        4 inches is equal to <answer> feet.

        5 inches is equal to <answer> feet.
        <continue converting and printing up to 20 inches>

        Note: There is a blank line inserted after every 4th printed entry
         */


        int inches;
        double feet;

        for(inches = 1; inches <= 20; inches++){
           feet = inches / 12.0;
            if(inches % 4 == 0){
                System.out.println(inches + " inches is equal to " + feet + " feet\n");
            } else if (inches == 1){
                System.out.println(inches + " inch is equal to " + feet + " feet");
            } else {
                System.out.println(inches + " inches is equal to " + feet + " feet");
            }
        }
    }

}
