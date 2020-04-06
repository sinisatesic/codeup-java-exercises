public class YoutubePractice70SearchingStringForSubstring {

    public static void main(String[] args){
        String sini = "I love going to the grocery store";
        //each separate sequence of characters (or sequences in them) are substrings

        System.out.println(sini);
        System.out.println(sini.indexOf("grocery"));
        //will return index start of above substring

        System.out.println(sini.indexOf("love"));

        System.out.println(sini.indexOf("ing t"));

        //note: return of -1 represents non existing substring

        /*
        Exercise 1.
        Create four strings, exactly as shown below.

        The first should contain the text "living zebras"
        The second should contain "juicy oranges"
        The third should contain "do the victory dance"
        The fourth should contain "tusk of an elephant"

        Print all four strings to the screen, THEN:
        Search the 1st string for the substring "zebras" and print its index to the screen.
        Search the 2nd string for the substring "or" and print its index to the screen.
        Search the 3rd string for the substring "dan" and print its index to the screen.
        Search the 4th string for the substring "of an" and print its index to the screen.
         */

        String one = "living zebras";
        String two = "juicy oranges";
        String three = "do the victory dance";
        String four = "tusk of an elephant";

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println();

        System.out.println(one.indexOf("zebras"));
        System.out.println(two.indexOf("or"));
        System.out.println(three.indexOf("dan"));
        System.out.println(four.indexOf("of an"));
    }
}
