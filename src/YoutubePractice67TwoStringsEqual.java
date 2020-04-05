public class YoutubePractice67TwoStringsEqual {

    public static void main(String[] args) {
        String fullName = "Sinisa Tesic";
        String userInput = "sinisa tesic";

        System.out.println(fullName + "\n" + userInput);
        System.out.println();

        System.out.println("Are these strings equal? " + fullName.equals(userInput));

        System.out.println();
        System.out.println("Are these strings equal? " + fullName.equalsIgnoreCase(userInput));



        /*
        Exercise 1
        Create four strings, exactly as shown below, including capital letters.

        The first should contain the text "Lou, Lou, skip to my Lou"
        The second should contain "Lou, Lou, skip to my Lou"
        The third should contain "lou, lou, skip to my lou"
        The fourth should contain "Skip to my Lou, my darlin!"

        Print the song to the screen, THEN:
        Compare string 1 with string 2 and print to the screen whether they are equal.

        Compare string 1 with string 3 and print to the screen whether they are equal.

        Compare string 1 with string 4 and print to the screen whether they are equal.
         */

        String songStringOne = "Lou, Lou, skip to my Lou";
        String songStringTwo = "Lou, Lou, skip to my Lou";
        String songStringThree = "lou, lou, skip to my lou";
        String songStringFour = "Skip to my Lou, my darlin!";

        System.out.println(songStringOne + songStringTwo + songStringThree + songStringFour);

        System.out.println(songStringOne.equals(songStringTwo));
        System.out.println(songStringOne.equals(songStringThree));
        System.out.println(songStringOne.equals(songStringFour));

    }
}
