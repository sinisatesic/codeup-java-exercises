public class YoutubePractice14BooleanType {

    public static void main(String[] args) {
        boolean var = 15 > 7;

        if (var == true) {
            System.out.println("Value of var is equal to " + var);
        }

        /*
        1.
        Creat a boolean variable call "bool".
        Assign a value of true to this variable. If bool is equal to true
        then output the following to the screen 4 times using a loop.
        Make sure to pass the bool variable to the println() statement
        to print to the screen.

        The value of the variable is true
        The value of the variable is true
        The value of the variable is true
        The value of the variable is true

        Change the value of bool from true to false and then run program again.

         */

        boolean bool = true;
        int i;

        for(i = 1; i <= 4; i++){
            if(bool == true){
                System.out.println("The value of the variable is " + bool);
            }
        }
    }
}
