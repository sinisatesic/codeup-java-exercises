public class YoutubePractice74ChangingStringLowercaseUppercase {

    public static void main(String[] args){
        String input1 = "YARP YARP YARP";

        System.out.println(input1);
        System.out.println(input1.toLowerCase());

        System.out.println(input1.toUpperCase());

        /*
        Exercise 1:
        Create a string named password and store this inside:
        "apples".

        Create a new string named passwordTypedIn that holds
        the phrase "APPLES". This represents what a user typed
        in for the password (they forgot the caps lock on).

        Convert this to lower case and use an IF statement such that if the password is valid, a "password accepted" message is shown
        on the screen.
         */

        String password = "apples";
        String passwordTypedIn = "APPLES";

        String lowercase = passwordTypedIn.toLowerCase();

        if(lowercase.equals(password) == true){
            System.out.println("Password correct");
        }
    }
}
