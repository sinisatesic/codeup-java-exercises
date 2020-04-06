public class YoutubePractice72SearchingStringFromEndForSubstring {

    public static void main(String[] args){
        String sini = "I love to go grocery shopping to get food";

        System.out.println(sini);

        System.out.println(sini.indexOf("to"));
        //regular indexOf starts at beginning of string
        System.out.println(sini.lastIndexOf("to"));
        //lastIndexOf will search for substring but starting from end of string, but still provides index starting from zero at beginning

        /*
        Exercise 1:
        Create a string that holds the following:
        "Shelly sells sea shells down by the sea shore."

        Search this string for the word "sea" and report the index of the
        last match for this substring. Print the index to the screen.
         */

        String shells = "Shelly sells sea shells down by the sea shore.";
        System.out.println(shells.lastIndexOf("sea"));
    }
}
