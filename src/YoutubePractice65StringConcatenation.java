public class YoutubePractice65StringConcatenation {

    public static void main(String[] args){
        String firstName = "Sini";
        String lastName = "Teezy";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        /*
        Exercise
        1.
        Create four strings.
        The first should contain the text "The itsy bitsy spider"
        The second should contain " climbed up the water spout."
        The third should contain " Down came the rain, "
        The fourth should contain " and washed the spider out."

        Concatenate (combine) the 1st and 2nd strings and store in a fifth string.
        Concatenate (combine) the 3rd and 4th strings and store a sixth string.

        Print out string #5 and #6 using two println() statements. The final output is:

        The itsy bitsy spider climbed up the water sprout.
        Down came the rain, and washed the spider out.
         */

        String spiderOne = "The itsy bitsy spider";
        String spiderTwo = " climbed up the water spout.";
        String spiderThree = "Down came the rain";
        String spiderFour = " and washed the spider out.";

        String fifthString = spiderOne + spiderTwo;
        String sixthString = spiderThree + spiderFour;

        System.out.println(fifthString);
        System.out.println(sixthString);
    }
}
