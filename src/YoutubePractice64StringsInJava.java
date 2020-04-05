public class YoutubePractice64StringsInJava {

    public static void main(String[] args){
        //strings are objects in Java
        String str = new String("One two tree");
        String second = new String("another one");

        String third = "Better way to create strings";

        String wazzup = "091850918";

        System.out.println(str);
        System.out.println(second);
        System.out.println(third);
        System.out.println(wazzup);

        System.out.println(str + " " + second);

        /*
        Exercise
        1.
        Create four strings.
        The first should contain the text "Roses are red,"
        The second should contain " violets are blue."
        The third should contain " Sugar is sweet, "
        The fourth should contain " and I love you."

        Print ou the rhyme using a single println() statement that uses all
        four strings defined above.
         */

        String roses = "Roses are red,";
        String violets = " violets are blue.";
        String sugar = " Sugar is sweet,";
        String love = " and I love you.";
        System.out.println(roses + violets + sugar + love);
    }
}
