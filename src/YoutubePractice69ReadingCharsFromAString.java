public class YoutubePractice69ReadingCharsFromAString {

    public static void main(String[] args) {
        //how to extract a char from a string

        String favoriteMeal = "lasagna";
        String favoriteDrink = "I like a da peach soda";

        System.out.println(favoriteMeal);
        System.out.println(favoriteDrink);
        System.out.println();

        System.out.println(favoriteMeal.charAt(5));
        System.out.println(favoriteDrink.charAt(0));

        //to individually print out each char of full string:
        for (int i = 0; i <= favoriteDrink.length() - 1; i++) {
            System.out.println(favoriteDrink.charAt(i));
        }

        System.out.println();

        char sini = favoriteMeal.charAt(2);
        System.out.println("Index 2 char in favoriteMeal string is: " + sini);

    /*
    Exercise 1.
    Create four strings, exactly as shown below.

    The first should contain the text "living zebras"
    The second should contain "Juicy oranges"
    The third should contain "do the victory dance"
    The fourth should contain "tusk of an elephant"

    Print all four strings to the screen, then:
    Read the 1st character from the 1st string and print the character
    Read the 7th character from the 2nd string and print the character
    Read the 8th character from the 3rd string and print the character
    Read the 12th character from the 4th string and print the character
     */

        String first = "living zebras";
        String second = "Juicy oranges";
        String third = "do the victory dance";
        String fourth = "tusk of an elephant";

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println();

        System.out.println(first.charAt(0));
        System.out.println(second.charAt(6));
        System.out.println(third.charAt(7));
        System.out.println(fourth.charAt(11));

    }
}
